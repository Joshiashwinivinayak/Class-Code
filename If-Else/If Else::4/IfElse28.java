/* 9. Write a program in java to accept three numbers and check whether they are
pythagorean triplets or not.
Example:
a=3, b=4,c=5
If
a*a+b*b =c*c
Its pythagorean triplet
Else
Not a pythagorean triplet
Input:
a=3,b=4,c=5
Output : it is a pythagorean triplet
Input:
a=2,b=2,c=2
Output : it is not a pythagorean triplet   */

class IfElse28 {
public static void main(String [] args){
int a=3, b=4, c=5;
if((c*c==a*a+b*b) ||(a*a==b*b+c*c)||(b*b==a*a+c*c)){
System.out.println("Its pythagorean triplet");
} else {
System.out.println("Its not pythagorean triplet");
}
}
}
