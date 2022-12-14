package com.lesson22;


import com.dao.CrudDao;
import com.daojdbc.CountryCrudDao;
import com.entity.Country;
import java.util.List;

public class Lesson22 {
  public static void main(String[] args) {
    final CrudDao countryDao = new CountryCrudDao();
    final List<Country> countries = countryDao.selectAll();
    System.out.println(countries);
  }
}
