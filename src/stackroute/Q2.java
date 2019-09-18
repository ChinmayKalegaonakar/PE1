package stackroute;

public class Q2 {
public String question_2(int n) {
		
		if(n>=20 && n<=30) {
			if(n%2==1)
				return "Tom";
			else
				return "Jerry";
		}else {
			return "Please enter numbers between 20 and 30";
		}
	}
}
