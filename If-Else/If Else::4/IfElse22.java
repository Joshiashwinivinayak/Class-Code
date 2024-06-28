/* Write a program to check whether the given character is a vowel or consonant.(take hard
coded values)
Input 1: ‘a’
Output: a is vowel
Input 2: ‘D’
Output: D is consonant */

class IfElse22 {
public static void main(String [] args){
char ch='a';
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
System.out.println(ch+" is vowel");
} else {
System.out.println(ch+" is consonant");
}
}
}
