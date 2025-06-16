import java.util.*;
class Smallest{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
int o= sc.nextInt();
int p= sc.nextInt();
System.out.print("Is the first number the smallest? ");
if((n<o)&& (n<p)){
System.out.print("Yes");
}
else {
System.out.print("No");
}
}
}