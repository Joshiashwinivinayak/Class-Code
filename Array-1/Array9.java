/* 9. Write a program where you have to print the odd indexed elements. Take input from
the user
Example :
Enter size: 10.
1 2 3 4 5 6 7 8 9 10
2 is C
4 is an odd indexed element
6 is an odd indexed element
8 is an odd indexed element
10 is an odd indexed element   */

import java.io.*;
class Array9 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.print("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
for(int i=0; i<arr.length; i++){
if(i%2==1){
System.out.println(arr[i]+" is an odd indexed element");
}
}
}
}
