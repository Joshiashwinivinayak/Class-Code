/* Q3. WAP
to check if an array is a palindrome or not.
Example :
Input:
Enter the size of the array:
6
Enter the elements of the array:
1
2
3
3
2
1
Output:
The given array is a palindrome array.  */

import java.io.*;
class Array43 {
	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size:");
		int size = Integer.parseInt(br.readLine());
		int arr[]=new int[size];
System.out.println("Enter array elements:");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int num = 0;
		for(int i=0; i<arr.length; i++){
			num = num * 10 + arr[i];
		}
		int rev = 0;
		int temp = num;
		while(temp!=0){
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if(rev==num){
			System.out.println("The given array is a palindrome array. ");
		} else {
			System.out.println("Given array is not palindrome array");
		}		
	}
}
