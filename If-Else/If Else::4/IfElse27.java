/* 8. Write a program to check whether the student passed with:
first class with distinction, first class, second class, pass and fail according to his percent
grades. (Y ou have to adjust range by your own for first class, second class and for pass)
Input 1: percent= 85.00
Output: Passed : first class with distinction
Input 2: percent=75.00
Output: Passed : first class with distinction
Input 3: percent=60.00
Output: Passed : first class
Input 4: percent=54.00
Output: Passed : second class
Input: percent=47
Output: Pass  */

class IfElse27 {
public static void main(String [] args){
float percentage = 60.00f;
if(percentage<=100 && percentage>85){
System.out.println("first class with distinction.");
} else if(percentage<=85 && percentage>70){
System.out.println("First class");
} else if(percentage<=70 && percentage>60){
System.out.println("Second class");
} else if(percentage<=60 && percentage>50){
System.out.println("Third class");
} else if(percentage<=50 && percentage>40){
System.out.println("Pass");
} else {
System.out.println("Fail");
}
}
}
