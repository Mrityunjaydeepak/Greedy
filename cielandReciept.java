package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class cielandReciept {

	public static void main(String[] args){
        int con = 2;
        int tot,num;
        Scanner sc = new Scanner(System.in);
        tot = sc.nextInt();
        for(int j =0;j<tot;j++){
            int sum = 0,count = 0;
            num = sc.nextInt();
            for(int i=11 ; i>=0; i--){
                if(Math.pow(con,i)<=num && sum<=num && sum+Math.pow(con,i)<=num){
                    sum = sum + (int)Math.pow(con,i);
                    
                    count++;
                    i=12;
                }
            }
           
            System.out.println(count);
        }
    }
}


