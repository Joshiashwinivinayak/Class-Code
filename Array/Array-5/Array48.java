/* Q8. WAP to find the second minimum element in an array.
Example:
Input:
Enter the size:5
Enter the elements of the array:
10
2
31
4
0
Output:
The second largest element in the array is: 2  */

import java.io.*;
class Array48 {
	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size:");
		int size = Integer.parseInt(br.readLine());
		int arr[]=new int[size];
                System.out.println("Enter array elements:");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int min_num = 0;
		for(int i=0; i<arr.length; i++){
			int count=0;
			for(int j=0; j<arr.length; j++){
				if(arr[i]<arr[j]){
					count++;
				}
			}
			if(count==arr.length-1){
				min_num = arr[i];
			}
		}
		for(int i=0; i<arr.length; i++){
			int count=0;
			for(int j=0; j<arr.length; j++){
				if(arr[i]<arr[j] && arr[i]>min_num){
					count++;
				}
			}
			if(count==arr.length-2){
				System.out.println("Second minimum element in array :"+arr[i]);
			}
		}
	}
}
