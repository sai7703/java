import java.util.Scanner;
class Input1{
public static int sub(int a,int b)
{
int c=a-b;
return c;
}
public static int add(int a,int b)
{
int c=a+b;
return c;
}

public static void main(String args[]){
Scanner sob=new Scanner(System.in);
System.out.println("enter a number:");
int num1;
num1=sob.nextInt();
System.out.println("enter a number:");
int num2;
num2=sob.nextInt();
System.out.println(num1+"-"+num2+"="+sub(num1,num2));
System.out.println(num1+"+"+num2+"="+add(num1,num2));
}}