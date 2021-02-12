package Vjezba.PovezivanjeSaBazom;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonDao {

    static final String URL = "jdbc:mysql://localhost:3306/person?useSSL=false";
    static final String USERNAME = "root";
    static final String PASSWORD = "Password";


    //CREATE
    public void create(Person person) throws SQLException {
        try (java.sql.Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement
                     ("CREATE TABLE IF NOT EXISTS ?("+"ID int primary key auto_increment"+"name varchar(50)" +"score int"+")")) {
        }
    }


    //UPDATE
    public static Person update(Person person) {
        try (java.sql.Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement
                     ("UPDATE person.person SET surname=? WHERE id=?")) {
            preparedStatement.setString(1, person.getSurname());
            preparedStatement.setInt(2, person.getId());
            int rows = preparedStatement.executeUpdate();
            System.out.println("Izmjenjeno redova: " + rows);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return null;
    }

    //DELETE
    public void delete(Person person) {

    }

    public Person retreive(int id) {
        try (Connection connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = (Statement) connection.createStatement()) {
            String SQLStatement = "SELECT * FROM person WHERE id=" + id;
            ResultSet resultSet = statement.executeQuery(SQLStatement);
            Person person = new Person();
            while (resultSet.next()) {
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString(2));
                person.setSurname(resultSet.getString("surname"));
                Date birthday = resultSet.getDate("birthday");
                LocalDate localDateBirthday = ((java.sql.Date) birthday).toLocalDate();
                person.setBirthday(localDateBirthday);
                String spol = resultSet.getString("gender");
                person.setGender(spol.equals("MALE") ? Gender.MALE : Gender.FEMALE);
                break;
            }
            return person;

        } catch (SQLException throwables) {
            System.err.println(throwables.getMessage());
            ;
        }
        return null;
    }

    public List<Person> retreiveAll() {

        List<Person> personList = new ArrayList<>();
        try (Connection connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = (Statement) connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM person");

            while (resultSet.next()) {
                Person person = new Person();
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString(2));
                person.setSurname(resultSet.getString("surname"));
                Date birthday = resultSet.getDate("birthday");
                LocalDate localDateBirthday = ((java.sql.Date) birthday).toLocalDate();
                person.setBirthday(localDateBirthday);
                String spol = resultSet.getString("gender");
                person.setGender(spol.equals("MALE") ? Gender.MALE : Gender.FEMALE);
                personList.add(person);


            }
        } catch (SQLException s) {
            System.err.println(s.getMessage());
        }
        return personList;
    }
}
