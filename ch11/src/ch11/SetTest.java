package ch11;

import java.util.HashSet;

public class SetTest {
	
	//set.set(o, "aaa"); list o /set x
	//set.get(0) list o / set x

	public static void main(String[] args) {
		HashSet set = new HashSet();//데이터저장가능 크기가변
	    //System.out.println("100저장 = " + set.add(100));
	    System.out.println("java저장 = " + set.add("java"));
	    System.out.println("사번 100 회사원 저장 = " + set.add(new Employee(100, "박사원", 360000.55)));
	    System.out.println("사번 100 회사원 저장 = " + set.add(new Employee(100, "이사원", 360000.55)));
	    System.out.println("100삭제 = " + set.remove(100));
	    System.out.println("100저장 = " + set.add("java"));
	    /*set.add(100);
	    set.add("java");
		set.add(new Employee(100, "박사원", 360000.55));
		set.remove(100); // 인덱스(순서)가 없기 때문에 인덱스값 넣을 수 없음
		set.add("java"); //중복 무시 2 */
		
		
		System.out.println(set.size());
		
	    //for(int i = 0; i < set.size(); i++) {
	    	
		
	    for(Object o : set) {
	    	System.out.println(o);
	}
	    HashSet<String> set2 = new HashSet<String>();
	    set2.add("java");
	    set2.add("jsp");
	    set2.add("react");
	    set2.add("jquery");
	    for(String s:set2) {
	    	System.out.println(s);
	    }
	    System.out.println(set2.contains("jsp"));
	    String [] result= new String[set2.size()];
	    set2.toArray(result);
	    for(String s : result) {
	    	System.out.println(s);
	    }

	}
}
