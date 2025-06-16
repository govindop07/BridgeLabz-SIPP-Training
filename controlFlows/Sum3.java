import java.util.*;
class Sum3{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
double sum1=0;
int temp=n;
if(n>0){
while(temp>0){
sum1= sum1+temp;
temp--;
}
double sum2=0;
sum2= n*(n+1)*0.5;
System.out.print(sum1==sum2);
}
else {
System.out.print(n + "is not a natural number");
}
}
}