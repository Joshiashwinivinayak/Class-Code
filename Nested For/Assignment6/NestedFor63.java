/* Write a program to take range as input from the user and print the reverse of all numbers.
(Take a start and end number from a user )
Input: Enter start: 100
Enter end: 200
Output: Palindrome numbers between 100 and 250 */

import java.io.*;
class NestedFor63 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter start:");
int num1 = Integer.parseInt(br.readLine());
System.out.println("Enter end:");
int num2 = Integer.parseInt(br.readLine());
System.out.println("Reverse of all numbers between "+num1+" and "+num2);
for(int i=num1; i<=num2; i++){
int rev = 0;
int num=i;
while(num!=0){
int rem = num % 10;
rev = rev * 10 +rem;
num=num/10;
}
System.out.print(rev+" ");
}
}
}
