import java.sql.*;

/**
 *
 * @author sqlitetutorial.net
 */
public class DBTest {


    public static void createNewTable() throws SQLException {

        String url = "jdbc:sqlite:identifier.sqlite/db/test2.db";
        Connection conn = DriverManager.getConnection(url);

        String sql = "CREATE TABLE IF NOT EXISTS warehouses (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	name text NOT NULL,\n"
                + "	capacity real\n"
                + ");";

        Statement stmt = conn.createStatement(); {
            // create a new table
            stmt.execute(sql);
        }


        sql = "INSERT INTO warehouses(name,capacity) VALUES(\"Raw Materials\", 3000)";
        stmt = conn.createStatement(); {
            // create a new table
            stmt.execute(sql);
        }

        sql = "Select * from warehouses where capacity > 0";
        stmt = conn.createStatement(); {
            // create a new table
            //stmt.execute(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" +
                        rs.getString("name") + "\t" +
                        rs.getDouble("capacity"));
            }
        }


    }


    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) throws SQLException {
            createNewTable();
        }
}

