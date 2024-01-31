//7.  K Largest Element
//        You are given an unsorted array containing ‘N’ integers. You need to find ‘K’ largest elements from the given array. Also, you need to return the elements in non-decreasing order.
//        Where ‘T’ is the number of test cases, ‘N’ is the size of the array, ‘K’ is the number of elements you need to return as an answer and ARR[i] is the size of the array of elements.
//        Sample Input 1:
//        2
//        4 2
//        3 4 2 1
//        5 1
//        2 2 3 3 1
//        Sample Output 1:
//        3 4
//        3
//        Explanation for sample input 1:
//        Test case 1:
//        If we sort the array then it will look like: [1, 2, 3, 4]. The 2 largest elements will be [3, 4].
//
//        Test case 2:
//        If we sort the array then it will look like: [1, 2, 2, 3, 3]. Then the largest element will be [3].
package DAY_2.Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class Q7
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
        Arrays.sort(arr); //1 2 3 4 4
        System.out.println("Enter the no. of largest element you want to find");
        int k=sc.nextInt();
        int ans[]= new int[k];
        int count=0;
        int i=arr.length-1;    //starting the loop from last
        while(count!=k)        //when we got the required no. of largest elements then loop will be stopped
        {
            if(arr[i]!=arr[i-1])
            {
                ans[count]=arr[i];     //4 3
                count++;
                i--;
            }
            else
            {
                i--;         //If the duplicates of largest element is present
            }
        }
        Arrays.sort(ans);
        for(int j=0;j<ans.length;j++)
        {
            System.out.print(ans[j]+ " ");
        }
    }
}
