/* 1.WAP to count the even numbers in an array where you have to take the size and
elements from the user. And also print the even numbers too
Example:
Enter size =8
1 12 55 65 44 22 36 10
Output : even numbers 12 44 22 36 10
Count of even elements is : 5  */

import java.io.*;
class Array11 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.print("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
int count = 0;
System.out.println("Even numbers:");
for(int i=0; i<arr.length; i++){
if(arr[i]%2==0){
System.out.println(arr[i]+" ");
count++;
}
}
System.out.println("Count of even elements is : "+count);
}
} 
