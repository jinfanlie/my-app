import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {
   public static void main(String[] args) {
       String url = "jdbc:mysql://localhost:3306/database_name";
       String username = "root";
       String password = "password";
       try {
           Connection connection = DriverManager.getConnection(url, username, password);
           Statement statement = connection.createStatement();
           // 执行SQL脚本
           String sqlScript = "CREATE TABLE table_name (column1 datatype, column2 datatype, ...)";
           statement.execute(sqlScript);
           statement.close();
           connection.close();
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }
}