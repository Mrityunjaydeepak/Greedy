package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class coinproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int result=0;
		ArrayList<Integer> coins= new ArrayList<Integer>();
		System.out.println("Enter the dinominations");
		for(int i=0;i<4;i++) {
			coins.add(sc.nextInt());
			
		}
		System.out.println("Enter the amount ot be given out");
		int amt=sc.nextInt();
		Collections.sort(coins,Collections.reverseOrder());
		Iterator it=coins.iterator();
		for(int i=0;i<4;i++)
		{
			int dinomination=coins.get(i);
			if(dinomination<=amt) {
				int number=Math.floorDiv(amt, dinomination);
				result=result+number;
				amt=amt-number*dinomination;				
			}
			if(amt==0) {
				break;
			}
		}
		System.out.println(result);
		
		

	}

}
