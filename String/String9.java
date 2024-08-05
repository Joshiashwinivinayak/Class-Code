/* 9. WAP to replace all the ‘a’ with ‘e’ in a string
Input str = “We all appeared at American show.”
Output str = “We ell eppeered et Americen show”  */

import java.util.*;
class String9 {
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string :");
String str = sc.nextLine();
char arr[] = str.toCharArray();
for(int i=0; i<arr.length; i++){
if(arr[i]=='a'){
arr[i]='e';
}
}
System.out.print(arr);
}
}

