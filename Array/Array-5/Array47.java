/* Q7. WAP
to find the composite numbers in an array.
Example :
Input:
Enter the size of the array:
6
Enter the elements of the array:
10
22
3
31
50
3
Output:
Composite numbers in an array are: 10, 22, 50   */

import java.io.*;
class Array47 {
	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size:");
		int size = Integer.parseInt(br.readLine());
		int arr[]=new int[size];
System.out.println("Enter array elements:");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.print("Composite numbers in an array are: ");
		for(int i=0; i<arr.length; i++){
			int count=0;
			for(int j=1; j<=arr[i]; j++){
				if(arr[i]%j==0){
					count++;
				}
			}
			if(count>2){
				System.out.print(arr[i]+" ,");
			}
		}
	}
}
