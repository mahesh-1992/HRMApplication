package TestCase;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PracticeJavaClass {

	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++)
		{		
		System.out.println(ThreadLocalRandom.current().nextInt(4,20));
		}
		System.out.println("=============================================");
		Random ran=new Random();
		System.out.println(ran.nextInt(20));
	}

}
