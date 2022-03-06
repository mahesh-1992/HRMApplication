package TestCase;

public class PrintAllDigit {

	public static void main(String[] args) 
	{
	 int a=435698764,rem=0,count=0;
	 while(a>0)
	 {
		 rem=a%10;
		 System.out.println("unit digit number="+rem);
		 a=a/10;
		 count++;
	 }
	 System.out.println("count number of digit="+count);

	}

}
