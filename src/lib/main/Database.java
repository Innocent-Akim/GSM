/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class Database {

    private static Connection connection;
    public static ResultSet resultSet;
    public static PreparedStatement preparedStatement;

    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardanosummit", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void dbConnect() {
        if (connection == null) {
            new Database();
            System.out.println("Connection retablir");
        } else {
            System.out.println("La Connection exister !!!");
        }

    }
}
