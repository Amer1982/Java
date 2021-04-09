package DesktopAplication.predavanje3;

import DesktopAplication.predavanje3.connection.ConnectionPool;
import DesktopAplication.predavanje3.dao.ShowDao;
import DesktopAplication.predavanje3.gui.ShowPanel;

import javax.swing.*;
import java.sql.SQLException;

public class Executor {
    public static void main(String[] args) throws SQLException{

        SwingUtilities.invokeLater(Executor::createGUI);
    }


    static void createGUI(){
        try {
            System.out.println(Thread.currentThread());
            JFrame frame = new JFrame(" Shows from DATABASE");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            ConnectionPool connectionPool = new ConnectionPool();
            ShowDao showDao = new ShowDao(connectionPool);
            ShowPanel showPanel = new ShowPanel(showDao);
            frame.setContentPane(showPanel);
            frame.setSize(400, 300);
            frame.setVisible(true);
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}
