/* Write a program which take’s number from user’s if number is even
print that number in reverse order or if number is odd print that number in
reverse order by difference two?
Input:6
output:6 5 4 3 2 1
Input:7
output:7 5 3 1.*/
class For13 {
public static void main(String [] args){
int n=7;
if(n%2==0){
for(int i=n; i>=1; i--){
System.out.println(i);
}
}
else {
for(int i=n; i>=1; i=i-2){
System.out.println(i);
}
}
}
}
