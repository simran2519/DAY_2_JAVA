//3.You are given an arbitrary array ‘arr’ consisting of N non-negative integers, where every element appears thrice except one. You need to find the element that appears only once.
//        Sample Input 1:
//        4
//        1 2 1 1
//        Sample Output 1:
//        2
package DAY_2.Assignment_1;

import java.util.HashMap;
import java.util.Scanner;

public class Q3
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
//        for(int i=0;i<n;i++)
//        {
//            int count=0;
//            for(int j=0;j<n;j++)
//            {
//                if(arr[i]==arr[j])
//                {
//                    count++;
//                }
//            }
//            if(count==1)
//            {
//                System.out.println(arr[i]+ " ");
//            }
//        }

        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put((arr[i]),map.get(arr[i])+ 1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        if (map.containsValue(1)) {
            System.out.println(map);
          }




    }
}
