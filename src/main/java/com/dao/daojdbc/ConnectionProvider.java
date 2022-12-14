package com.dao.daojdbc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConnectionProvider {

    public static final String BD_URL = "db.url";
    public static final String BD_USER = "db.user";
    public static final String BD_PASSWORD = "db.password";

    public Properties getConnectionProperties() {
        try (
                final InputStream inputStream =
                        ConnectionProvider.class.getClassLoader()
                                .getResourceAsStream("database.properties")
        ) {
            final Properties dbProperties = new Properties();
            dbProperties.load(inputStream);
            return dbProperties;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}