package stackroute;

public class Q1 {
	public String question_1(int n) {
		
		int r,rev=0,temp,sum=0;
		temp=n;    
		while(n>0){    
			r=n%10;
			if(r%2==0)
				sum += r;
			rev=(rev*10)+r;    
			n=n/10;    
		}    
		  if(temp==rev) {
			  if(sum>25)
				  return "The number is a palindrome and is greater than 25";
			  else
				  return "The number is a palindrome but not greater than 25";
		  }else {
			  return "The number is not a palindrome";
		  }
	}
}
