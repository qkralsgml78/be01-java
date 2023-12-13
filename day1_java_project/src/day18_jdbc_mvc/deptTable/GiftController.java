package day18_jdbc_mvc.deptTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day18_jdbc_mvc.connUtill.CloseHelper;
import day18_jdbc_mvc.connUtill.ConnectionHelper;

public class GiftController {
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	
	
	// connect
	public static void connect() {
		try {
			conn = ConnectionHelper.getConnection("mariadb");
			stmt = conn.createStatement();
			conn.setAutoCommit(false);   // 자동커밋 끄기
		} catch (Exception e) {  e.printStackTrace();  }		
	}
	

	// close
		public static void close() {
			try {
				CloseHelper.close(rs);			CloseHelper.close(stmt);			CloseHelper.close(pstmt);			CloseHelper.close(conn);
			} catch (Exception e) {  e.printStackTrace();  }		
		}
		
		public static menu() throws SQLException{
			GiftDTO gdt = new GiftDTO();
			
			while(true) {
				System.out.println();
				
				ConnectionHelper.menu();
				switch(sc.next()) {
				case:
				}
			}
		}
}
