/* # = = = =
   = # = = =
   = = # = =
   = = = # =
   = = = = #  */
import java.io.*;
class NestedFor48 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of rows:");
int row = Integer.parseInt(br.readLine());
int num=1;
for(int i=1; i<=row; i++){
for(int j=1; j<=row; j++){
if(num==j){
System.out.print("# ");
}
else {
System.out.print("= ");
}
}
System.out.println();
num++;
}
}
}
