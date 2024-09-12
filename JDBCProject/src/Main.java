import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/first-db";
        String uname = "postgres";
        String pass = "Akshay@2003";
//        String query = "select * from first_table";
//        String query = "insert into first_table(id, name, marks) values" +
//                "(6, 'Dev', 76)";
//        String query = "update first_table set name = 'Choochi' where id = 5";
//        String query = "delete from first_table where name = 'Choochi'";

        int sid = 11;
        String sname = "Dev";
        int smarks = 75;

        String query = "insert into first_table values(?,?,?)";
        /*
            import packages
            load and register Driver
            create connection
            execute statement
            process the results
            close connection
         */

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            System.out.println("Connection Established");
//            Statement st = con.createStatement();

            // can be used to cache the query
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, sid);
            st.setString(2, sname);
            st.setInt(3, smarks);
            st.execute();

            // READ Operation
            // for statements like select
            // whenever we want to change something, we use execute method
            // ResultSet result = st.executeQuery(query);
//            System.out.println(result.next());

            // CREATE Operator
//            boolean status = st.execute(query);

            // UPDATE Operator
//            boolean upd = st.execute(query);

            // DELETE Operator
//            boolean del = st.execute(query);

            // used only when Statement is used and not PreparedStatement
//            ResultSet result = st.executeQuery("select * from first_table");
//            while(result.next()) {
////                int id = result.getInt("id");
////                String name = result.getString("name");
////                int marks = result.getInt("marks");
////
////                System.out.println(id + " " + name + " " + marks);
//                System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getInt(3));
//            }

            con.close();
            System.out.println("Connection closed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}