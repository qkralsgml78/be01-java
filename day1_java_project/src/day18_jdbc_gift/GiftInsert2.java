package day18_jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class GiftInsert2 {
	public static void main(String[] args) throws Exception {
		//1. Driver load ...execption
		
		Scanner sc = new Scanner(System.in);
		
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("driver load success");
		
		//2. Connection load
		//				Driver://IP:portNumber/DBName(db)
		
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db", "root", "maria");
		
		
		//3. 사용 (DML 명령어 사용) - preparedStatement
		System.out.println("상품번호\t상품명\t최저가\t최고가\t");
		String sql = "INSERT INTO gift VALUES(?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sc.nextInt());
		pstmt.setString(2, sc.nextLine());
		pstmt.setInt(3,sc.nextInt());
		pstmt.setInt(4, sc.nextInt());
		
		int result = pstmt.executeUpdate(sql); //반환값이 없는 경우 - insert, delete, update
		
		
		//INSERT INTO gift VALUES(1, '스팸', 800, 1200);
		System.out.println(sql);
		
		
		System.out.println(result+"개 데이터 추가 성공함.");
		conn.commit(); //자바는 원래 자동 commit이 되는데 안되면 commit코드를 넣어줘야 함
		
		//4. 닫기(자원 반환)
		pstmt.close();  conn.close();
		}
		
		

}
