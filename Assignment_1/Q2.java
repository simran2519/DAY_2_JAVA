//2.Given an array/list 'ARR' of integers and a position ‘M’. You have to reverse the array after that position.
//        Example:
//        We have an array ARR = {1, 2, 3, 4, 5, 6} and M = 3 , considering 0
//        based indexing so the subarray {5, 6} will be reversed and our
//        output array will be {1, 2, 3, 4, 6, 5}.
package DAY_2.Assignment_1;

import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the position");
        int m= sc.nextInt();
        int left=m+1;
        int right=arr.length-1;
        while(left<right)
        {
           int temp= arr[left];
           arr[left]=arr[right];
           arr[right]=temp;
           left++;
           right--;
        }
        System.out.println("New Array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
