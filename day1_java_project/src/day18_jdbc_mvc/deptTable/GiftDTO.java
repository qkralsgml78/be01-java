package day18_jdbc_mvc.deptTable;

public class GiftDTO {
	public final String ClassName = "GIFT";
	
	static int g_end, g_start, gno;
	static String gname;
	
	
	public static int getG_end() {
		return g_end;
	}
	
	public static int getG_start() {
		return g_start;
	}
	
	public static int getGno() {
		return gno;
	}
	
	public static String getGname() {
		return gname;
	}
	
	public static void setG_end(int g_end) {
		GiftDTO.g_end = g_end;
	}
	
	public static void setG_start(int g_start) {
		GiftDTO.g_start = g_start;
	}
	
	public static void setGno(int gno) {
		GiftDTO.gno = gno;
	}
	
	public static void setGname(String gname) {
		GiftDTO.gname = gname;
	}
	
	public String getClassName() {
		return ClassName;
	}
	
	

}
