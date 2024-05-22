import java.util.*;


//========== User's Code Starts Here ==========
class Solution {
    public int divide(int dividend, int divisor) {    
        
        int cnt = 0;
        int a = Math.abs(dividend), b = Math.abs(divisor);
        
        while (a - b >= 0) {
            cnt++;
            a -= b;
        }
        
        return (dividend >= 0 && divisor >= 0) || (dividend <= 0 && divisor <= 0) ? cnt : -cnt;   
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
        int d = sc.nextInt();
        int max= s.divide(n,d);
        System.out.println(max);
    }
}
