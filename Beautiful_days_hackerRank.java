import java.util.Scanner;

public class Beautiful_days_hackerRank {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	      int i = in.nextInt();
	      int j = in.nextInt();
	      int k = in.nextInt();
	      int count =0;
	     while(i<=j) {
	    	 
	     int num = i; 
	     
	      	int rev = 0;
	      	while(num !=0){	
	      		int rem = num%10;
				rev = rev*10 + rem; 
				num = num/10;}
	     
	      	i++;
	      	int d = Math.abs(i-rev-1);
	      	if(d%k==0) {
	      		count++;
	      	}
	     
	      	
	     }
		
	     	System.out.println(count);
		
		}


	}


