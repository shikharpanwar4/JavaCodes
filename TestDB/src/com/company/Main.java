package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try{
            Connection conn = DriverManager.getConnection(("jdbc:sqlite:C:\\Users\\Shikhar Panwar\\Documents\\Programming" +
                "\\Java\\TestDB\\testjava.db"));
            //conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts" +
                    "(name TEXT, phone INTEGER, email TEXT)");
            statement.execute("Insert into contacts values('Amit', 2341476, 'amit01@gmail.com')");
            statement.execute("Insert into contacts values('Sonu', 8349289, 'sonu.11@gmail.com')");
            statement.execute("Insert into contacts values('John', 9678096, 'johnd@tmail.com')");
            statement.execute("Insert into contacts values('Surya', 4809535, 'surya67@fmail.com')");

            statement.execute("Select * from contacts");
            ResultSet results = statement.getResultSet();
            while(results.next()){
                System.out.println(results.getString("name") + " " +
                        results.getInt("phone") + " " +
                        results.getString("email"));
            }

            results.close();

            statement.close();
            conn.close();

        } catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
