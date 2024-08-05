/* 10. Write a program to find the third largest element in an array.
Example :
56 15 8 26 7 50 54
Output:
Third largest element is: 50 */

import java.io.*;
class Array60 {
public static void main(String[] args)  throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
int max_element = 0;
for(int i=0; i<arr.length; i++){
int count1=0;
for(int j=0; j<arr.length; j++){
if(arr[i]>arr[j]){
count1++;
}
if(count1==arr.length-1){
max_element = arr[i];
}
}
}
int sec_max_element = 0;
for(int i=0; i<arr.length; i++){
int count2 = 0;
for(int j=0; j<arr.length; j++){
if(arr[i]>arr[j] && arr[i]<max_element){
count2++;
}
if(count2==arr.length-2){
sec_max_element = arr[i];
}
}
}
int third_max_element = 0;
for(int i=0; i<arr.length; i++){
int count3 = 0;
for(int j=0; j<arr.length; j++){
if(arr[i]>arr[j] && arr[i]<max_element && arr[i]<sec_max_element){
count3++;
}
if(count3==arr.length-3){
third_max_element = arr[i];
}
}
}
System.out.println("first largest element is: "+max_element);
System.out.println("second largest element is: "+sec_max_element);
System.out.println("Third largest element is: "+third_max_element);
}
}
