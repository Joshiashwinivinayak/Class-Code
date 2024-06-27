/* Write a program to take a range as input from the user and print perfect squares between 
that range.
Input: Enter start: 1
Enter end: 100
Output: perfect squares between 1 and 100 */

import java.io.*;
class NestedFor59 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter start:");
int num1 = Integer.parseInt(br.readLine());
System.out.println("Enter end:");
int num2 = Integer.parseInt(br.readLine());
System.out.println("perfect squares between "+num1+" and "+num2);
for(int i=1; i<=num2; i++){
if(i*i>=num1 && i*i<=num2){
System.out.print(i*i+" ");
}
}
}
}

