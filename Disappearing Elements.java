import java.util.*;


//========== User's Code Starts Here ==========
class Solution {
    public List<Integer> missing_elements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        

        int[] b = new int[nums.length];
        

        for (int i = 0; i < nums.length; i++) {
            b[i] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            int corr = nums[i] - 1;
            b[corr] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (b[i] == 0) {
                ans.add(i + 1);
            }
        }
        return ans;
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
        
        List<Integer> max= s.missing_elements(arr);
        Collections.sort(max);
        for(int i:max)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
