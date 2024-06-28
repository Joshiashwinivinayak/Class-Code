/* /* Write a program to reverse the given number.
Input : 7853
Output : Reverse of 7853 is 3587.  */

import java.io.*;
class For29 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number:");
int num = Integer.parseInt(br.readLine());
int temp = num;
int rev = 0;
while(num!=0){
int rem = num%10;
rev = rev * 10 + rem;
num = num / 10;
}
System.out.println("Reverse of "+temp+" is "+rev);
}
}
