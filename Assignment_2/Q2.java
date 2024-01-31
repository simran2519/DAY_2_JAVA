//2.You are given a sorted integer array 'arr' of size 'n'.
//        You need to remove the duplicates from the array such that each element appears only once.
//        Return the length of this new array.
//        Note:
//        Do not allocate extra space for another array. You need to do this by modifying the given input array in place with O(1) extra memory.
//        For example:
//        'n' = 5, 'arr' = [1 2 2 2 3].
//        The new array will be [1 2 3].
//        So our answer is 3.
//        Sample input 1:
//        10
//        1 2 2 3 3 3 4 4 5 5
//        Sample output 1:
//        5
//        Explanation of sample input 1:
//        The new array will be [1 2 3 4 5].
//        So our answer is 5.
package DAY_2.Assignment_2;

import java.util.HashSet;
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
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        int k=set.size();    //The size of new array
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        for(int i=0;i<k;i++) //k will be the size of new array after removing duplicates
        {
            System.out.print(arr[i]+ " ");
        }
    }
}












//    static int RemoveDuplicates(int arr[]) {
//        int i = 0;                                //i     j
//        for (int j = 1; j < arr.length; j++)           //2 2 2 5 5 8
//        {
//            if (arr[i] != arr[j])                     //here when 2!=5 then arr[i]=arr[j] i.e.
//            {                                       //
//                i++;
//                arr[i] = arr[j];
//            }
//        }
//        return i + 1;                   //for Returning Size of new Array
//    }
//    static void printarray(int arr[],int n)
//    {
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(arr[i] + " ");
//        }
//    }

//    public static void main(String[] args) {
//        int arr[]= {2,2,2,5,5,8,9,9,9,10};
//        System.out.println("Array before Removing Duplicates : ");
//        printarray(arr,10);
//        System.out.println();
//
//        System.out.println("Array after removing duplicates");
//        int newSize = RemoveDuplicates(arr);
//        System.out.println("Size of array after removing Duplicacy  " + newSize);
//        printarray(arr,newSize);
