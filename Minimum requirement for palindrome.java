import java.util.*;


//========== User's Code Starts Here ==========
class Solution {
    public int minimum_count(String s) {
        int max = 0;
        for (int j = 0; j < s.length(); j++) {
            int f = 1;
            for (int i = 0; i < Math.floor((s.length() - j) / 2); i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i - j)) {
                    f = 0;
                    break;
                }
            }
            if (f == 1) {
                max = j;
                break;
            }
        }
        return max;
    }
}

//========== User's Code Ends Here ==========



/**
 */
public class Main
{
   
   
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        Solution s =new Solution();
        int max= s.minimum_count(n);
        System.out.println(max);
    }
}
