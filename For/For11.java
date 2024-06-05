/* Write a program to calculate the factorial of the given
number.
Input: 6
Output: factorial 6 is 720 */
class For11 {
public static void main(String [] args){
int n=6, fact=1;
for(int i=1; i<=n; i++){
fact = fact * i;
}
System.out.println("Factorial of "+n+" is "+fact);
}
}
