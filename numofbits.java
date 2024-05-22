import java.util.*;


//========== User's Code Starts Here ==========

//do not make the class solution public as there can be only
// one class public ( here is the main class) 
class Solution {
   // you need to treat n as an unsigned value
    public int hammingWeight(int n){
        int count=0;
        for(int i=0;i<=31;i++){
            if(((n>>i)&1)==1){
                count=count+1;
            }
        }
        return count;
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
        
        int output = s.hammingWeight(n);
        System.out.println(output);
    }
}
