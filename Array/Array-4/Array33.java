/* 3. WAP to find the second largest element in an array.
Example:
Input:
Enter the size :4
Enter the elements of the array:
1
2
3
4
Output:
The second largest element in the array is: 3 */

import java.io.*;
class Array33 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
int max_num = 0;
for(int i=0; i<arr.length; i++){
int count = 0;
for(int j=0; j<arr.length; j++){
if(arr[i]>arr[j]){
count++;
}
}
if(count==arr.length-1){
max_num=arr[i];
}
}
for(int i=0; i<arr.length; i++){
int count = 0;
for(int j=0; j<arr.length; j++){
if(arr[i]>arr[j] && arr[i]<max_num){
count++;
}
}
if(count==arr.length-2){
System.out.println("The second largest element in the array is: "+arr[i]);
}
}
}
}
