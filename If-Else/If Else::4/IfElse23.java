/* 4. A student has passed his 12 th standard exam he thinks he might get marks upto 85
percent. Suggest the better career field depending upon the marks assumption.(take
hardcoded values)
Input 1: percentage >85.00;
Output: Medical
Input 2: percentage <=85.00 and percentage >75.00;
Output: Engineering;
Input 1: percentage<=75.00 and percentage>=65.00;
Output: pharmacy or bachelor in science;
You have to write the code using different values of percentage.  */

class IfElse23 {
public static void main(String [] args){
float percentage = 65.00f;
if(percentage<=100 && percentage>85.00){
System.out.println("Medical");
} else if(percentage<=85 && percentage>75){
System.out.println("Engineering");
} else if(percentage<=75 && percentage>65.00){
System.out.println("Pharmacy or bachelor in science");
} else if(percentage<=65 && percentage>40.00){
System.out.println("BCA");
} else {
System.out.println("ITI");
}
}
}
