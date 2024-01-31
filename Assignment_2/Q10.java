//Selection Sort
package DAY_2.Assignment_2;

import java.util.Scanner;

public class Q10
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

        //Selection Sorting
        for(int i=0;i<arr.length-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
                int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
