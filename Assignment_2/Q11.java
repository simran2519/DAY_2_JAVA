//11.Merge Sort
//        Given a sequence of numbers ‘ARR’. Your task is to return a sorted sequence of ‘ARR’ in non-descending order with help of the merge sort algorithm.
//        Example :
//        Merge Sort Algorithm -
//
//        Merge sort is a Divide and Conquer based Algorithm. It divides the input array into two-parts, until the size of the input array is not ‘1’. In the return part, it will merge two sorted arrays a return a whole merged sorted array.
//
//        Sample Input 1 :
//        2
//        7
//        3 4 1 6 2 5 7
//        4
//        4 3 1 2
//        Sample Output 1 :
//        1 2 3 4 5 6 7
//        1 2 3 4
//        Explanation For Sample Input 1:
//        Test Case 1 :
//
//        Given ‘ARR’ : { 3, 4, 1, 6, 2, 5, 7 }
//
//        Then sorted 'ARR' in non-descending order will be : { 1, 2, 3, 4, 5, 6, 7 }. Non-descending order means every element must be greater than or equal to the previse element.
package DAY_2.Assignment_2;

import java.util.Scanner;

public class Q11
{
    void conquer(int arr[],int s, int e , int mid)
    {
        int ans[]=new int[e-s+1];
        int inx1=s;
        int inx2=mid+1;
        int k=0;
        while(inx1 <=mid && inx2<=e)
        {
            if(arr[inx1]<=arr[inx2])
            {
                ans[k++]= arr[inx1++];
            }
            else
            {
                ans[k++]= arr[inx2++];
            }
        }
        while(inx1<=mid)
        {
            ans[k++]=arr[inx1++];

        }
        while(inx2<=e)
        {
            ans[k++]= arr[inx2++];
        }
        for(int i=0,j=s;i<ans.length;i++,j++)
        {
            arr[j]= ans[i];
        }
    }
    public void divide(int arr[],int s,int e)
    {
        if(s>=e)
        {
            return;
        }
        int mid = s+(e-s)/2;
        divide(arr,s,mid);
        divide(arr,mid+1,e);
        conquer(arr,s,e,mid);
    }
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
//MERGE SORT
        int s = 0;
        int e=arr.length-1;
        Q11 obj = new Q11();
        obj.divide(arr,s,e);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }


    }
}


