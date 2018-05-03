import java.sql.*;

public class NaiveJDBC
{
    Connection conn;

    public static void main(String[] args)
    {
        new NaiveJDBC();
    }

    public NaiveJDBC()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/coffeebreak";
            conn = DriverManager.getConnection(url, "username", "password");
            doTests();
            conn.close();
        }
        catch (ClassNotFoundException ex) {System.err.println(ex.getMessage());}
        catch (SQLException ex)           {System.err.println(ex.getMessage());}
    }

    private void doTests()
    {
        doSelectTest();

        doInsertTest();  doSelectTest();
        doUpdateTest();  doSelectTest();
        doDeleteTest();  doSelectTest();
    }

    private void doSelectTest()
    {
        System.out.println("[OUTPUT FROM SELECT]");
        String query = "SELECT COF_NAME, PRICE FROM COFFEES";
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {
                String s = rs.getString("COF_NAME");
                float n = rs.getFloat("PRICE");
                System.out.println(s + "   " + n);
            }
        }
        catch (SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
    }

    private void doInsertTest()
    {
        System.out.print("\n[Performing INSERT] ... ");
        try
        {
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO COFFEES " +
                    "VALUES ('BREAKFAST BLEND', 200, 7.99, 0, 0)");
        }
        catch (SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
    }

    private void doUpdateTest()
    {
        System.out.print("\n[Performing UPDATE] ... ");
        try
        {
            Statement st = conn.createStatement();
            st.executeUpdate("UPDATE COFFEES SET PRICE=4.99 WHERE COF_NAME='BREAKFAST BLEND'");
        }
        catch (SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
    }

    private void doDeleteTest()
    {
        System.out.print("\n[Performing DELETE] ... ");
        try
        {
            Statement st = conn.createStatement();
            st.executeUpdate("DELETE FROM COFFEES WHERE COF_NAME='BREAKFAST BLEND'");
        }
        catch (SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
    }
}