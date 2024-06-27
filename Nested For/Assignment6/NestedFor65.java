/* write a program to print a series of strong numbers from entered range. ( Take a start and 
end number from a user )
Input:-
Enter starting number: 1
Enter ending number: 150
Output:-
Output: strong numbers between 1 and 150
1 2 145  */

import java.io.*;
class NestedFor65 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter start:");
int num1 = Integer.parseInt(br.readLine());
System.out.println("Enter end:");
int num2 = Integer.parseInt(br.readLine());
System.out.println("Strong numbers between "+num1+" and "+num2);

for(int i=num1; i<=num2; i++){
int sum = 0;
int num = i;
while(num!=0){
int fact = 1;
int rem = num % 10;
for(int j=1; j<=rem; j++){
fact = fact * j;
}
sum = sum + fact;
num=num/10;
}
if(sum==i){
System.out.print(i+" ");
}
}
}
}

