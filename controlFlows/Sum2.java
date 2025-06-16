import java.util.*;
class Sum2{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
double sum1=0;
if(n>0){
for(int i=0; i<=n; i++){
sum1=sum1+i;
}
double sum2= n*(n+1)*0.5;
System.out.print(sum1==sum2);
}
else{
System.out.print(n + " is not a natural number " );
}
}
}