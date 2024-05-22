import java.util.*;


//========== User's Code Starts Here ==========
class Solution {
    public int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; 
        
        int[] rotated = new int[n];


        for (int i = 0; i < n; i++) {
            rotated[i] = 0;
        }
        
        for (int i = 0; i < n; i++) {
            int newPos = (i + k) % n;
            rotated[newPos] = nums[i];
        }
        
        return rotated; 
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
        int output[] = s.rotate(arr,k);
        for(int i=0;i<output.length;i++)
            System.out.print(output[i]+" ");
        System.out.println();
    }
}
