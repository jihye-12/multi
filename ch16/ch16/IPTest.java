package ch16;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest {

	public static void main(String[] args) throws UnknownHostException {
		//내컴퓨터ip주소
			InetAddress myip = InetAddress.getLocalHost();
			System.out.println("컴퓨터이름="+myip.getHostName());
			System.out.println("ip="+myip.getHostAddress());		

		//	http://google.com 접속하면 나 클라이언트 - google 서버(ip+port)
		// 메이저 서버들 - 이름 부여 - google.com - domain name	 부여 - 전세계 인터넷 등록 
		// 내컴퓨터 부여 - 무료 / 유료	
		
		InetAddress[] serverip = InetAddress.getAllByName("www.naver.com");
		for(InetAddress oneip : serverip) {
			System.out.println("서버=" + oneip.getHostAddress());
		}
		
		
			
			
	}

}
