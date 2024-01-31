//Bubble Sort
package DAY_2.Assignment_2;

public class Q14
{
    public static void main(String[] args)
    {
        int arr[]= {4,10,2,9,2,8,6,2 ,7};
        System.out.println("Array before sorting");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");

        }
        for(int i=0;i<(arr.length-1);i++) // This loop is for no. of rounds
        {
            for(int j=0;j<arr.length-1;j++)   //This loop is for comparison
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array after sorting");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");

        }

    }
}
