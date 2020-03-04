package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(("jdbc:sqlite:C:\\Users\\Shikhar Panwar\\Documents\\Programming" +
                    "\\Java\\TestDB\\testdbinjava.db"));

            Statement statement = conn.createStatement();
        } catch(SQLException e){
            System.out.println("Something went wrong");
        }
    }
}
