/* Write a program to print the factors of a given number.
Input: 12
Output: Factors of 12 are 1,2,3,4,6,12
Input: 11
Output: Factors of 11 are 1,11  */

import java.io.*;
class For25 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number:");
int num = Integer.parseInt(br.readLine());
System.out.print("Factors of "+num+" are ");
for(int i=1; i<=num; i++){
if(num%i==0){
System.out.print(i+",");
}
}
}
}
