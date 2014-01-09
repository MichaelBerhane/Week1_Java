package week1;

import java.util.Scanner;
import java.util.*;

public class Surname {

	public void Bubble(){
		
	
		Scanner input = new Scanner(System.in);
		System.out.println("How many surnames do you want to sort?");
		int x = input.nextInt();
		String[] names = new String[x];
		
		System.out.println("surnames?: ");
		for(int i = 0; i < x; i++){
			names[i] = input.next();
		}
		
		BubbleSort(names);
	}	
	
	public void BubbleSort(String [] names){
		
	for(int j = 0; j < names.length; j++){
		for(int k = 0; k < names.length; k++){
			
			if(k != names.length - 1){
				if(names[k].compareTo(names[k+1]) < 0){
					String x = names[k + 1];
					String y = names[k];
					names[k] = x;
					names[k + 1] = y;
				}
			}
		}
	}	
	
		for(int i = 0; i < names.length; i++){
			System.out.println(names[i]);	
		}
		
	}
	

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Surname object = new Surname();
			object.Bubble();
		
	}

}