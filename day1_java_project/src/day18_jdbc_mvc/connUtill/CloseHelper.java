package day18_jdbc_mvc.connUtill;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 if(rs != null) try{ rs.close(); } catch(SQLException e) {e.printStackTrack}
 if(stmt != null) try{ stmt.close(); } catch(SQLException e) {e.printStackTrack}
 if(conn != null) try{ conn.close(); } catch(SQLException e) {e.printStackTrack}
 */

public class CloseHelper {
	
	public static void close(Connection conn) {
		if( conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Statement conn) {
		if( conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void close(PreparedStatement conn) {
		if( conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void close(ResultSet conn) {
		if( conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}



}
