import java.util.*;


//========== User's Code Starts Here ==========
class Solution {
    public boolean isValid(String s) {
                int i = 0;
        int j = s.length() - 1;
        while(i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
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
        boolean max= s.isValid(n);
        System.out.println(max);
    }
}
