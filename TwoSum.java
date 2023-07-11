import java.util.*;
public class TwoSum {
	public static int[] twosum(int[] nums,int target)
	{
		int len=nums.length;
		int[] result=new int[2];
		for(int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(nums[i]+nums[j] == target)
				{
					result[0]=i;
					result[1]=j;
					return result;
				}
			}
		}
	throw new IllegalArgumentException("No Two Numbers in the array add up to target");
		
	}
	public static void main(String[] args) {
		int len;
		int target;
		int[] result=new int[2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		len=sc.nextInt();
		int[] nums=new int[len];
		System.out.println("Enter the elements");
		for(int i=0;i<len;i++)
			nums[i]=sc.nextInt();
		System.out.println("Enter the target");
		target=sc.nextInt();
		try
		{
			result=twosum(nums,target);
			for(int i=0;i<2;i++)
				System.out.println("index is "+result[i]);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
