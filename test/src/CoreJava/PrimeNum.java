package CoreJava;

public class PrimeNum {
	public static void main(String args[]) {
		int num=11;
		int count=0;
		
		for(int i=num;i>0;i--) {
			if(num%i==0) {
				count++;
			
		}
		}
			if(count==2)
			{
				System.out.println("Prime number");
			}
			else {
				System.out.println(num +" not Prime number");
				
			}
		}
	}


