package TestCase;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateElement 
{

	public static void main(String[] args)
	{
      int[] a= {1,1,2,2,5,5,6,6};
      HashSet<Integer> number=new HashSet<Integer>();
      for(int i=0;i<=a.length-1;i++)
      {
    	  number.add(a[i]);
      }
      System.out.println(number);
      number.remove(6);
      System.out.println(number);
    }

}
