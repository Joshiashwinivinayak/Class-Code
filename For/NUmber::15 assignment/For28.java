/* Q5 Write a program to print the factorial of the number.
Input : 5
Output : Factorial of 5 is 120. */

import java.io.*;
class For28 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number:");
int num = Integer.parseInt(br.readLine());
int fact = 1;
for(int i=1; i<=num; i++){
fact = fact * i;
}
System.out.println("Factorial of "+num+" is "+fact);
}
}
