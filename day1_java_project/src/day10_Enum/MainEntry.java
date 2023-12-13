package day10_Enum;

public class MainEntry {
	public static void main(String[] args) {
		
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellItLikeItis();
		
		EnumTest thirDay = new EnumTest(Day.WEDNESDAY);
		thirDay.tellItLikeItis();
		
		EnumTest sixtDay = new EnumTest(Day.SATUDAY);
		sixtDay.tellItLikeItis();
		
	}

}
