/* Write a program to take range as input from the user and print Armstrong numbers. ( Take a 
start and end number from a user )
Input: Enter start: 1
Enter end: 1650
Output: Armstrong numbers between 1 and 1650
1 2 3 4 5 6 7 8 9 153 370 371 407 1634    */

import java.io.*;
class NestedFor66 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter start:");
int num1 = Integer.parseInt(br.readLine());
System.out.println("Enter end:");
int num2 = Integer.parseInt(br.readLine());
System.out.println("Armstrong numbers between "+num1+" and "+num2);
for(int i=num1; i<=num2; i++){
int count=0;
int temp1=i, temp2=i;
while(temp1!=0){
count++;
temp1 = temp1 / 10;
}
int sum =0;
while(temp2!=0){
int rem = temp2 % 10;
int mult = 1;
for(int j=1; j<=count; j++){
mult = mult * rem;
}
sum = sum + mult;
temp2 = temp2 / 10;
}
if(i==sum){
System.out.print(i+" ");
}
}
}
}
