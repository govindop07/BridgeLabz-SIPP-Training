import java.util.*;
class SumCheck{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
double total= 0.0;
while(true){
System.out.println("PRINT 0 TO END THIS LOOP");
double value= sc.nextDouble();
if(value==0){
break;
}
total=total+value;
}
System.out.println("The total until now is: " + total);
}
}