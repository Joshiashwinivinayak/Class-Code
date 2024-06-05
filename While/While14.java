class While14 {
public static void main(String [] args){
int n=2332 , rem=0;
int temp=n;
while(temp!=0){
rem=rem * 10 + (temp%10);
temp=temp/10;
}
if(n == rem){
System.out.println(n+" is palindrome");
}
else{
System.out.println(n+" is not palindrome");
}
}
}
