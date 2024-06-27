/* Write a program to take a range as input from the user and print perfect cubes between that 
range.
Input: Enter start: 1
Enter end: 100
Output: perfect cubes between 1 and 100  */

import java.io.*;
class NestedFor60 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter start:");
int num1 = Integer.parseInt(br.readLine());
System.out.println("Enter end:");
int num2 = Integer.parseInt(br.readLine());
System.out.println("perfect cubes between "+num1+" and "+num2);
for(int i=1; i<=num2; i++){
if(i*i*i>=num1 && i*i*i<=num2){
System.out.print(i*i*i+" ");
}
}
}
}
