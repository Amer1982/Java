package Vjezba.PovezivanjeSaBazom;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
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
    public void create(Person person) {

    }

    //RETREIVE
    public Person get(int id) {
        return null;
    }

    //UPDATE
    public void update(Person person) {

    }

    //DELETE
    public void delete(Person person) {

    }

    public List<Person> retreiveAll() {
        //dohvatiti zapise iz tabele
        //SELECT * FROM Person -> RDBMS -> RESULT SET
        List<Person> personList = new ArrayList<>();
        try (Connection connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = (Statement) connection.createStatement();) {
             ResultSet resultSet = statement.executeQuery("SELECT * FROM person.person");

            while (resultSet.next()) {
                Person person = new Person();
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString(2));
                person.setSurname(resultSet.getString("surname"));
                Date birthday = resultSet.getDate("birthday");
                LocalDate localDateBirthday = ((java.sql.Date) birthday).toLocalDate();
                person.setBirthday(localDateBirthday);
                String spol = resultSet.getString("gender");
                person.setGender(spol.equals("MALE")?Gender.MALE: Gender.FEMALE);
                personList.add(person);


            }
        } catch (SQLException s) {
            System.err.println(s.getMessage());
        }
        return personList;
    }
}
