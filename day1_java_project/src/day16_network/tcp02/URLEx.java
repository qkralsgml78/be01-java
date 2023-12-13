package day16_network.tcp02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {
	public static void main(String[] args) throws IOException, MalformedURLException {
		URL google = new URL("https://www.en-core.com");
		
		//System.in -> 표준입력 -키보드로부터 입력받음
		BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream()));
		
		String inputLine;
		while((inputLine = br.readLine()) != null) { //구글사이트의 텍스트가 없을 때 까지 모두 출력해라
			System.out.println(inputLine);
		}
		br.close();
	}

}
