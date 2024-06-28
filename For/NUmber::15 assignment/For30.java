/* Write a program to check whether the given number is palindrome or
not.
Input : 12121
Output : 12121 is a palindrome number.
Input : 12345
Output : 12345 is not a palindrome number.   */

import java.io.*;
class For30 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number:");
int num = Integer.parseInt(br.readLine());
int rev = 0;
int temp = num;
while(temp!=0){
int rem = temp % 10;
rev = rev * 10 + rem;
temp = temp/10;
}
if(num == rev){
System.out.println(num+" is a palindrome number.");
} else {
System.out.println(num+" is not a palindrome number.");
}
}
}
