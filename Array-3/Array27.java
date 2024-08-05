/* 7 Check the size of the array and if array size is odd and greater than or equal to 5, then
print the odd elements, else print the even numbers.
Example 1:
Size : 6
121 144 225 88 90 89
Output:
144 88 90
Example:
Size : 5
1 625 196 169 7
Output:
1 625 169 7  */


import java.io.*;
class Array27 {
public static void main(String [] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter array size:");
int size = Integer.parseInt(br.readLine());
int arr[]=new int[size];
System.out.println("Enter array elements:");
for(int i=0; i<arr.length; i++){
arr[i]=Integer.parseInt(br.readLine());
}
if(size%2==1 && size>=5){
System.out.print("Array elements are:");
for(int i=0; i<arr.length; i++){
if(arr[i]%2==1){
System.out.print(arr[i]+" ");
}
}
} else {
System.out.print("Array elements are:");
for(int i=0; i<arr.length; i++){
if(arr[i]%2==0){
System.out.print(arr[i]+" ");
}
}
}
}
}
