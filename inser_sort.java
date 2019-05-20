import java.util.*;

public class inser_sort 
{
	public static void main(String[] args) 
	{

	int n, i = 0, key = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array:");

        n = s.nextInt();

        int a[] = new int[n];
        System.out.println("Enter all the elements:");

	for(int k = 0; k < n; k++)
		a[k] = s.nextInt();


        //Sort them using insertion sort
		
	for(int j = 1; j<a.length; j++)
		{
		key = a[j];
		i = j - 1;
		while (i > -1 && a[i] > key)
			{
			a[i+1] = a[i];
			i = i - 1;
			}
		a[i+1] = key;
		}
	//Output the sorted array
	System.out.println(Arrays.toString(a));	
					

        }//Main ends

}