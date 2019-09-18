package stackroute;

import java.util.Scanner;

import java.util.*;

public class Q4 {
	public int[] question_4(int n) {
		
		List<Integer> list= new ArrayList<Integer>();
		int count =0 ;
		int temp = n ;
		for(int i = 0; i < n ;i++) {
			for(int j = 0 ; j < i+1 ; j++) {
				list.add(i+1);
			}
		}
		int[] array = new int[list.size()];
		for(int i=0; i < list.size(); i++)
			array[i]=list.get(i);
		
		return array;
	}
}
