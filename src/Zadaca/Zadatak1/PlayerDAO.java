package Zadaca.Zadatak1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO {


    static final String URL = "jdbc:mysql://localhost:3306/my_first_db?useSSL=false";
    static final String USERNAME = "root";
    static final String PASSWORD = "Password";

    public static PLayer insert(PLayer pLayer) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement prst = conn.prepareStatement
                     ("INSERT INTO hiscores(name,score) VALUES(?,?)")) {


            //prst.setInt(1, pLayer.getId());
            prst.setString(1, pLayer.getName());
            prst.setInt(2, pLayer.getScore());
            int a = prst.executeUpdate();
            if (a > 0) {
                System.out.println("Unos uspjesan");
            }

        } catch (SQLException s) {
            System.err.println(s.getMessage());
        }
        return null;

    }
    public static List<PLayer> retreiveAll() {

        List<PLayer> pLayerList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM hiscores");

            while (resultSet.next()) {
                PLayer pLayer = new PLayer();
                pLayer.setId(resultSet.getInt("id"));
                pLayer.setName(resultSet.getString(2));
                pLayer.setScore(resultSet.getInt(3));
                pLayerList.add(pLayer);


            }
        } catch (SQLException s) {
            System.err.println(s.getMessage());
        }
        return pLayerList;

    }
}

/* ResultSet tabela = st.executeQuery("SELECT * FROM hiscores");
        if (tabela.next()) {
        System.out.println("player name\tscore");
        System.out.println(tabela.getString("name") + "\t     " + tabela.getString("score"));*/

//Unos u mysql moze ici bez resultSet dok za citanje mora se koristiti
            /*st.executeUpdate("Insert into hiscores(name, score) values ('player1', 25)");
            System.out.println("Score successfully inserted");*/