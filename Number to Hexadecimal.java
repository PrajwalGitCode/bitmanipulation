import java.util.*;


//========== User's Code Starts Here ==========
class Solution {
    public String toHex(int num) {

        StringBuilder s = new StringBuilder();
        while(num!=0){
            int rem = num & 15;
            char hex = (char) (rem<10 ? rem+'0': rem-10+'a');
            s.append(hex);
            num>>>=4;
        }
        return s.reverse().toString();
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
        String max= s.toHex(n);
        System.out.println(max);
    }
}
