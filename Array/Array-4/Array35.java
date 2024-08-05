/* 5. WAP to reverse the array(take input from the user).
Example:
Input:
Enter the size of the array:
6
Enter the elements of the array:
1
2
3
4
5
6
Output:
Reversed array:
6
5
4
3
2
1  */

import java.io.*;
class Array35 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
System.out.println("Reversed array:");
for(int i=arr.length-1; i>=0; i--){
System.out.println(arr[i]);
}
}
}
