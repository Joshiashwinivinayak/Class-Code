/* 3. Write a program to check whether the given number is even or odd and also check
whether the given number is greater than 10 or not. (take hardcoded values)
Input: num =13;
Output: 13 is an odd number and greater than 10.
Input: num =8;
Output: 8 is an even number and less than 10;
Input: num =10;
Output: 10 is an even number and equal to 10; */

class IfElse12 {
public static void main(String [] args){
int num = 8;
if(num%2==0 && num<10){
System.out.println(num+" is an even number and less than 10.");
} else if(num%2==1 && num<10){
System.out.println(num+" is an odd number and less than 10.");
} else if(num%2==0 && num>10){
System.out.println(num+" is an even number and greater than 10.");
} else if(num%2==1 && num>10){
System.out.println(num+" is an odd number and greater than 10.");
} else {
System.out.println(num+" is an even number and equal to 10.");
}
}
}
