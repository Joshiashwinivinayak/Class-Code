/* Take n as input.count all its factors and print its count.
input : 6
output : 4 */
class For6 {
public static void main(String [] args){
int n=6, count=0;
for(int i=1; i<=n; i++){
if(n%i==0){
count++;
}
}
System.out.println(count);
}
}
