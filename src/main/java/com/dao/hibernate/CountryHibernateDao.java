package com.dao.hibernate;

import com.dao.CrudDao;
import com.entity.Country;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CountryHibernateDao implements CrudDao<Country> {

  private static Session getCurrentSessionFromConfig() {
    Configuration config = new Configuration();
    config.configure();
    SessionFactory sessionFactory = config.buildSessionFactory();
    Session session = sessionFactory.openSession();
    return session;
  }

  @Override
  public List<Country> selectAll() {
    Session session = getCurrentSessionFromConfig();
    String selectAllQuery = "select co from Country co";
    return session.createQuery(selectAllQuery, Country.class).getResultList();
  }

  @Override
  public void create(Country objectToInsert) {
    Session session = getCurrentSessionFromConfig();
    session.beginTransaction();
    session.save(objectToInsert);
    session.getTransaction().commit();
  }

  @Override
  public void delete(Country toDelete) {
  }
}
