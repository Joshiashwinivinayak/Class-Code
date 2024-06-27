/* Write a program to take range as input from the user and print perfect numbers.
{Note: Perfect number is the one whose perfect divisor’s addition is equal to that number.
6 is perfect number = 1 + 2 + 3 = 6}
Input: Enter start: 1
Enter end: 30
Output: perfect numbers between 1 and 30  */

import java.io.*;
class NestedFor61 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter start:");
int num1 = Integer.parseInt(br.readLine());
System.out.println("Enter end:");
int num2 = Integer.parseInt(br.readLine());
System.out.println("perfect numbers between "+num1+" and "+num2);

for(int i=num1; i<=num2; i++){
int rem=0;
for(int j=1; j<i; j++){
if(i%j==0){
rem = rem + j;
}
}
if(rem==i){
System.out.print(i+" ");
}
}
}
}
