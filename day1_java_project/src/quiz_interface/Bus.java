package quiz_interface;

import day09_abstract.ex03.Train;

public class Bus extends Train implements quiz_interface.Train {

	@Override
	public void show(String wow) {
		start("부릉부릉!!!");
		stop("끽!!!");

		System.out.println(wow + "의 출발은 " + go + "정지는 " + no);

	}

	@Override
	public String stop(String y) {
		System.out.println("끽!!!");
		return go;
	}

	@Override
	public String start(String x) {
		System.out.println("부릉부릉");
		return no;
	}

}
