//4.You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
//        Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
//        You need to find and return that number which is unique in the array/list.
//        Note:
//        Unique element is always present in the array/list according to the given condition.
//        Sample Input 1:
//        7
//        2 3 1 6 3 6 2
//        Sample Output 1:
//        1
//        Explanation: The array is [2, 3, 1, 6, 3, 6, 2]. Here, the numbers 2, 3, and 6 are present twice, and the number 1 is present only once. So, the unique number in this array is 1.
package DAY_2.Assignment_1;

import java.util.Scanner;

public class Q4
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
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(arr[i]+ " ");
            }
        }

    }
}
