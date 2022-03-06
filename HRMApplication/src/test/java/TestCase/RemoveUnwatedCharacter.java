package TestCase;

import java.util.Arrays;

public class RemoveUnwatedCharacter {

	public static void main(String[] args) 
	{
		{
		String s="MkH@mahesh#%";
		String sb=s.substring(4, 10).toUpperCase();
		System.out.println(sb);
		}
		
		{
			String s="abababababab";
			String sb=s.replace('b', 'a');
			System.out.println(sb);
			
		}
		
		{
			int[] a= {4,6,2,9};
			a[1]=7;
			{
				for(int i=0;i<=a.length-1;i++)
				{
			     System.out.println(a[i]);
				}
			}
		}
	}
	

}
