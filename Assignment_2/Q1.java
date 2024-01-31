//1.You are given an array/list ARR consisting of N integers. Your task is to find all the distinct triplets present in the array which adds up to a given number K.
//        An array is said to have a triplet {ARR[i], ARR[j], ARR[k]} with sum = 'K' if there exists three indices i, j and k such that i!=j, j!=k and i!=j and ARR[i] + ARR[j] + ARR[k] = 'K'.
//        Note:
//        1. You can return the list of values in any order. For example, if a valid triplet is {1, 2, -3}, then {2, -3, 1}, {-3, 2, 1} etc is also valid triplet. Also, the ordering of different triplets can be random i.e if there are more than one valid triplets, you can return them in any order.
//        2. The elements in the array need not be distinct.
//        3. If no such triplet is present in the array, then return an empty list, and the output printed for such a test case will be "-1".
//        Sample Input 1:
//        5
//        10 5 5 5 2
//        12
//        Sample Output 1:
//        5 5 2
//        Explanation for Sample Input 1:
//        5 5 2 is the only triplet that adds up to 15. Note that the order of the output doesn’t matter, so 5 2 5 or 2 5 5 is also acceptable.
package DAY_2.Assignment_2;

import java.util.Scanner;

public class Q1
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
        System.out.println("Enter the target");
        int target=sc.nextInt();
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==target)
                    {
                        System.out.println(arr[i] + " "+arr[j]+" "+ arr[k]);
                    }
                }
            }
        }

    }
}
