/* 9. WAP to take a number from the user and store each element in an array by increasing
the element by one.
Example:
Input:
Enter the Number:
1569872365
Output:
2, 6, 7, 10, 9, 8, 3, 4, 7, 6
Explanation : Each digit in a number is increased by one and stored in an array  */

import java.io.*;
class Array49 {
public static void main(String[] args)  throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number:");
int num = Integer.parseInt(br.readLine());
int temp1=num;
int count=0;
while(temp1!=0){
count++;
temp1=temp1/10;
}
int arr[] = new int[count];
int temp2 = num;
while(temp2!=0){
for(int i=arr.length-1; i>=0; i--){
int rem = temp2 % 10;
rem++;
arr[i] = rem;
temp2 = temp2 / 10;
}
}
System.out.println("Array elements are :");
for(int i=0; i<arr.length; i++){
System.out.print(arr[i]+" ");
}
}
}
