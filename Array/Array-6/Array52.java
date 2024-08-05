/* 2. Write a program to find out the sum of all prime numbers in an array and
also print the count of prime numbers in an array.
Example:
5 7 9 12 17 19 21 22
Output:
Sum of all prime numbers is 48 and count of prime numbers in the given array is 4 
*/

import java.io.*;
class Array52 {
public static void main(String[] args)  throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
int sum = 0, count1=0;
for(int i=0; i<arr.length; i++){
int count = 0;
for(int j=1; j<=arr[i]; j++){
if(arr[i]%j==0){
count++;
}
}
if(count==2){
count1++;
sum = sum + arr[i];
}
}
System.out.println("Sum of all prime numbers is "+sum+" and count of prime numbers in the given array is "+count1);
}
}
