package fuli;
import java.sql.*;

public class sql {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/test";


    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stmt = null;

        //STEP 2: Register JDBC driver
        Class.forName(JDBC_DRIVER);

        //STEP 3: Open a connection
        conn = DriverManager.getConnection(DB_URL,USER,PASS);

        //STEP 4: Execute a query
        stmt = conn.createStatement();
        String sql;
        sql = "SELECT * FROM test";
        ResultSet rs = stmt.executeQuery(sql);

        //STEP 5: Extract data from result set
        while(null != rs && rs.next()){
             System.out.print(rs.getString(1));
        }
        rs.close();
        stmt.close();
        conn.close();
    }
}