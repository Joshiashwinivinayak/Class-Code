/* Q6. WAP to find the first prime number in an array.
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
First prime number found at index 2  */

import java.io.*;
class Array46 {
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
			for(int j=1; j<=arr[i]; j++){
				if(arr[i]%j==0){
					count++;
				}
			}
			if(count==2){
				System.out.println("First prime number found at index "+i);
				break;
			}
		}
	}
}
