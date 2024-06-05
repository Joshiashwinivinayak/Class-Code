class While11 {
public static void main(String [] args){
int n=7, i=7;
while(i>=1){
if(n%2==0){
System.out.println(i);
i--;
}else if(n%2!=0){
System.out.println(i);
i=i-2;
}
}
}
}
