/* 6.Write a program to print the products of odd indexed elements in an array. Where you
have to take size input and elements input from the user.
Note:
Example:
Input:
Enter the size
6
Enter elements:
1
2
3
4
5
6
Output:
product of odd indexed elements : 48  */


import java.io.*;
class Array16 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
int product=1;
for(int i=0; i<arr.length; i++){
if(i%2==1){
product = product * arr[i];
}
}
System.out.println("product of odd indexed elements : "+product);
}
}
