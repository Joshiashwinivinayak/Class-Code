/* Q2. WAP to print the sum of odd and even numbers in an array.
Enter the size of the array:
6
Enter the elements of the array:
10
15
9
1
12
15
Output:
Odd Sum = 40
Even Sum = 22  */

import java.io.*;
class Array42 {
	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size:");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int odd_sum=0, even_sum=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==1){
				odd_sum = odd_sum + arr[i];
			} else {
				even_sum = even_sum + arr[i];
			}
		}
		System.out.println("Odd sum= "+odd_sum);
		System.out.println("Even sum= "+even_sum);
	}
}
