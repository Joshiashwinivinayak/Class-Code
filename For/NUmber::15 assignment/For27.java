/* Write a program to check whether the given number is composite or
not.
Input: 6
Output: 6 is a composite number.
Input: 11
Output: 11 is not a composite number.  */

import java.io.*;
class For27 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number:");
int num = Integer.parseInt(br.readLine());
int count = 0;
for(int i=1; i<=num; i++){
if(num%i==0){
count++;
}
}
if(count>2){
System.out.println(num+" is a composite number.");
} else {
System.out.println(num+" is not a composite number.");
}
}
}
