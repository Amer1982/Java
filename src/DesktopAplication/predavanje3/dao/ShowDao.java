package DesktopAplication.predavanje3.dao;


import DesktopAplication.predavanje3.connection.ConnectionPool;
import DesktopAplication.predavanje3.model.Show;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ShowDao implements Dao<Show>{
    private final ConnectionPool connectionPool;

    public ShowDao(ConnectionPool connectionPool){
        this.connectionPool = connectionPool;
    }

    @Override
    public void create(Show entity) throws SQLException {

    }

    @Override
    public Show retrieve(int primaryKey) throws SQLException {
        String sqlQuery = "SELECT * FROM sakila.actor WHERE actor_id=?";
        Connection connection = connectionPool.getConnection();
        try(PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);){
            preparedStatement.setInt(1, primaryKey);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Show show = new Show();
                show.setActorId(resultSet.getInt(1));
                show.setFirstName(resultSet.getString(2));
                show.setLastName(resultSet.getString(3));
                show.setLastUpdate(resultSet.getInt(4));
                return show;
            }

        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        connectionPool.releaseConnection(connection);
        return null;
    }

    @Override
    public List<Show> retrieveAll() throws SQLException {
        List<Show> showList = new ArrayList<>();
        String sqlQuery = "SELECT *FROM actor";
        Connection connection = connectionPool.getConnection();
        try(PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();){
            while(resultSet.next()){
                Show show = new Show();
                show.setActorId(resultSet.getInt(1));
                show.setFirstName(resultSet.getString(2));
                show.setLastName(resultSet.getString(3));
                show.setLastUpdate(resultSet.getInt(4));
                showList.add(show);
            }
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        connectionPool.releaseConnection(connection);
        return showList;
    }

    @Override
    public void update(Show entity) throws SQLException {
        String sqlUpdate = "UPDATE actor SET first_name = ? WHERE actor_id = ?";
        Connection connection = connectionPool.getConnection();
        try(PreparedStatement ps = connection.prepareStatement(sqlUpdate);
        ){
            ps.setString(1, entity.getFirstName());
            ps.setInt(2, entity.getActorID());
            int count = ps.executeUpdate();
            System.out.println("Broj ažuriranih objekata je: " + count);
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        connectionPool.releaseConnection(connection);
    }

    @Override
    public void delete(Show entity) throws SQLException {

    }


    public Vector<String> getColumnNames(){
        Vector<String> columnNames = new Vector<>();
        String sqlQuery = "SELECT *FROM actor";
        Connection connection = connectionPool.getConnection();
        try(PreparedStatement ps = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = ps.executeQuery()){
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnNumbers = metaData.getColumnCount();
            for(int i = 1; i<=columnNumbers; i++){
                String columnName = metaData.getColumnName(i);
                columnNames.addElement(columnName);
            }
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return columnNames;
    }
}
