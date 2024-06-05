/* Take n as input.print its factors.
input : 6
output : 1 2 3 6 */
class For5 {
public static void main(String [] args){
int n = 6;
for(int i=1; i<=n; i++){
if(n%i==0){
System.out.println(i);
}
}
}
}
