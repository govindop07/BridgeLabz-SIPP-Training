import java.util.*;
class Largest{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
int o= sc.nextInt();
int p= sc.nextInt();
if((n!=o)&&(o!=p)){
if((n>=o)&&(n>=p)){
System.out.print("Is the first number largest? Yes");
}
else if((o>=n)&&(o>=p)){
System.out.print("Is the second number largest? Yes");
}
else if((p>=n)&&(p>=o)){
System.out.print("Is the third number largest? Yes");
}
}
else{
System.out.print("All the numbers are equal");
}
}
}