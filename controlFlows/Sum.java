import java.util.*;
class Sum{
public static void main(String[] args){
int sum=0;
Scanner sc= new Scanner(System.in);
while(true){
System.out.println("Enter either a negative number or 0 to end this loop");
int n= sc.nextInt();
if(n<=0){
break;
}
sum= sum+n;
}
System.out.print("The current sum is: " + sum);
}
}