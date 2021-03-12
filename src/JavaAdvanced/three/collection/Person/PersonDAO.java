package JavaAdvanced.three.collection.Person;

import JavaAdvanced.four.DAO;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * KAKO implementirati u Javi ono što ste naučili na SQL
 * <p>Tri su koraka</p>
 * <li>1. Connection connection -> DriverManager</li>
 * <li>2. Statement, PreparedStatement statement -> connection</li>
 * <li>3. ResultSet resultSet -> koji ima podatke</li>
 */

public class PersonDAO implements DAO<Person> {

    static final String URL = "jdbc:mysql://localhost:3306/person?useSSL=false";
    static final String USERNAME = "root";
    static final String PASSWORD = "Password";


    @Override
    public void create(Person record) {

    }

    @Override
    public Person update(Person person) {

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement("UPDATE person SET surname=? WHERE id=?");) {
            preparedStatement.setString(1, person.getSurname());
            preparedStatement.setInt(2, person.getId());
            int rows = preparedStatement.executeUpdate();
            System.out.println("Izmijeneno redova: " + rows);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return null;
    }
        @Override
        public void delete(Person record) {

        }

        @Override
        public Person retrieve(int id) {
            try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                 Statement statement = connection.createStatement();
            ) {
                String sqlStatement  = "SELECT * FROM person WHERE id ="+id;
                ResultSet resultSet = statement.executeQuery(sqlStatement);
                Person person = new Person();
                while(resultSet.next()){
                    person.setId(resultSet.getInt("id"));
                    person.setName(resultSet.getString(2));
                    person.setSurname(resultSet.getString("surname"));
                    Date birthday = resultSet.getDate("birthday");
                    LocalDate localDateBirthday = birthday.toLocalDate();
                    person.setBirthday(localDateBirthday);
                    String spol = resultSet.getString("gender");
                    person.setGender(spol.equals("MALE") ? gender.MALE : gender.Female);
                    break;
                }
                return person;
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
            return null;
        }

    @Override
    public List<Person> retrieveAll() {
        //prazna
        List<Person> personList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement();) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM person;");
            //IŠČUPATI PODATKE IZ ResultSet
            while (resultSet.next()) {
                //resultSet -> amila
                //Martin Fowler FLUENT programming
                /*Person person1 = new Person()
                        .setId(resultSet.getInt("id"))
                        .setName(resultSet.getString(2))
                        .setSurname(resultSet.getString("surname"))
                        .setBirthday(resultSet.getDate("birthday").toLocalDate())
                        .setGender(resultSet.getString("gender").equals("MALE") ? Gender.MALE : Gender.FEMALE);
*/

                Person person = new Person();
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString(2));
                person.setSurname(resultSet.getString("surname"));
                Date birthday = resultSet.getDate("birthday");
                LocalDate localDateBirthday = birthday.toLocalDate();
                person.setBirthday(localDateBirthday);
                String spol = resultSet.getString("gender");
                person.setGender(spol.equals("MALE") ? gender.MALE : gender.Female);
                personList.add(person);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return personList;

    }
            }



    /*public void create(Person person) {
        //Kreira se veza sa bazom


    }

    public Person get(int id) {
        return null;
    }

    public void update(Person person) {

    }

    public void delete(Person person) {

    }

    public List<Person> getAll() {
       List<Person> personList = new ArrayList<>();
       Person dinodeletic = new Person("Dino","Dinic", LocalDate.of(1995,1,5));
       personList.add(new Person("Dino","Dinic", LocalDate.of(1995,1,5)));
        personList.add(new Person("Amer","Jahjefendic", LocalDate.of(1982,3,6)));
        personList.add(new Person("Armin","Hadžić", LocalDate.of(1991,3,9)));
        personList.add(new Person("Amila","Hasović", LocalDate.of(1990,10,5)));
        personList.add(new Person("Mitar","Dinic", LocalDate.of(2000,7,4)));
        personList.add(new Person("Dino","Haskić", LocalDate.of(1995,5,15)));
        personList.add(new Person("Benjamin","Knežević", LocalDate.of(2000,2,29)));
        personList.add(new Person("Aida","Buza", LocalDate.of(1997,3,25)));
        return personList;
    }*/

