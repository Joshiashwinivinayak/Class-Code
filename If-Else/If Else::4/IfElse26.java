/* 7. Calculate the profit or loss.
Write a program that takes cost price and selling price(take it hardcoded) and calculates its
profit or loss.
Input 1:
sellingPrice: 1200
costPrice: 1000
Output: Profit of 200
Input 2:
sellingPrice: 300
costPrice: 500
Output: loss of 200
Input 3:
sellingPrice: 900
costPrice: 900
Output: No profit no loss  */

class IfElse26 {
public static void main(String [] args){
int SP = 1200, CP = 1000;
if(SP>CP){
System.out.println("Profit of "+(SP-CP));
} else if(CP>SP){
System.out.println("Loss of "+(CP-SP));
} else {
System.out.println("No profit no loss");
}
}
}
