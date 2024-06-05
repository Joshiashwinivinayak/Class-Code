//Write a program to print the first ten, 3 digit number
class For17 {
public static void main(String [] args){
int n=110;
for(int i=1; i<n; i++){
int temp=i, count=0;
while(temp!=0){
count++;
temp=temp/10;
}
if(count==3){
System.out.println(i);
}
}
}
}
