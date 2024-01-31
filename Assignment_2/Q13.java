//13.Search Insert Position
//        You are given a sorted array 'arr' of distinct values and a target value 'm'.
//        You need to search for the index of the target value in the array.
//        Note:
//        If the value is present in the array, return its index.
//        If the value is absent, determine the index where it would be inserted in the array while maintaining the sorted order.
//        Example:
//        Input:  arr = [1, 2, 4, 7],  m = 6
//        Output: 3
//        Explanation: If the given array 'arr' is: [1, 2, 4, 7] and m = 6. We insert m = 6 in the array and get 'arr' as: [1, 2, 4, 6, 7]. The position of 6 is 3 (according to 0-based indexing)
//        Note:
//        1) The given array has distinct integers.
//        2) The given array may be empty.
//
//        Sample Input 1:
//        4 9
//        1 2 4 7
//
//        Sample Output 1:
//        4
//
//        Explanation of Input 1:
//        The given array 'arr' is: [1, 2, 4, 7] and m = 9. We insert m = 9 in the array and get 'arr' as: [1, 2, 4, 7, 9]. The position of 9 is 4 (according to 0-based indexing).
//

package DAY_2.Assignment_2;
import java.util.Scanner;
public class Q13
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
        System.out.println("Enter the element which you want to insert");
        int m=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<m)
            {
                continue;
            }
            else if(arr[i]>m)     //missing
            {
                System.out.println("The position where it needs to be inserted");
                System.out.println(i);
            }
            else if(arr[i]==m)
            {
                System.out.println("The element is present at "+ i);
                break;
            }
            else      //if element is missing & should have to be present at last
            {
                System.out.println("The position where it needs to be inserted is: "+ arr.length);
            }
        }
    }
}
