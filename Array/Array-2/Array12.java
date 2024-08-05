/* 2.WAP to print the sum of elements divisible by 3 in the array, where you have to take the
size and elements from the user.
Example:
Enter size : 8
9 13 5 13 6 22 36 10
output:
Elements divisible by 3 : 9 6 36
Sum of elements divisible by 3 is: 51  */

import java.io.*;
class Array12 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.print("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
int sum = 0;
System.out.println("Elements divisible by 3:");
for(int i=0; i<arr.length; i++){
if(arr[i]%3==0){
System.out.println(arr[i]+" ");
sum = sum + arr[i];
}
}
System.out.println("Sum of elements divisible by 3 is: " +sum);
}
}
