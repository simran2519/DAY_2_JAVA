//1.Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
//        Sample Input 1:
//        3
//        9 8 9
//        Sample Output 1:
//        26
package DAY_2.Assignment_1;
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
//        System.out.println("The array elements are: ");
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("The sum of array Elements is : " + sum);


    }
}
