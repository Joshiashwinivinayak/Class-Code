/* Write a program to print the sum of all even numbers and
multiplication of odd numbers between 1 to 10.
Output: sum of even numbers between 1 to 10 = 30
Multiplication of odd numbers between 1 to 10 = 945 */
class For12 {
public static void main(String [] args){
int sum=0, mul=1;
for(int i=1; i<=10; i++){
if(i%2==0){
sum = sum +i;
}
else {
mul=mul * i;
}
}
System.out.println("sum of even numbers between 1 to 10 = "+sum);
System.out.println("Multiplication of odd numbers between 1 to 10 = "+mul);
}
}
