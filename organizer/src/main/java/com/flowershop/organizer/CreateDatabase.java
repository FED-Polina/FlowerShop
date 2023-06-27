package com.flowershop.organizer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            // Подключение к базе данных SQLite
            connection = DriverManager.getConnection("jdbc:sqlite:products.db");
            statement = connection.createStatement();

            // Создание таблицы товаров
            String createTableQuery = "CREATE TABLE IF NOT EXISTS products (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT NOT NULL" +
                    "description TEXT NOT NULL" +
                    "picture BLOB NOT NULL" +
                    ")";
            statement.executeUpdate(createTableQuery);

            System.out.println("Таблица товаров успешно создана!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

