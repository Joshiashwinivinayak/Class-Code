/* 6. WAP to count the vowels and consonants in the given array(Take input from the user)
Example:
Enter the size of the array:
6
Enter the elements of the array:
a
E
P
o
U
G
Output:
Count of vowels:
4
Count of consonants: 2  */

import java.io.*;
class Array36 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
char arr[]=new char[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=(char)br.read();
br.skip(1);
}
int count1 = 0, count2 = 0;
for(int i=0; i<arr.length; i++){
if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'||arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
count1++;
} else {
count2++;
}
}
System.out.println("Count of Vowels: "+count1);
System.out.println("Count of consonants: "+count2);
}
}
