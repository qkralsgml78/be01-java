package quiz_Video.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import day11_collection.list.Customer;

public class VideoSub extends Video {
	
	HashMap<Integer, ArrayList<Video>> hm = new HashMap();
//	HashMap hm = new HashMap();
	
	VideoSub(){
		
	}

	public void addGroup(Integer groupnum) {
		if(!(hm.containsKey(groupnum))) {
			hm.put(groupnum, new ArrayList());
		}
	}
	
	public void Videoadd(Integer groupnum,String title, String category, String lend, String lendName, String lendData) {
		addGroup(groupnum);
		
		ArrayList group =(ArrayList)hm.get(groupnum);
		group.add(title);
		group.add(category);
		group.add(lend);
		group.add(lendName);
		group.add(lendData);
		
	}
	public void Videoadd() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("비디오 이름 >> ");
		title = sc.nextLine();
		System.out.print("비디오 장르 >> ");
		category = sc.nextLine();
		System.out.print("대여여부  >> ");
		lend = sc.nextLine();
		System.out.print("대여자(고객명)  >> ");
		lendName = sc.nextLine();
		System.out.print("대여날짜  >> ");
		lendData = sc.nextLine();
		
		ArrayList group = new ArrayList();
	  }
	
	

}
