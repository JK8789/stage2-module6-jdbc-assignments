package jdbc;

import java.sql.SQLException;

public class CustomConnectorTest {
    public static void main(String[] args) throws SQLException {
        SimpleJDBCRepository simpleJDBCRepository = new SimpleJDBCRepository();
        User user = new User();
        user.setId(1L);
        user.setFirstName("Maxim");
        user.setLastName("Adams");
        user.setAge(22);
        //System.out.println("User was created. ID=" + simpleJDBCRepository.createUser());
        //simpleJDBCRepository.deleteUser(4L);
        //simpleJDBCRepository.findAllUser().forEach(System.out::println);
        //System.out.println(simpleJDBCRepository.findAllUser());
        //System.out.println(simpleJDBCRepository.findUserByName("Maxim").getLastName());
        //System.out.println(simpleJDBCRepository.findUserById(1L).getAge());
        //System.out.println(simpleJDBCRepository.updateUser(user).getId());

    }
}
