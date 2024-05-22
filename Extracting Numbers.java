import java.util.*;


//========== User's Code Starts Here ==========
class Solution {
    public List<Integer> extract_number(String s) {
        List<Integer> numbers = new ArrayList<>();
        
 int length = s.length();
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(s.charAt(i))) {
                int num = 0;
                while (i < length && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                numbers.add(num);
            }
        }
        
        return numbers;
    }
}
//========== User's Code Ends Here ==========


public class Main
{
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String y=sc.nextLine();
        Solution s = new Solution();
        List<Integer> max= s.extract_number(y);
        for(int i:max)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
