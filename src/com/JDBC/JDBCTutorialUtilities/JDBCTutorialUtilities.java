package com.JDBC.JDBCTutorialUtilities;

import java.sql.*;
import java.util.Properties;

public class JDBCTutorialUtilities {

    private Object userName;
    private Object password;
    private String dbms = "mysql";
    private String serverName;
    private String portNumber;
    static Connection conn;

    static ResultSet rs;


    public Connection getConnection() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_docs", "root", "");

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

    public static void viewTable(Connection con) throws SQLException {
        String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";
        try (Statement stmt = con.createStatement()) {
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                String coffeeName = rs.getString("COF_NAME");
                int supplierID = rs.getInt("SUP_ID");
                float price = rs.getFloat("PRICE");
                int sales = rs.getInt("SALES");
                int total = rs.getInt("TOTAL");
                System.out.println(coffeeName + ", " + supplierID + ", " + price +
                        ", " + sales + ", " + total);
            }
        } catch (SQLException e) {
            JDBCTutorialUtilities.printSQLException(e);
        }
    }


    public static void createTable() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_docs", "root", "");
        String createString =
                "create table COFFEES " + "(COF_NAME varchar(32) NOT NULL, " +
                        "SUP_ID int NOT NULL, " + "PRICE numeric(10,2) NOT NULL, " +
                        "SALES integer NOT NULL, " + "TOTAL integer NOT NULL, " +
                        "PRIMARY KEY (COF_NAME), " +
                        "FOREIGN KEY (SUP_ID) REFERENCES SUPPLIERS (SUP_ID))";

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            JDBCTutorialUtilities.printSQLException(e);
        }
    }

    public static void populateTable() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_docs", "root", "");
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("insert into COFFEES " +
                    "values('Colombian', 00101, 7.99, 0, 0)");
            stmt.executeUpdate("insert into COFFEES " +
                    "values('French_Roast', 00049, 8.99, 0, 0)");
            stmt.executeUpdate("insert into COFFEES " +
                    "values('Espresso', 00150, 9.99, 0, 0)");
            stmt.executeUpdate("insert into COFFEES " +
                    "values('Colombian_Decaf', 00101, 8.99, 0, 0)");
            stmt.executeUpdate("insert into COFFEES " +
                    "values('French_Roast_Decaf', 00049, 9.99, 0, 0)");
        } catch (SQLException e) {
            JDBCTutorialUtilities.printSQLException(e);
        }
    }

    public static void cursorHoldabilitySupport(Connection conn)
            throws SQLException {

        DatabaseMetaData dbMetaData = conn.getMetaData();
        System.out.println("ResultSet.HOLD_CURSORS_OVER_COMMIT = " + ResultSet.HOLD_CURSORS_OVER_COMMIT);

        System.out.println("ResultSet.CLOSE_CURSORS_AT_COMMIT = " + ResultSet.CLOSE_CURSORS_AT_COMMIT);

        System.out.println("Default cursor holdability: " + dbMetaData.getResultSetHoldability());

        System.out.println("Supports HOLD_CURSORS_OVER_COMMIT? " + dbMetaData.supportsResultSetHoldability(ResultSet.HOLD_CURSORS_OVER_COMMIT));

        System.out.println("Supports CLOSE_CURSORS_AT_COMMIT? " + dbMetaData.supportsResultSetHoldability(ResultSet.CLOSE_CURSORS_AT_COMMIT));
    }

    public static void modifyPrices(float percentage) throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_docs", "root", "");
        try (Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            ResultSet ups = stmt.executeQuery("SELECT * FROM COFFEES");
            while (ups.next()) {
                float f = ups.getFloat("PRICE");
                ups.updateFloat("PRICE", f * percentage);
                ups.updateRow();
            }
        } catch (SQLException e) {
            JDBCTutorialUtilities.printSQLException(e);
        }
    }

    public static void main(String[] args) throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_docs", "root", "");
//        viewTable(conn);
//        cursorHoldabilitySupport(conn);
        modifyPrices(10);
    }

}
