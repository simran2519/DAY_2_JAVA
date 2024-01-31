//Sum of Two Arrays
package DAY_2.Assignment_2;

import java.util.Scanner;

public class Q6
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array1");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of array 2");
        int m=sc.nextInt();
        int arr2[]= new int[m];
        System.out.println("Enter the array Elements");
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int arr3[]= new int[n];
        for(int i=0;i<arr3.length;i++)
        {
            arr3[i]=arr1[i]+arr2[i];
        }
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+ " ");
        }
    }
}