package day16_network.tcp02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx2 {
	public static void main(String[] args) throws IOException, MalformedURLException {
		URL url = new URL("https://www.google.com/search?q=kim+yuna&sca_esv=589698990&ei=Nql2ZaO-EI--hwPc7ov4AQ&gs_ssp=eJzj4tTP1TdIyk6uMjFg9OLIzsxVqCzNSwQARKoGjg&oq=kimy&gs_lp=Egxnd3Mtd2l6LXNlcnAiBGtpbXkqAggAMgcQLhiABBgKMgUQABiABDIFEC4YgAQyBRAAGIAEMgUQABiABDIHEAAYgAQYCjILEC4YgAQYxwEYrwEyBRAAGIAEMgcQLhiABBgKMgUQLhiABDIWEC4YgAQYChiXBRjcBBjeBBjfBNgBA0irLFC5BFiPHXAEeAGQAQCYAZoBoAH9BqoBAzAuN7gBA8gBAPgBAagCFMICFBAAGIAEGOMEGOkEGOoCGLQC2AEBwgIQEAAYAxiPARjqAhi0AtgBAsICEBAuGAMYjwEY6gIYtALYAQLCAgsQLhiABBixAxiDAcICCxAAGIAEGLEDGIMBwgIREC4YgAQYsQMYgwEYxwEY0QPCAhQQLhiABBiXBRjcBBjeBBjgBNgBA8ICDhAuGIAEGLEDGMcBGNEDwgIIEC4YgAQYsQPCAggQABiABBixA8ICCBAuGLEDGIAEwgIXEC4YsQMYgAQYlwUY3AQY3gQY3wTYAQPCAgoQLhiABBiKBRhDwgIZEC4YgAQYigUYQxiXBRjcBBjeBBjfBNgBA-IDBBgAIEGIBgG6BgQIARgHugYGCAIQARgKugYGCAMQARgU&sclient=gws-wiz-serp");
		
//		https://www.google.com/
//		search?
//		q=kim+yuna --->키값
//		&sca_esv=589698990 -->value값
//		&ei=Nql2ZaO-EI--hwPc7ov4AQ
//		&gs_ssp=eJzj4tTP1TdIyk6uMjFg9OLIzsxVqCzNSwQARKoGjg&oq=kimy&gs_lp=Egxnd3Mtd2l6LXNlcnAiBGtpbXkqAggAMgcQLhiABBgKMgUQABiABDIFEC4YgAQyBRAAGIAEMgUQABiABDIHEAAYgAQYCjILEC4YgAQYxwEYrwEyBRAAGIAEMgcQLhiABBgKMgUQLhiABDIWEC4YgAQYChiXBRjcBBjeBBjfBNgBA0irLFC5BFiPHXAEeAGQAQCYAZoBoAH9BqoBAzAuN7gBA8gBAPgBAagCFMICFBAAGIAEGOMEGOkEGOoCGLQC2AEBwgIQEAAYAxiPARjqAhi0AtgBAsICEBAuGAMYjwEY6gIYtALYAQLCAgsQLhiABBixAxiDAcICCxAAGIAEGLEDGIMBwgIREC4YgAQYsQMYgwEYxwEY0QPCAhQQLhiABBiXBRjcBBjeBBjgBNgBA8ICDhAuGIAEGLEDGMcBGNEDwgIIEC4YgAQYsQPCAggQABiABBixA8ICCBAuGLEDGIAEwgIXEC4YsQMYgAQYlwUY3AQY3gQY3wTYAQPCAgoQLhiABBiKBRhDwgIZEC4YgAQYigUYQxiXBRjcBBjeBBjfBNgBA-IDBBgAIEGIBgG6BgQIARgHugYGCAIQARgKugYGCAMQARgU&sclient=gws-wiz-serpz
		
		//URL이 갖고 있는 함수들 이용
		System.out.println("프로토콜 : "+url.getProtocol());
		System.out.println("호스트와 포트 : "+url.getAuthority());
		System.out.println("호스트 : "+url.getHost());
		System.out.println("포트 : "+url.getPort());
		System.out.println("경로 : "+url.getPath());
		System.out.println("질의 : "+url.getQuery());
		System.out.println("파일명 : "+url.getFile());
		System.out.println("참조 : "+url.getRef());
		
		//URL이 가지고 있는 함수들 Qurey문을 통해 어떤 것이 나오는지 봄
	}

}
