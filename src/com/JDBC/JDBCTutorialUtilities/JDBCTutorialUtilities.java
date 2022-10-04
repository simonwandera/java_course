package com.JDBC.JDBCTutorialUtilities;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
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
                String name = ups.getString("COF_NAME");
                ups.updateString("COF_NAME", name.trim().toLowerCase());
                ups.updateFloat("PRICE", f * percentage);
                ups.updateRow();
            }
        } catch (SQLException e) {
            JDBCTutorialUtilities.printSQLException(e);
        }
    }

    public static void batchUpdate() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_docs", "root", "");
        conn.setAutoCommit(false);
        try (Statement stmt = conn.createStatement()) {

            stmt.addBatch("INSERT INTO COFFEES VALUES('Amaretto', 49, 9.99, 0, 0)");
            stmt.addBatch("INSERT INTO COFFEES VALUES('Hazelnut', 49, 9.99, 0, 0)");
            stmt.addBatch("INSERT INTO COFFEES VALUES('Amaretto_decaf', 49, 10.99, 0, 0)");
            stmt.addBatch("INSERT INTO COFFEES VALUES('Hazelnut_decaf', 49, 10.99, 0, 0)");

            int[] updateCounts = stmt.executeBatch();
            conn.commit();
        } catch (BatchUpdateException b) {
            JDBCTutorialUtilities.printBatchUpdateException(b);
        } catch (SQLException ex) {
            JDBCTutorialUtilities.printSQLException(ex);
        } finally {
            conn.setAutoCommit(true);
        }
    }

    public static void insertRow(String coffeeName, int supplierID, float price, int sales, int total) throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_docs", "root", "");

        try (Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE))
        {
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM COFFEES");
            resultSet.moveToInsertRow();
            resultSet.updateString("COF_NAME", coffeeName);
            resultSet.updateInt("SUP_ID", supplierID);
            resultSet.updateFloat("PRICE", price);
            resultSet.updateInt("SALES", sales);
            resultSet.updateInt("TOTAL", total);

            resultSet.insertRow();
            resultSet.beforeFirst();

        } catch (SQLException e) {
            JDBCTutorialUtilities.printSQLException(e);
        }
    }

    private static void printBatchUpdateException(BatchUpdateException b) {
    }

    public static void updateCoffeeSales(HashMap<String, Integer> salesForWeek) throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_docs", "root", "");
        String updateString = "update COFFEES set SALES = ? where COF_NAME = ?";
        String updateStatement = "update COFFEES set TOTAL = TOTAL + ? where COF_NAME = ?";

        try (PreparedStatement updateSales = conn.prepareStatement(updateString);
             PreparedStatement updateTotal = conn.prepareStatement(updateStatement))

        {
            conn.setAutoCommit(false);
            for (Map.Entry<String, Integer> e : salesForWeek.entrySet()) {
                updateSales.setInt(1, e.getValue());
                updateSales.setString(2, e.getKey());
                updateSales.executeUpdate();

                updateTotal.setInt(1, e.getValue());
                updateTotal.setString(2, e.getKey());
                updateTotal.executeUpdate();
                conn.commit();
            }
        } catch (SQLException e) {
            JDBCTutorialUtilities.printSQLException(e);
            if (conn != null) {
                try {
                    System.err.print("Transaction is being rolled back");
                    conn.rollback();
                } catch (SQLException excep) {
                    JDBCTutorialUtilities.printSQLException(excep);
                }
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_docs", "root", "");
//        viewTable(conn);
//        cursorHoldabilitySupport(conn);
//        modifyPrices(10);
//        batchUpdate();
//        insertRow("Nesacfe", 101, 20, 200, 4000);
        HashMap<String, Integer> hashMap  = new HashMap<>();
        hashMap.put("Amaretto", 280);
        hashMap.put("Cadbery", 210);
        hashMap.put("espresso", 100);

        updateCoffeeSales(hashMap);

    }

}
