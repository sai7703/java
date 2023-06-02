import java.util.*;
class Even{
public static boolean isEven(int n)
{
return ((n/2)*2==n);
}
public static void main(String args[]){
Scanner sob=new Scanner(System.in);
int n;
n=sob.nextInt();
if(isEven(n))
{
System.out.println("Even");
}
else
{
System.out.println("Odd");
}}}