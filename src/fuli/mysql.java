package fuli;
import java.sql.*;
public class mysql {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/test";
    static final String USER = "root";
    static final String PASS = "root";
    int i=1;
    void output(String putinto,String earnings,String year,String money) throws SQLException{
    	Connection conn = null;
        Statement stmt = null;
        
        //STEP 2: Register JDBC driver
        try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //STEP 3: Open a connection
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
        
        //STEP 4: Execute a query
        stmt = conn.createStatement();
        
        String sql;
        sql = "SELECT * FROM touzi";
        ResultSet rs = stmt.executeQuery(sql);
        
        
        //STEP 5: Extract data from result set
         while(null != rs && rs.next()){
             System.out.println(rs.getString("putinto"));
             System.out.println(rs.getString("earnings"));
             System.out.println(rs.getString("number"));
             
        }  
        String I = Integer.toString(i);
        String sql1 = "INSERT INTO touzi(number,putinto,earnings,year,money) VALUES(";
        sql1=sql1+"'"+I+"'"+','+"'"+putinto+"'"+','+"'"+earnings+"'"+','+"'"+year+"'"+','+"'"+money+"'"+')';
        i++;
        System.out.print(sql1);
        stmt.executeUpdate(sql1);
       
        rs.close();
        stmt.close();
        conn.close();
    }
	
    
   
}

