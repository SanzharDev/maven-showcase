package hello;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HelloAlem {
  public static void main(String[] args) {
    List<Store> result = new ArrayList<>();

    String SQL_SELECT = "select * from store";

    // auto close connection and preparedStatement
    try (Connection conn = DriverManager.getConnection(
      "jdbc:postgresql://127.0.0.1:5432/test", "postgres", "postgrespw");
         PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {

      ResultSet resultSet = preparedStatement.executeQuery();

      while (resultSet.next()) {

        long id = resultSet.getLong("id");
        String name = resultSet.getString("name");
        String address = resultSet.getString("address");

        Store obj = new Store();
        obj.setId(id);
        obj.setName(name);
        obj.setAddress(address);

        result.add(obj);
      }
      result.forEach(x -> System.out.println(x));

    } catch (SQLException e) {
      System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}