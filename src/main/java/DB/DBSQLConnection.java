package DB;

import org.zkoss.zul.Messagebox;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBSQLConnection {
    private static String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    private static String USER_NAME = "root";
    private static String PASSWORD = "1234567890";
    public Connection openConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}
