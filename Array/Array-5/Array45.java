/* Q5. WAP to print the count of digits in elements of an array.
Example :
Input:
Enter the size of the array:
4
Enter the elements of the array:
1
225
32
356
Output:
1, 3, 2, 3 */

import java.io.*;
class Array45 {
	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size:");
		int size = Integer.parseInt(br.readLine());
		int arr[]=new int[size];
System.out.println("Enter array elements:");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0; i<arr.length; i++){
			int count = 0;
			int temp = arr[i];
			while(temp!=0){
				count++;
				temp = temp / 10;
			}
			System.out.print(count+" ,");
		}
	}
}
