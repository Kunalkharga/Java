import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection {
    public static void main(String[] args) {


//        Load the Driver Class
        //  Load the Driver Class
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

//        This below url is protocal type
//        databse name localhost and Database Name

            String url = "jdbc:mysql://localhost:3306/firstdb";
            Connection con = DriverManager.getConnection(url, "root", null);

            // checking the connection
            if (con != null) {
                System.out.println("Connection Successful.");
            }

            if (con == null) {
                System.out.println("Connection Closed.");
            }

            String selectQuery = "SELECT * FROM `student`";
            Statement stmt = con.createStatement();
            stmt.executeQuery(selectQuery);
            System.out.println(stmt.executeQuery(selectQuery));

            ResultSet rs = stmt.executeQuery(selectQuery);
            System.out.println("id \t name \t\t addree");

            while (rs.next())
            {
                int id = rs.getInt("Id");
                String Name = rs.getString("Name");
                String Address = rs.getString("Address");
                System.out.println(id + "\t " + Name + " \t " + Address);
                System.out.println("------------------");
            }
            con.close();
            System.out.println("All data are display.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
