package DesktopAplication.predavanje3.gui;

import DesktopAplication.predavanje3.dao.ShowDao;
import DesktopAplication.predavanje3.model.Show;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

/**
 * List<Show>  ----- MODEL ---- JTable
 */
public class ShowPanel extends JPanel {


    private final ShowDao showDao;

    public ShowPanel(ShowDao showDao) {
        this.showDao = showDao;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JTable showTable = new JTable();
        Vector<String> columnNames = createColumnNames();
        Vector<Vector<Object>> tableData = createTableData();
        ShowModel showModel = new ShowModel(columnNames, tableData);
        showTable.setModel(showModel);
        add(new JScrollPane(showTable));
    }

    private Vector<String> createColumnNames() {
        /*columnNames.add("Show ID");
        columnNames.add("Title");
        columnNames.add("Number of seasons");
        columnNames.add("Year");*/
        return showDao.getColumnNames();
    }

    private Vector<Vector<Object>> createTableData() {
        Vector<Vector<Object>> tableData = new Vector<Vector<Object>>();
        try {
            List<Show> showList = showDao.retrieveAll();
            for (Show show : showList) {
                Vector<Object> rowData = new Vector<>();
                rowData.addElement(show.getActorID());//0 showId
                rowData.addElement(show.getFirstName());//1 showTitle
                rowData.addElement(show.getLastName());
                rowData.addElement(show.getLastUpdate());
                tableData.addElement(rowData);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tableData;
    }


    private class ShowModel extends AbstractTableModel {

        private final Vector<String> columnNames;
        private final Vector<Vector<Object>> tableData;

        public ShowModel(Vector<String> columnNames, Vector<Vector<Object>> tableData) {
            this.columnNames = columnNames;
            this.tableData = tableData;
        }


        @Override
        public int getRowCount() {
            return tableData.size();
        }

        @Override
        public int getColumnCount() {
            return columnNames.size();
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Vector<Object> rowData = tableData.get(rowIndex);
            Object value = rowData.get(columnIndex);
            System.out.println(value);
            return value;
        }

        @Override
        public String getColumnName(int column) {
            return columnNames.get(column);
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return columnIndex == 1;
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            Vector<Object> rowData = tableData.get(rowIndex);
            rowData.remove(columnIndex);
            rowData.add(columnIndex, aValue);
            fireTableCellUpdated(rowIndex, columnIndex);
            int actorID = (int) rowData.get(0);
            String firstName = (String) aValue;
            try {
                Show show = showDao.retrieve(actorID);
                show.setFirstName(firstName);
                showDao.update(show);
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}