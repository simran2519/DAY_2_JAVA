//Insertion sort
package DAY_2.Assignment_2;

import java.util.Scanner;

public class Q12
{
    static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int arr[]= {5,6,2,1,7};
        System.out.println("Array before Sorting");
        printarray(arr);
        System.out.println();

        for(int i=1;i<arr.length;i++)
        {
            int key= arr[i];
            int j;
            for( j=i-1;j>=0;j--)
            {
                if(key<arr[j])
                {
                    arr[j+1]=arr[j];        //Right shift
                }
                else
                {
                    break;
                }
            }
            arr[j+1]=key;                 //putting the valure of key in the correct position
        }
        System.out.println("Array after sorting");
        printarray(arr);

    }
}
