package day18_jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class GiftCRUD {
	
	static Scanner sc = new Scanner(System.in);
	static Connection conn;
	
	public static void main(String[] args) throws Exception{
		menu();
		
		
	}


		public static void connectdb() throws Exception {
			Class.forName("org.mariadb.jdbc.Driver");

			// 2. Connection load
			// Driver://IP:portNumber/DBName(db)

			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db", "root", "maria");
			
			
		}
		
		public static void SelectAllFild(int gno) throws Exception{
			connectdb();
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT WHERE GNO ="+ gno);
			
			// 3. 사용 (update) - preparedStatement
			System.out.println("확인할 필드 번호 입력 : ");

			while(rs.next()) {//rs의 커서가 필드 제목에 있고 그 커서를 다음 칸으로 내려야 하기에 rs.next()를 하는 것
				int gno1 = rs.getInt(1); //인덱스, int gno = rs.getInt("필드명"); /getXXX ->XXX 자료형타입이 들어가 그 타입에 맞게 처리가 됌
				String gname = rs.getString("gname");
				int g_s = rs.getInt(3);
				int g_e = rs.getInt("g_end");
				
				
				System.out.println(gno1+"\t"+gname+"\t"+g_s+"\t"+g_e);
			
			}
			
			 rs.close();   stmt.close();  conn.close();
		}
		
		
		public static void SelectAll() throws Exception{
			connectdb();
			
		
			System.out.println("selectAll : ");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
			
			System.out.println("상품번호\t상품명\t최저가\t최고가\t");
			
			while(rs.next()) {//rs의 커서가 필드 제목에 있고 그 커서를 다음 칸으로 내려야 하기에 rs.next()를 하는 것
				int gno1 = rs.getInt(1); //인덱스, int gno = rs.getInt("필드명"); /getXXX ->XXX 자료형타입이 들어가 그 타입에 맞게 처리가 됌
				String gname = rs.getString("gname");
				int g_s = rs.getInt(3);
				int g_e = rs.getInt("g_end");
				
				System.out.println(gno1+"\t"+gname+"\t"+g_s+"\t"+g_e);
				
			}
			
			stmt.close();  rs.close();  conn.close();
				
			
		}
		
			
		public static void UpdateByGno(int gno) throws Exception{
			connectdb();
			
			
			System.out.println("수정할 최저가, 상품이름, 최고가, 번호를 차례로 입력: ");
			String sqlUpdate = "UPDATE gift SET g_start=?, gname=?, g_end=? where gno=?";
			PreparedStatement pstmt = conn.prepareStatement(sqlUpdate);
			
			pstmt.setInt(1, sc.nextInt()); //번호를 쓰는 이유는 물음표에 첫번째 물음표에 값을 넣기 위해
			pstmt.setString(2, sc.next());
			pstmt.setInt(3, sc.nextInt());
			pstmt.setInt(4, sc.nextInt());
			
			int result = pstmt.executeUpdate(sqlUpdate);
			
			System.out.println(result + "개 데이터 업데이트 성공함.");
			
			pstmt.close();   conn.close();
			
			
		}
		
		public static void DelectGno(int gno) throws Exception{
			connectdb();
			
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
		
		public static void InsertGno() throws Exception{
			connectdb();
			
			System.out.println("상품번호\t상품명\t최저가\t최고가\t");
			
			String sqlinsert = "INSERT INTO gift VALUES(?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sqlinsert);
			
			
			pstmt = conn.prepareStatement(sqlinsert);
			pstmt.setInt(1, sc.nextInt());
			pstmt.setString(2, sc.nextLine());
			pstmt.setInt(3,sc.nextInt());
			pstmt.setInt(4, sc.nextInt());
			
			int result = pstmt.executeUpdate(sqlinsert);
			
			pstmt.close();  conn.close();
			
			
		}
		
		public static void menu() throws Exception {
			System.out.println("메뉴를 선택하세요(0.전체조회 1.선택조회 2.추가 3.수정 4.삭제 5.exit)");
			int num =sc.nextInt();
			
			while(true) {
				switch(num) {
				case 0:
					SelectAll();
					break;
				case 1:
					System.out.println("확인하고 싶은 GNO번호 입력: ");
					SelectAllFild(sc.nextInt());
					break;
				case 2:
					System.out.println("수정하고 싶은 GNO번호 입력:");
					UpdateByGno(sc.nextInt());
					SelectAll();
					break;
				case 3:
					System.out.println("삭제하고 싶은 GNO번호 입력:");
					DelectGno(sc.nextInt());
				case 4:
					InsertGno();
					SelectAll();
				case 5:
					System.exit(0);
				
				}
				
			}
			
			
		}
		
		
	
	
		
	}
	
	//연결메소드
	
	//selectAll()
	
	//selectByGno(int gno)
	
	//update(int gno)
	
	//delete(int gno)
	
	//insert()
	
	//exit()
	
	//menu()
