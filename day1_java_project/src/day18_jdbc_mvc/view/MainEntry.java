package day18_jdbc_mvc.view;

import java.sql.SQLException;

import day18_jdbc_mvc.controller.GiftController;

public class MainEntry { //view
	public static void main(String[] args) throws SQLException {
		 GiftController.connect(); //DB연결
		 GiftController.menu(); //메뉴호출
		 
	}

}
