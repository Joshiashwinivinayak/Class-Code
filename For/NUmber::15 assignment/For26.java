/* Write a program to check whether the given number is prime or not.
Input: 7
Output: 7 is a prime number.
Input: 12
Output: 12 is not a prime number.  */

import java.io.*;
class For26 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number:");
int num = Integer.parseInt(br.readLine());
int count=0;
for(int i=1; i<=num; i++){
if(num%i==0){
count++;
}
}
if(count > 2){
System.out.println(num+" is not a prime number.");
} else {
System.out.println(num+" is a prime number.");
}
}
}
