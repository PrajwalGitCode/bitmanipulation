import java.util.*;


//========== User's Code Starts Here ==========
class Solution {
    public boolean hasAlternatingBits(int n) {
        int pr = n & 1; 


        while (n != 0) {
            n >>= 1; 
            int cu = n & 1; 
            

            if (cu == pr) {
                return false; 
            }
            
            pr = cu; 
        }
        
        return true; 
    }
}

//========== User's Code Ends Here ==========



public class Main
{
   
   
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution s =new Solution();
        boolean max= s.hasAlternatingBits(n);
        System.out.println(max);
    }
}
