/* Write a program, and take two characters if these characters are equal then print them as it 
is but if they are unequal then print their difference.
{Note: Consider Positional Difference Not ASCIIs}
Input: a p
Output: The difference between a and p is 15   */

import java.io.*;
class NestedFor52 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter first character:");
char ch = (char)br.read();
br.skip(1);
System.out.println("Enter second character:");
char cha = (char)br.read();
br.skip(1);
if(ch==cha){
System.out.println("Both characters are equal");
} else {
int diff = cha - ch;
System.out.println("The difference between "+ch+" and "+cha+" is "+diff);
} 
}
}
