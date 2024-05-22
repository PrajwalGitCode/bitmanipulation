import java.util.*;


//========== User's Code Starts Here ==========
class Solution {
    public void rotate(int[] nums, int k) {
        int counter = 0; // how many times the elements have been swapped
        int currentIndex = 0;
        int val = nums[0];
        int cycle = 0;
        int n = nums.length;
        
        while (counter < n) {
            int newIndex = (currentIndex + k) % n;
            int temp = val;
            val = nums[newIndex];
            nums[newIndex] = temp;
            currentIndex = newIndex;
            counter++;

            if (currentIndex == cycle) {
                currentIndex = (currentIndex + 1) % n;
                val = nums[currentIndex];
                cycle = currentIndex;
            }
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
