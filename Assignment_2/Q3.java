//3.You are given an array of size ‘N’. The elements of the array are in the range from 1 to ‘N’.
//        Ideally, the array should contain elements from 1 to ‘N’. But due to some miscalculations, there is a number R in the range [1, N] which appears in the array twice and another number M in the range [1, N] which is missing from the array.
//        Your task is to find the missing number (M) and the repeating number (R).
//        For example:
//        Consider an array of size six. The elements of the array are { 6, 4, 3, 5, 5, 1 }.
//        The array should contain elements from one to six. Here, 2 is not present and 5 is occurring twice. Thus, 2 is the missing number (M) and 5 is the repeating number (R).
//        Follow Up
//        Can you do this in linear time and constant additional space?
package DAY_2.Assignment_2;

import java.util.Scanner;

public class Q3
{
    public static int[] missingRepeatingNumbers(int a[]) {
        int n = a.length; // size of the array
        int repeating = -1, missing = -1;

        //Finding the repeating and missing number:
        for (int i = 1; i <= n; i++) {
            //Count the occurrences:
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] == i) cnt++;
            }

            if (cnt == 2)
            {
                repeating = i;
            }
            else if (cnt == 0)
            {
                missing = i;
            }

            if (repeating != -1 && missing != -1)
                break;
        }
        int[] ans = {repeating, missing};
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int[] ans = missingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {"
                + ans[0] + ", " + ans[1] + "}");
    }
}












//    static int missing(int arr[])
//    {
//        int missing =0,count=1;
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]==count)
//            {
//                count++;
//            }
//            else
//            {
//                missing=count;
//                break;
//            }
//
//        }
//        return missing;
//    }
//
//    public static void main(String[] args)
//    {
//        int arr[]= {1,2,3,5};
//        int size = 5;
//
//        System.out.println("The missing element is ");
//
//        System.out.println(missing(arr));
//
//
//
//
//    }