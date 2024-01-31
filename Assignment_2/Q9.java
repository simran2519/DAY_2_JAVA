//9.Longest Consecutive Sequence
//        You are given an unsorted array/list 'ARR' of 'N' integers. Your task is to return the length of the longest consecutive sequence.
//        The consecutive sequence is in the form ['NUM', 'NUM' + 1, 'NUM' + 2, ..., 'NUM' + L] where 'NUM' is the starting integer of the sequence and 'L' + 1 is the length of the sequence.
//        Note:
//
//        If there are any duplicates in the given array we will count only one of them in the consecutive sequence.
//        For example-
//        For the given 'ARR' [9,5,4,9,10,10,6].
//
//        Output = 3
//        The longest consecutive sequence is [4,5,6].
//        Follow Up:
//        Can you solve this in O(N) time and O(N) space complexity?
//        Sample Input 1 :
//        1
//        5
//        33 20 34 30 35
//        Sample Output 1 :
//        3
//        Explanation to Sample Input 1 :
//        The longest consecutive sequence is [33, 34, 35].
package DAY_2.Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class Q9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element of arr");
        for(int i =0 ;i<arr.length ;i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); //First of sort the array
        int i = 1 , max = 0;
        int last = 0 ;
        int count = 1;
        while(i<=n-1){
            if(arr[i] == arr[i-1] + 1)
            {
                count++;
            }
            else{
                count= 1;
            }
            if(count>=max){
                max = count;
                last = i;
            }
            i++;
        }
        System.out.println("longest subsequence is ");
        for(int j = last-max+1 ;j<= last ;j++){
            System.out.print(arr[j] + " ");
        }
    }
}
