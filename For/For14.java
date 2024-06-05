/* Write a program to print the countdown of days to submit the
assignment
Input : day = 7
Output: 7 days remaining
6 days remaining
5 days remaining
.
.
1 days remaining
0 days Assignment is Overdue */
class For14 {
public static void main(String [] args){
int day = 5;
for(int i=day; i>=1; i--){
if(day==0){
System.out.println("0 days Assignment is Overdue");
}
else {
System.out.println(i+" days are remaining");
}
}
}
}
