package com.daojdbc;

import com.dao.CrudDao;
import com.entity.Address;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.daojdbc.ConnectionProvider.BD_URL;
import static com.daojdbc.ConnectionProvider.BD_USER;

public class AddressCrudDao implements CrudDao<Address> {
    private ConnectionProvider connectionProvider = new ConnectionProvider();

    @Override
    public List<Address> selectAll() {
        final String url = connectionProvider.getConnectionProperties().getProperty(BD_URL);
        final String username = connectionProvider.getConnectionProperties().getProperty(BD_USER);
        final String password = connectionProvider.getConnectionProperties().getProperty(BD_PASSWORD);
        final List<Address> result = new ArrayList<>();
        final String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
        final String username = "postgres";
        final String password = "admin";
        final String selectAllQuery = "SELECT * FROM address";

        try (
                final var connection = DriverManager.getConnection(url, username, password);
                final var statement = connection.createStatement();
                final var resultSet = statement.executeQuery(selectAllQuery)
        ) {
            while (resultSet.next()) {
                result.add(Address.builder()
                        .id(resultSet.getLong("id"))
                        .city(resultSet.getString("city"))
                        .street(resultSet.getString("street"))
                        .house(resultSet.getString("house"))
                        .zip(resultSet.getInt("zip"))
                        .countryId(resultSet.getLong("country_id"))
                        .build());
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
        final String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
        final String username = "postgres";
        final String password = "admin";
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
                        .countryId(resultSet.getLong("country_id"))
                        .build());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
