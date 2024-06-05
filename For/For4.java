/* Take n as input.print its factorial.
imput : 5
output : 120 */
class For4 {
public static void main(String [] args){
int n = 5, fact=1;
for(int i=1; i<=n; i++){
fact = fact * i;
}
System.out.println("Factorial of "+n+" is "+fact);
}
}
