package com.JDBC.JDBCTutorialUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTutorialUtilities {

    private Object userName;
    private Object password;
    private String dbms = "mysql";
    private String serverName;
    private String portNumber;
    Connection conn = null;

    public Connection getConnection() throws SQLException {

        Properties connectionProps = new Properties();
        connectionProps.put("user", this.userName);
        connectionProps.put("password", this.password);

        if (this.dbms.equals("mysql")) {
            conn = DriverManager.getConnection("jdbc:" + this.dbms + "://" + this.serverName + ":" + this.portNumber + "/", connectionProps);
        }
        System.out.println("Connected to database");
        return conn;
    }

    public static void printSQLException(SQLException ex) {

        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                if (ignoreSQLException(
                        ((SQLException)e).
                                getSQLState()) == false) {

                    e.printStackTrace(System.err);
                    System.err.println("SQLState: " + ((SQLException)e).getSQLState());

                    System.err.println("Error Code: " + ((SQLException)e).getErrorCode());

                    System.err.println("Message: " + e.getMessage());

                    Throwable t = ex.getCause();
                    while(t != null) {
                        System.out.println("Cause: " + t);
                        t = t.getCause();
                    }
                }
            }
        }
    }

    private static boolean ignoreSQLException(String sqlState) {
        return false;
    }


    public static void createTable() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_docs", "root", "");

        String createString =
                "create table COFFEES " + "(COF_NAME varchar(32) NOT NULL, " +
                        "SUP_ID int NOT NULL, " + "PRICE numeric(10,2) NOT NULL, " +
                        "SALES integer NOT NULL, " + "TOTAL integer NOT NULL, " +
                        "PRIMARY KEY (COF_NAME), " +
                        "FOREIGN KEY (SUP_ID) REFERENCES SUPPLIERS (SUP_ID))";

        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            JDBCTutorialUtilities.printSQLException(e);
        }
    }

    public static void main(String[] args) throws SQLException {
        createTable();
    }

}
