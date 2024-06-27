/* Write a program to take 5 numbers as input from the user and print the count of digits in 
those numbers.
Input: Enter 5 numbers :
5
The digit count in 5 is 1
25
The digit count in 25 is 2
225
The digit count in 225 is 3
6548
The digit count in 6548 is 4
852347
The digit count in 852347 is 6   */

import java.io.*;
class NestedFor62 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 5 number:");
int num1 = Integer.parseInt(br.readLine());
int num2 = Integer.parseInt(br.readLine());
int num3 = Integer.parseInt(br.readLine());
int num4 = Integer.parseInt(br.readLine());
int num5 = Integer.parseInt(br.readLine());
int temp = num1;
int count1=0;
while(temp!=0){
count1++;
temp = temp / 10;
}
System.out.println("The digit count in "+num1+" is "+count1);
temp = num2;
int count2=0;
while(temp!=0){
count2++;
temp = temp / 10;
}
System.out.println("The digit count in "+num2+" is "+count2);
temp = num3;
int count3=0;
while(temp!=0){
count3++;
temp = temp / 10;
}
System.out.println("The digit count in "+num3+" is "+count3);
temp = num4;
int count4=0;
while(temp!=0){
count4++;
temp = temp / 10;
}
System.out.println("The digit count in "+num4+" is "+count4);
temp = num5;
int count5=0;
while(temp!=0){
count5++;
temp = temp / 10;
}
System.out.println("The digit count in "+num5+" is "+count5);
}
}
