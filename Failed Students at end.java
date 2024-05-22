import java.util.*;


//========== User's Code Starts Here ==========
class Solution {
    public int[] arrange(int[] nums) {
        int i = 0;
        int j = 0;
        int nu=nums.length;
        while (i < nu && j < nu) {
            if (nums[j] >= 0) {

                i++;
                j++;
            } else {

                while (i < nu && nums[i] < 0) {
                    i++;
                }

                if (i < nu) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                    i++;
                    j++;
                }
            }
        }
        return nums;
    }
}

//========== User's Code Ends Here ==========



public class Main
{
   
    
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        Solution s = new Solution();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int output[] = s.arrange(arr);
        
        int ele=0;
            for(int i=0;i<output.length;i++)
            {
                if(output[i]<0)
                {
                    ele=i;
                    break;
                }
            }
            int f=0;
             for(int i=ele;i<output.length;i++)
             {
                if(output[i]>=0)
                {
                    f=1;
                    break;
                }
             }
            if(f==1)
                System.out.println("false");
            else
                System.out.println("true");
    }
}
