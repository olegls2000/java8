package com.lesson23;

import com.dao.jdbc.AddressCrudDao;
import com.dao.jdbc.CountryCrudDao;
import com.entity.Address;

import java.util.List;

public class Lesson23 {
  public static void main(String[] args) {
    final var addressCrudDao = new AddressCrudDao();
    final var countryCrudDao = new CountryCrudDao();
    final var addresses = addressCrudDao.selectAll();
    System.out.println(addresses);

/*    System.out.println(countryCrudDao.selectAll());
    countryCrudDao.create(Country.builder()
        .name("Montenegro")
        .population(1_800_000l)
        .build());
    System.out.println(countryCrudDao.selectAll());*/

    final List<Address> addressesByCity = addressCrudDao.getAddressByCity("Helsinki");
    System.out.println("SQL INJECTION RESULT: ");
    System.out.println("Address by city: "+ addressesByCity);

    //countryCrudDao.delete(Country.builder().id(11l).build());

  }
}
