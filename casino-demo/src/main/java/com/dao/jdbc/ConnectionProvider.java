package com.dao.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConnectionProvider {
  public static final String BD_URL = "db.url";
  public static final String BD_USER = "db.user";
  public static final String BD_PASSWORD = "db.password";

  private Properties dbProperties = null;

  private ConnectionProvider (){
  }
  private static ConnectionProvider instance =
      new ConnectionProvider();
  public static ConnectionProvider getInstance(){
    return instance;
  }

  public Properties getConnectionProperties() {
    if (dbProperties == null) {
      try (
          final InputStream inputStream =
              ConnectionProvider.class.getClassLoader()
                  .getResourceAsStream("database.properties")
      ) {
        final Properties properties = new Properties();
        properties.load(inputStream);
        dbProperties = properties;
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return dbProperties;
  }
}
