/* 8. Write a program where you have to store the employee’s age working at a company,
take count of employees from the user.Take input from the user.  */

import java.io.*;
class Array8 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter no.of employees:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
for(int i=0; i<arr.length; i++){
System.out.print("Enter "+(i+1)+" employee's age:");
arr[i]=Integer.parseInt(br.readLine());
}
}
}
