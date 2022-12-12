package com.dao;

import java.util.List;

public interface CrudDao<T> {
  List<T> selectAll();
  void create(T objectToInsert);
  void delete(T toDelete);
}
