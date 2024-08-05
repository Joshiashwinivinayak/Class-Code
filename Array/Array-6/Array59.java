/* 9. Write a program to count the palindrome elements in your array.
arr
121 1 58 333 616 9
Count of palindrome elements is : 5
(Single number is also a palindrome number) */

import java.io.*;
class Array59 {
public static void main(String[] args)  throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter first array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
int count = 0;
for(int i=0; i<arr.length; i++){
int temp=arr[i];
int rev=0;
while(temp!=0){
int rem = temp % 10;
rev=rev*10+rem;
temp=temp/10;
}
if(rev==arr[i]){
count++;
}
}
System.out.println("Count of palindrome elements is : "+count);
}
}

