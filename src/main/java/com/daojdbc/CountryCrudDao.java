package com.daojdbc;

import com.dao.CrudDao;
import com.entity.Country;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CountryCrudDao implements CrudDao<Country> {
  @Override
  public List<Country> selectAll() {
    final List<Country> countries = new ArrayList<>();
    final String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
    final String username = "postgres";
    final String password = "admin";
    final String selectAllCountries = "SELECT * FROM country";

    try (
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectAllCountries)
    ) {
      while (resultSet.next()) {
        countries.add(Country.builder()
            .id(resultSet.getLong("id"))
            .name(resultSet.getString("name"))
            .population(resultSet.getLong("population"))
            .build());
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return countries;
  }

  @Override
  public void create(Country objectToInsert) {
    final String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
    final String username = "postgres";
    final String password = "admin";
    final var insertQuery =
        String.format("insert into country (name, population) values('%s', %d)",
            objectToInsert.getName(), objectToInsert.getPopulation());
    try (
        final var connection = DriverManager.getConnection(url, username, password);
        final var statement = connection.createStatement();
    ) {
      int affectedRows = statement.executeUpdate(insertQuery);
      System.out.println(affectedRows + " rows were affected");
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
  }

  @Override
  public void delete(Country toDelete) {
    final String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
    final String username = "postgres";
    final String password = "admin";
    try (
        final var connection = DriverManager.getConnection(url, username, password);
        final var statement =
            connection.prepareStatement("delete from country where id = ?");
    ) {
      statement.setLong(1, toDelete.getId());
      int affectedRows = statement.executeUpdate();
      System.out.println(affectedRows + " rows were affected");
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
  }


}
