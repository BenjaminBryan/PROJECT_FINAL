package sample;

/*
Author-- Magd

 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class sqlConnection {

    public static void sqlconnection(String[]args){

    }//end main method bracket

    public static double RetrieveItem() { //returns the price for price calculations
        try{
            Scanner In= new Scanner(System.in);


            System.out.print("Insert Item ID:");
            int ID= In.nextInt();

            int out;
            double outP =0;
            String name;

            /*accepts connection string and returns a connection instance.
             */
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Database.db");
            PreparedStatement ret;
            ResultSet rs;

            ret = conn.prepareStatement("SELECT * FROM Inventory");
            rs = ret.executeQuery();
            /* we must close the statement and the connection as well.
             */
            while (rs.next()) {               // Position the cursor
                out = rs.getInt(1);      // Retrieve the first column value
                name = rs.getString(3);
                outP = rs.getDouble(2);      // Retrieve the first column value
                System.out.println("Item ID = " + out +
                        "\nItem Name = " + name + "\nPrice = " +out); // Print the column values

            }
            rs.close();
            conn.close();


            return outP;
        }catch (SQLException e){

            System.out.println("Something went wrong: " + e.getMessage());
        }//end catch bracket
        return 0;
    }

    public static void RemoveInventory() {
        try{
            Scanner In= new Scanner(System.in);


            System.out.print("Insert Item ID:");
            int ID= In.nextInt();


            /*accepts connection string and returns a connection instance.
             */
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Database.db");

            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS Inventory (ID INTEGER, Price REAL, Name TEXT)");
            statement.execute("DELETE FROM Inventory WHERE ID="+ID+"");
            /* we must close the statement and the connection as well.
             */
            statement.close();
            conn.close();

        }catch (SQLException e){

            System.out.println("Something went wrong: " + e.getMessage());
        }//end catch bracket
    }

    public static void AddInventory() {
        try{
            Scanner In= new Scanner(System.in);

            System.out.print("Insert Item Name:");
            String Name = In.nextLine();
            System.out.print("Insert Item Price:");
            Double Price = In.nextDouble() ;
            System.out.print("Insert Item ID:");
            int ID= In.nextInt();


            /*accepts connection string and returns a connection instance.
             */
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Database.db");


            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS Inventory (ID INTEGER, Price REAL, Name TEXT)");
            statement.execute("INSERT INTO Inventory (ID, Price, Name) VALUES ("+ ID +",'"+Price+"','"+Name+"')");

            statement.close();
            conn.close();

        }catch (SQLException e){

            System.out.println("Something went wrong: " + e.getMessage());
        }//end catch bracket
    }

}//end main class bracket