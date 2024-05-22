import java.util.*;


//========== User's Code Starts Here ==========
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        for (int j = 0; j < k; j++) {
            int val = nums[0];
            for (int i = 1; i <n; i++) {
                int temp=val;
                val=nums[i];
                nums[i]=temp;
            }
            nums[0] = val;
        }
    }
}

//========== User's Code Ends Here ==========



public class Main
{
   
    
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String y=sc.nextLine();
        String n =sc.nextLine();
        Solution s = new Solution();
        String s_arr[]=n.split(" ");
        int arr[]=new int[s_arr.length];
        for(int i=0;i<s_arr.length;i++)
        {
            arr[i]=Integer.parseInt(s_arr[i]);
        }
        int k= sc.nextInt();
        s.rotate(arr,k);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
