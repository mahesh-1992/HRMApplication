package TestCase;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

	public static void main(String[] args) 
	{
		//using random class it is avialable in java
		Random ran=new Random();
		//generate one random number
		System.out.println("random number="+ran.nextInt());
		System.out.println("============================");
		//generate 5 random number
		for(int i=0;i<=5;i++)
		{
		System.out.println("random int number="+ran.nextInt());
		System.out.println("random double number="+ran.nextDouble());
		System.out.println("random float number="+ran.nextFloat());
		System.out.println("random boolean="+ran.nextBoolean());
		  }
		System.out.println("============================");
		
		for(int i=0;i<=5;i++)
		{
		System.out.println(Math.random());//it generates random double value only
		  }
		System.out.println("============================");
		
		/*for(int i=0;i<=5;i++)
		{
		System.out.println(ThreadLocalRandom);
		  }*/
		System.out.println("============================");
		for(int i=0;i<=5;i++)
		{
		//System.out.println(ran.nextInt(15));//generate 0 to 15 any number
		//System.out.println((int)(Math.random()*20));
			System.out.println(ThreadLocalRandom.current().nextInt(10, 20));
		}
	}
}
