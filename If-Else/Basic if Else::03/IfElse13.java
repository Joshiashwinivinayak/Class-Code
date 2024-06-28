/* 4. Write a program to check whether the given Character is in UPPERCASE (Capital) or
in lowercase. (take hardcoded values)
Input: ch = ‘a’;
Output: a is a lowercase character
Input: ch = ‘A ’;
Output: A is an UPPERCASE character   */

class IfElse13 {
public static void main(String [] args){
char ch = 'a';
if(ch>=97 && ch<=128){
System.out.println(ch+" is a lowercase character.");
} else if(ch>=65 && ch<=90){
System.out.println(ch+" is a UPPERCASE character.");
}
}
}
