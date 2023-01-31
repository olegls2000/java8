package com.dao.jdbc;

import com.dao.CrudDao;
import com.entity.Country;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.dao.jdbc.ConnectionProvider.*;

public class CountryCrudDao implements CrudDao<Country> {
  private ConnectionProvider connectionProvider
      = ConnectionProvider.getInstance();

  @Override
  public List<Country> selectAll() {
    final List<Country> countries = new ArrayList<>();
    final String url = connectionProvider.getConnectionProperties().getProperty(BD_URL);
    final String username = connectionProvider.getConnectionProperties().getProperty(BD_USER);
    final String password = connectionProvider.getConnectionProperties().getProperty(BD_PASSWORD);
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
    final String url = connectionProvider
        .getConnectionProperties().getProperty(BD_URL);
    final String username = connectionProvider
        .getConnectionProperties().getProperty(BD_USER);
    final String password = connectionProvider
        .getConnectionProperties().getProperty(BD_PASSWORD);
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
    final String url = connectionProvider
        .getConnectionProperties().getProperty(BD_URL);
    final String username = connectionProvider
        .getConnectionProperties().getProperty(BD_USER);
    final String password = connectionProvider
        .getConnectionProperties().getProperty(BD_PASSWORD);
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
