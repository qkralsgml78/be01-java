package day18_jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class GiftUpdate {
	public static void main(String[] args) throws Exception {
		//1. Driver load ...execption
		
		Scanner sc = new Scanner(System.in);
		
		Class.forName("org.mariadb.jdbc.Driver");
		
		//2. Connection load
		//				Driver://IP:portNumber/DBName(db)
		
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db", "root", "maria");
		
		
		//3. 사용 (delete) - preparedStatement
		System.out.println("삭제할 GNO 번호를 입력 : ");
		String sql = "DELETE FROM gift WHERE GNO = ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sc.nextInt());
		
		
		int result = pstmt.executeUpdate(sql); //반환값이 없는 경우 - insert, delete, update
		
		
		System.out.println(result+"개 데이터 삭제 성공함.");
		conn.commit(); //자바는 원래 자동 commit이 되는데 안되면 commit코드를 넣어줘야 함
		
		//4. 닫기(자원 반환)
		pstmt.close();  conn.close();
		
		
		}
		
		

}
