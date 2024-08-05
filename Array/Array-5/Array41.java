/* Q1. WAP to check whether the array is in ascending order or not.
Input 1:
Enter the size of the array:
4
Enter the elements of the array:
1
5
9
15
Output 1:
The given array is in ascending Order.
Input 2 :
Enter the size of the array:
4
Enter the elements of the array:
1
5
9
7
Output 2 :
The given array is not in ascending Order.
*/

import java.io.*;
class Array41 {
	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size:");
		int size = Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int sum=0;
		for(int i=1; i<=size-1; i++){
			sum=sum+i;
		}
		System.out.println("Enter array elements:");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int count=0;
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]<arr[j]){
					count++;
				} else{
					System.out.println("The given array is not in ascending Order. ");
					break;
				}
			}
		}
		if(count==sum){
			System.out.println("The given array is in ascending Order.");
		}
	}
}
