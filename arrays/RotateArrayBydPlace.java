import java.util.*;
public class RotateArrayBydPlace
{

	public static void main(String[] args)
	{
		//   int a[] ={1, 2, 3, 4, 5, 6};
		// int d=7;

		// int n=a.length;
		//     d/=n;
		//   for(int i=1;i<=4;i++){
		//       int temp=a[0];
		//       for(int j=1;j<a.length;j++)
		//       {
		//           a[j-1]=a[j];
		//       }
		//       a[a.length-1]=temp;
		//   }
		//   System.out.println(Arrays.toString(a));

		// 2nd Approch
		// int a[] ={1, 2, 3, 4, 5, 6};
		// int d=7;

		// int n=a.length;
		// d/=n;

		// int temp[]=new int[n];
		// for(int i=0;i<n-d;i++)
		// {
		//     temp[i]=a[i+d];
		// }

		// for(int i=0;i<d;i++)
		// {
		//     temp[n-d+i]=a[i];
		// }
		// System.out.println(Arrays.toString(temp));

		//3rd Approch
		int a[] = {1, 2, 3, 4, 5, 6};
		int d=7;

		int n=a.length;
		d/=n;

		int i=0,j=d-1;
		while(i<j) {
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			i++;
			j--;
		}

		i=d;
		j=a.length-1;
		while(i<j) {
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			i++;
			j--;
		}

		i=0;
		j=a.length-1;
		while(i<j) {
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));





	}
}
