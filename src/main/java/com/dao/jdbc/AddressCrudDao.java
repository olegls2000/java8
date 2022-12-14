package com.dao.jdbc;

import static com.dao.jdbc.ConnectionProvider.BD_PASSWORD;
import static com.dao.jdbc.ConnectionProvider.BD_URL;
import static com.dao.jdbc.ConnectionProvider.BD_USER;

import com.dao.CrudDao;
import com.entity.Address;
import com.entity.Country;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddressCrudDao implements CrudDao<Address> {

  private ConnectionProvider connectionProvider
      = ConnectionProvider.getInstance();

  @Override
  public List<Address> selectAll() {
    final List<Address> result = new ArrayList<>();
    final String url = connectionProvider
        .getConnectionProperties().getProperty(BD_URL);
    final String username = connectionProvider
        .getConnectionProperties().getProperty(BD_USER);
    final String password = connectionProvider
        .getConnectionProperties().getProperty(BD_PASSWORD);
    final String selectAllQuery =
        "select * from address ad LEFT JOIN country co ON ad.country_id = co.id";

    try (
        final var connection = DriverManager.getConnection(url, username, password);
        final var statement = connection.createStatement();
        final var resultSet = statement.executeQuery(selectAllQuery)
    ) {
      while (resultSet.next()) {
        /*final Country country = Country.builder()
            .id(resultSet.getLong(7))
            .name(resultSet.getString(8))
            .population(resultSet.getLong(9))
            .build();*/

        final Address address = null;/*Address.builder()
            .id(resultSet.getLong(1))
            .city(resultSet.getString("city"))
            .street(resultSet.getString("street"))
            .house(resultSet.getString("house"))
            .zip(resultSet.getInt("zip"))
            .country(country)
            .build();*/
        result.add(address);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return result;
  }

  @Override
  public void create(Address objectToInsert) {
    //TODO at home..
  }

  @Override
  public void delete(Address toDelete) {
    //TODO at home..
  }

  public List<Address> getAddressByCity(final String city) {
    final List<Address> result = new ArrayList<>();
    final String url = connectionProvider
        .getConnectionProperties().getProperty(BD_URL);
    final String username = connectionProvider
        .getConnectionProperties().getProperty(BD_USER);
    final String password = connectionProvider
        .getConnectionProperties().getProperty(BD_PASSWORD);
    final String selectAllQuery = "SELECT * FROM address where city = ?";
    try (
        final var connection = DriverManager.getConnection(url, username, password);
        final var statement = connection.prepareStatement(selectAllQuery);
    ) {
      statement.setString(1, city);
      final var resultSet = statement.executeQuery();
      while (resultSet.next()) {
        result.add(Address.builder()
            .id(resultSet.getLong("id"))
            .city(resultSet.getString("city"))
            .street(resultSet.getString("street"))
            .house(resultSet.getString("house"))
            .zip(resultSet.getInt("zip"))
            //.countryId(resultSet.getLong("country_id"))
            .build());
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return result;
  }
}
