class Ifelse7{
public static void main(String [] args){
int cp=900, sp=900;
int profit=sp-cp;
int loss= cp-sp;
if(sp>cp){
System.out.println("profit of "+profit);
}
else if(cp>sp){
System.out.println("Loss of "+loss);
}
else{
System.out.println("no profit no loss");
}
}
} 
