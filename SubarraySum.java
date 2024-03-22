import java.util.*;
class SubarraySum 
{
    public static void main(String arg[])
	{
        int maxSum=Integer.MIN_VALUE;
        int start=0,end=0,i,j,k;
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int n = nums.length;
        int currentSum=0;

        for (i=0;i<n;i++) 
		{
            for (j=i;j<n;j++)
				{
                currentSum +=nums[j];
                if (currentSum>maxSum)
					{
                    maxSum=currentSum;
                    start=i;
                    end=j;
                }
            }
        }
        System.out.print("The subarray with the largest sum is: ");
        for (k=start;k<=end;k++) 
		{
            System.out.print(nums[k]+" ");
        }
        System.out.println("Maximum subarray sum: "+maxSum);
    }
}
