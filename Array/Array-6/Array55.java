/* 5. T ake two different arrays where size of array may differ , you have to
create an array by combining both the arrays (you have to merge the arrays)
Example:
arr1
5 10 15 20 25 30 35
arr2
4 8 12 16 20
Array after merger :
5 10 15 20 25 30 35 4 8 12 16 20  */

import java.io.*;
class Array55 {
public static void main(String[] args)  throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter first array size:");
int size1 = Integer.parseInt(br.readLine());
int arr1[]=new int[size1];
System.out.println("Enter first array elements:");
for(int i=0; i<arr1.length; i++){
arr1[i]=Integer.parseInt(br.readLine());
}
System.out.println("Enter second array size:");
int size2 = Integer.parseInt(br.readLine());
int arr2[]=new int[size2];
System.out.println("Enter second array elements:");
for(int i=0; i<arr2.length; i++){
arr2[i]=Integer.parseInt(br.readLine());
}
int arr3[]=new int[size1+size2];
for(int i=0; i<arr1.length; i++){
arr3[i]=arr1[i];
}
int num = 0;
for(int i=arr1.length; i<arr1.length+arr2.length; i++){
arr3[i]=arr2[num];
num++;
}
System.out.print("array after merger : ");
for(int i=0; i<arr3.length; i++){
System.out.print(arr3[i]+" ");
}
}
}
