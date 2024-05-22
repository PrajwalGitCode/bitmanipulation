import java.util.*;


//========== User's Code Starts Here ==========
class Solution {
    public int[] charFrequency(String s) {

        int[] frequency = new int[26];
        

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a'; 
                frequency[index]++;
            }

        }
        
        return frequency;
    }
}
//========== User's Code Ends Here ==========



public class Main
{
   
   
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        Solution s =new Solution();
        int[] max= s.charFrequency(n);
        
        for(int i = 0;i < max.length;i++)
        System.out.println(max[i]);
    }
}
