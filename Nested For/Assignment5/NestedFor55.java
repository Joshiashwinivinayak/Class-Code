/* Write a program to take a number as input and print the Addition of Factorials of each
digit from that number.
Input: 1234
Output: Addition of factorials of each digit from 1234 = 33 */

import java.io.*;
class NestedFor55 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number:");
int num = Integer.parseInt(br.readLine());
int sum=0;
while(num!=0){
int fact = 1;
int rem=num%10;
for(int i=1; i<=rem; i++){
fact = fact * i;
}
num = num/10;
sum = sum + fact;
}
System.out.println(sum);
}
}
