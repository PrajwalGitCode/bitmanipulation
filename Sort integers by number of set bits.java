import java.util.*;


//========== User's Code Starts Here ==========
class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            int num = arr[i];
            while (num != 0) {
                count += num & 1;
                num >>= 1;
            }
            res[i] = count * 10001 + arr[i];
        }
        Arrays.sort(res);
        for (int i = 0; i < n; i++) {
            res[i] %= 10001;
        }
        return res;
        
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
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] output = s.sortByBits(arr);
        for(int i=0;i<n;i++)
            System.out.print(output[i]+" ");
        System.out.println();
    }
}
