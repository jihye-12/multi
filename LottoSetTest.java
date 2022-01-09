package test;

import java.util.*;

public class LottoSetTest {

	public static void main(String[] args) {
		
		HashSet lottoset = new HashSet();
		int num;
		for(int i=0; lottoset.size() < 6; i++) {
			num = (int) (Math.random() * 45 + 1);
			lottoset.add(new Integer(num));
		}
		List list = new ArrayList(lottoset);
		
		System.out.println("로또번호");
		System.out.println(lottoset);
	}
}
