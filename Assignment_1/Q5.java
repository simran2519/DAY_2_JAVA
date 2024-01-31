//5.You are given a number ‘N’ and a query ‘Q.’ If ‘Q’ is 1, then you have to return the sum of all integers from 1 to ‘N,’ else if ‘Q’ is equal to 2 then you have to return the product of all integers from 1 to ‘N.’ Since the product can be very large, return it modulo 10 ^ 9 + 7.
//        For example
//        Given ‘N’ = 4, ‘Q’ = 1.
//        Then the answer is 10 because the sum of all integers between 1 and 4 are 1, 2, 3, and 4. Hence 1 + 2 + 3 + 4 is equal to 10.
//        Sample Input 1 :
//        2
//        4 1
//        4 2
//        Sample Output 1 :
//        10
//        24
//        Explanation of the Sample Input 1:
//        In the first test case, the answer is 10 because all integers between 1 and 4 are 1, 2, 3, and 4. Hence 1 + 2 + 3 + 4 is equal to 10.
//        In the second test case, the answer is 25 because all integers between 1 and 4 are 1, 2, 3, and 4. Hence 1 * 2 * 3 * 4 is equal to 24.
package DAY_2.Assignment_1;
import java.util.Scanner;
public class Q5
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the query");
        int q=sc.nextInt();
        int sum=0;
        int pro=1;
        if(q==1)
        {
            for(int i=1;i<=n;i++)
            {
                sum= sum+i;
            }
            System.out.println("The sum is : "+sum);
        }
        else if(q==2)
        {
            for(int i=1;i<=n;i++)
            {
                pro=pro*i;
            }
            System.out.println("The product is: "+ pro);
        }
    }
}
