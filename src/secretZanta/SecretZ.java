package secretZanta;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SecretZ {
	public static void main(String args[]) {
		String array[]=new String[5];
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter team members name");
		for(int i=0;i<5;i++) {
			array[i] = keyboard.next();
		}
		choose_give_to_whom(array);
		
	}
	static void choose_give_to_whom(String array[]) {
		int j=0;
		ArrayList<String> reserved=new ArrayList<String>();
		for(int k=0;k<5;k++) {
			System.out.println("enter your name");
			Scanner keyboard1 = new Scanner(System.in);
			String your_name=keyboard1.next();
			
			for(int i=0;i<5;i++) {
				
				if(array[i].equals(your_name)) {
					int eq;
					int z;
					//check two conditions gifted from own or try to gift already gifted person
					do {
						eq=0;
						//check he or she gifted from her self or him self
						do {
							z=random_number_generator();
						}while(z == i);
						
						//check he or she already gifted from some one 
						for(int n=0;n<reserved.size();n++) {
							if(reserved.get(n).equals(array[z])) {
								++eq;
							}
						}
						
					}while(eq != 0);
					
					System.out.println(your_name +" you have to give to "+array[z]);
					reserved.add(array[z]);
					++j;	
				}				
			}
		}
	}
	static int random_number_generator() {
		int max=4;
		int min=0;
				
		Random random = new Random();
		int z=random.nextInt(max - min + 1) + min;
		//System.out.println(z);
		return z;
	}
}
