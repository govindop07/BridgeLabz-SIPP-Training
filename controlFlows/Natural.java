import java.util.*;
class Natural{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
double sum=0;
if(n>0){
sum= n*(n+1)*0.5;
System.out.println(" The sum of " + n + " natural number is " + sum);
}
else if(n<=0){
System.out.print(" The number " + n + " is not a natural number ");
}
}
}