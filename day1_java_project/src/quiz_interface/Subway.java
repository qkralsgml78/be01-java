package quiz_interface;

import day09_abstract.ex03.Train;

public class Subway extends Train implements quiz_interface.Train {

	@Override
	public void show(String wow) {
		start("쿠구쿠구쿠구!!!");
		stop("끽!!!");
		System.out.println(wow + "의 출발은 " + go + "정지는 " + no);

	}

	@Override
	public String stop(String y) {
		return no;
	}

	@Override
	public String start(String x) {
		return go;
	}

}
