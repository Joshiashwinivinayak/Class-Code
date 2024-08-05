/* 4. You have to take two different 1d arrays of the same size and print the
common elements from the arrays.
arr1
45 67 97 87 90 80
arr2
15 97 67 80 90 10
Output:
Common elements in the given arrays are: 67, 97, 90, 80 */

import java.io.*;
class Array54 {
public static void main(String[] args)  throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr1[]=new int[size];
System.out.println("Enter first array elements:");
for(int i=0; i<arr1.length; i++){
arr1[i]=Integer.parseInt(br.readLine());
}
int arr2[]=new int[size];
System.out.println("Enter Second array elements:");
for(int i=0; i<arr2.length; i++){
arr2[i]=Integer.parseInt(br.readLine());
}
System.out.println("Common elements in the given arrays are: ");
for(int i=0; i<arr1.length; i++){
for(int j=0; j<arr2.length; j++){
if(arr1[i]==arr2[j]){
System.out.print(arr1[i]+" ");
}
}
}
}
}
