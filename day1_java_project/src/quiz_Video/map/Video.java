package quiz_Video.map;

public class Video {
	
	static String title;
	static String category, lend, lendName, lendData;

	Video(){
	}
	
	Video(String title, String category, String lend, String lendName, String lendData) {
		this.title = title;
		this.category = category;
		this.lend = lend;
		this.lendName = lendName;
		this.lendData = lendData;
		
	}
	
	public static void disp() {
		System.out.println("비디오 제목 : "+title);
		System.out.println("비디오 장르 : "+category);
		System.out.println("대여 여부 : "+lend);
		System.out.println("대여자(고객명) : "+lendName);
		System.out.println("대여 날짜 : "+lendData);

	}//disp end
	
	
}//main end
