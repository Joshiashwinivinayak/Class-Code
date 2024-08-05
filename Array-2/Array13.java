/* 3.WAP to check if there is any vowel in the array of characters if present then print its
index, where you have to take the size and elements from the user.
Example:
Input:
Enter the size
5
Enter elements:
arEKO
Output:
vowel a found at index 0
vowel E found at index 2
vowel O found at index 4   */

import java.io.*;
class Array13 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
char arr[]=new char[size];
System.out.print("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=(char)br.read();
br.skip(1);
}
for(int i=0; i<arr.length; i++){
if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
System.out.println("Vowel "+arr[i]+" found at index "+i);
}
}
}
}
