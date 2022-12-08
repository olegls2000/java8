package com.lesson22;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Lesson22 {
  public static void main(String[] args) throws SQLException {
    final List<Country> countries = new ArrayList<>();
    final String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
    final String username = "admin";
    final String password = "admin";
    final Connection connection = DriverManager.getConnection(url, username, password);
    final Statement statement = connection.createStatement();
    final String selectAllCountries = "SELECT * FROM country";
    final ResultSet resultSet = statement.executeQuery(selectAllCountries);

    while (resultSet.next()) {
      countries.add(Country.builder()
          .id(resultSet.getLong("id"))
          .name(resultSet.getString("name"))
          .population(resultSet.getLong("population"))
          .build());
    }
    System.out.println(countries);
  }
}
