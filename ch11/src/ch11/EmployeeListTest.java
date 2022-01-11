package ch11;

import java.util.ArrayList;


public class EmployeeListTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>(5);//Employee 타입 저장의도 list에 알려줌 
		/*list.add("java");
		list.add(100);
		list.add(3.14);
		list.add("java");
		list.add(100);
		list.add(3.14);*/
		
		Employee e1 = new Employee(100, "박과장", 500000.55);
		Employee e2 = new Employee(200, "김대리", 400000.55);
		Employee e3 = new Employee(300, "최부장", 600000.55);
		
		list.add(e1);//자동형변환(Employee->Object)
		list.add(e2);
		list.add(e3);

		System.out.println(list.size());
		
		for(int i1 = 0; i1 < list.size(); i1 ++) {
				System.out.println(i1 + "번째 인덱스 값은 " + list.get(i1).name);
		}
		
		System.out.println("===================================================");
		
		for(Employee one :list) {
			System.out.println(one.name);
			}
		}
	}   
