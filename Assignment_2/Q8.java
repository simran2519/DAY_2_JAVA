//8. Merge K Sorted Arrays
//        You have been given ‘K’ different arrays/lists, which are sorted individually (in ascending order). You need to merge all the given arrays/list such that the output array/list should be sorted in ascending order.
//        Sample Input 1:
//        1
//        2
//        3
//        3 5 9
//        4
//        1 2 3 8
//        Sample Output 1:
//        1 2 3 3 5 8 9
//        Explanation of Sample Input 1:
//        After merging the two given arrays/lists [3, 5, 9] and [ 1, 2, 3, 8], the output sorted array will be [1, 2, 3, 3, 5, 8, 9].
package DAY_2.Assignment_2;

import java.util.Scanner;

public class Q8
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Arrays you want to take");
        int A=sc.nextInt();
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter the array Elements");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int sum=n;
        for(int l=2;l<=A;l++)        //starting from array 2nd
        {
            System.out.println("Enter the size of array");
            int m=sc.nextInt();
            int arr2[]=new int[m];
            System.out.println("Enter the array Elements");
            for(int i=0;i<m;i++)
            {
                arr2[i]=sc.nextInt();
            }
            sum=sum+m;
        }
        System.out.println(sum);
        int ans[]=new int[sum];
        int k=0;
        for(int i=0;i<arr1.length;i++)
        {
            ans[i]=arr1[i];
            k++;
        }
        int newv=k;





//        System.out.println("Enter the size of array");
//        int m=sc.nextInt();
//        int arr2[]=new int[m];
//        System.out.println("Enter the array Elements");
//        for(int i=0;i<m;i++)
//        {
//            arr2[i]=sc.nextInt();
//        }
//        int ans[]= new int[arr1.length+arr2.length];


//        int k=0;
//        for(int i=0;i<arr1.length;i++)
//        {
//            ans[i]=arr1[i];
//            k++;
//        }
//        int j=0;  //for 2nd array
//        for(int i=k;i<ans.length;i++)
//        {
//            ans[i]=arr2[j];
//            j++;
//        }
//        for(int i=0;i<ans.length;i++) {
//            System.out.print(ans[i]+ " ");
//        }
    }
}
