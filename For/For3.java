/* Take n as input.print odd integers from 1 to n.
input : 6
output : 1 3 5 */
class For3 {
public static void main(String [] args){
int n = 6;
for(int i=1; i<=n; i++){
if(i%2!=0){
System.out.println(i);
}
}
}
}
