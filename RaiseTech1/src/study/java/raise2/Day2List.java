package study.java.raise2;

import java.util.ArrayList;
import java.util.List;

public class Day2List {
	public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
 
        list1.add("a");
        list1.add("b");
        list1.add(3);
        list1.add(4);
        
        System.out.println(list1);
         
        List<Object> list2 = new ArrayList<>();
         
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
         
        list1.addAll(list2);
        
        System.out.println(list1);
    }

}
