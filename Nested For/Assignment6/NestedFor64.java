/* Write a program to take range as input from the user and print Palindrome numbers. ( Take a 
start and end number from a user )
Input: Enter start: 100
Enter end: 250
Output: Palindrome numbers between 100 and 250
101 111 121 131 141 151 161 171 181 191 202 212 222  */

import java.io.*;
class NestedFor64 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter start:");
int num1 = Integer.parseInt(br.readLine());
System.out.println("Enter end:");
int num2 = Integer.parseInt(br.readLine());
System.out.println("palindrome numbers between "+num1+" and "+num2);
for(int i=num1; i<=num2; i++){
int rev = 0;
int num=i;
while(num!=0){
int rem = num % 10;
rev = rev * 10 +rem;
num=num/10;
}
if(i==rev){
System.out.print(i+" ");
}
}
}
}
