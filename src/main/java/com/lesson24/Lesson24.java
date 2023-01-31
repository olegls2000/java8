package com.lesson24;

import com.dao.hibernate.CountryHibernateDao;
import com.entity.Country;

public class Lesson24 {
  public static void main(String[] args) {
    //final var addressDao = new AddressCrudDao();
    //System.out.println(addressDao.selectAll());

    final var hibernateCountryDao = new CountryHibernateDao();
    Country countryToSave = new Country();
    countryToSave.setName("UK");
    countryToSave.setPopulation(555_000_000l);

    hibernateCountryDao.create(countryToSave);

    System.out.println(hibernateCountryDao.selectAll());
  }
}
