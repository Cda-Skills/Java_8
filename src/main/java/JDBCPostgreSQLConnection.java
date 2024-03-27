/*
 * import java.sql.Connection; import java.sql.DriverManager; import
 * java.sql.ResultSet; import java.sql.SQLException; import java.sql.Statement;
 * 
 * public class JDBCPostgreSQLConnection {
 * 
 * private final String url = "jdbc:postgresql://localhost:5432/"; private final
 * String user = "dev"; private final String password = "S3cretP@ss"; Connection
 * conn = null; Statement state = null;
 * 
 * public Connection connect() {
 * 
 * try { conn = DriverManager.getConnection(url, user, password);
 * 
 * if (conn != null) {
 * 
 * System.out.println( "Connected to the PostgreSQL server successfully."); }
 * else {
 * 
 * System.out.println("Failed to make connection!"); }
 * 
 * } catch (SQLException e) { System.out.println("Error bracelets");
 * System.out.println(e.getMessage()); }
 * 
 * return conn; }
 * 
 * public void createTable3columns(String table_name, String colOne, String
 * colTwo) {
 * 
 * String query = "create table " + table_name + "( " + colOne + "\t" +
 * "VARCHAR(80)," + colTwo + "\t" + "VARCHAR(80)" + " );";
 * System.out.println("Le SQL executé est : " + query); try { state =
 * conn.createStatement(); } catch (SQLException e) { e.printStackTrace(); }
 * finally {
 * 
 * try { state.executeUpdate(query); System.out.println("Table crée !");
 * state.close(); conn.close(); } catch (SQLException e) { e.printStackTrace();
 * } } }
 * 
 * public void insertLigne(Connection conn, String nomTable, String a, String b)
 * { Statement state; try {
 * 
 * //String query = String.format("insert into %s", nomTable , pays , descriptif
 * ); String query = "insert into " + nomTable + " (pays,descriptif)"+
 * "values ("+ a +", "+ b+");"; System.out.println(query);
 * state=conn.createStatement(); state.executeUpdate(query);
 * 
 * System.out.println("Ligne Ajouté"); state.close(); conn.close();
 * 
 * } catch (Exception e){ System.out.println(e); }
 * 
 * }
 * 
 * public void readData(Connection conn, String nomTable) { Statement state;
 * ResultSet rs = null; if (conn != null) { try { String query =
 * String.format("select * from %s", nomTable); System.out.println(query); state
 * = conn.createStatement();
 * 
 * rs = state.executeQuery(query); System.out.println(rs.getObject(0)); while
 * (rs.next()) { System.out.print(rs.getString("pays"));
 * System.out.println(rs.getString("descriptif"));
 * 
 * } } catch (Exception e) { System.out.println(e); } } } }
 */