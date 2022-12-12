package com.lesson23;

import com.entity.Address;
import com.entity.Country;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Lesson23 {
  public static void main(String[] args) throws Exception {
    final List<Address> addresses = new ArrayList<>();
    final String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
    final String username = "admin";
    final String password = "admin";
    final Connection connection = DriverManager.getConnection(url, username, password);
    final Statement statement = connection.createStatement();
    final String selectAllFromAddress = "SELECT * FROM address";
    final ResultSet resultSet = statement.executeQuery(selectAllFromAddress);
    while (resultSet.next()) {
      final Long id = resultSet.getLong("id");
      final String city = resultSet.getString("city");
      final String street = resultSet.getString("street");
      final String house = resultSet.getString("house");
      final Integer zip = resultSet.getInt("zip");
      final Long countryId = resultSet.getLong("country_id");
      final Address  address = new Address();
      address.setId(id);
      address.setCity(city);
      address.setStreet(street);
      address.setHouse(house);
      address.setZip(zip);
      address.setCountryId(countryId);
      addresses.add(address);
    }
    System.out.println(addresses);
  }
}
