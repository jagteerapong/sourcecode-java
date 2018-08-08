package com.wisesoft.testCalection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoCF {

	public static void main(String[] args) {
		//Map
		Map<String, Integer> employee = new HashMap<>();
		employee.put("Teerapong", 24);
		employee.put("Jeg", 50);
		System.out.println(employee.get("Teerapong"));
		
		if (employee.containsKey("Jeg1")) {
			System.out.println(employee.get("Jeg"));
		}else {
			System.out.println("Key not found");
		}
		
		//Map + Interate
		Set<String> keys = employee.keySet();
		for (String key : keys) {
			System.out.printf("%s -> %d\n",key,employee.get(key));
		}
		
		System.out.println();
		
		int[] number = {1,2,3};
		for (int i : number) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		//List :: dynamic array
		List<Integer> numberList = new ArrayList<>();
		numberList.add(4);
		numberList.add(5);
		numberList.add(6);
		System.out.println("Size : " +numberList.size());
		for (Integer integer : numberList) {
			System.out.print(integer +", ");
		}
		
	}

}




//if (employee.containsKey("Jeg1")) {
//	System.out.println(employee.get("Jeg"));
//}else {
//	System.out.println("Key not found");
//}