/* 10. WAP
to print the factorial of each element in an array.
Example :
Input:
Enter the size of the array:
6
Enter the elements of the array:
1
2
3
5
8
2
Output:
1, 2, 6, 120, 40320,2 */

import java.io.*;
class Array50 {
public static void main(String[] args)  throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
for(int i=0; i<arr.length; i++){
int fact = 1;
while(arr[i]>=1){
fact = fact * arr[i];
arr[i]--;
}
System.out.print(fact+" ");
}
}
}
