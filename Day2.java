import java.util.Scanner;
class Day2{
public static void display(int n)
{
switch(n){
case 0:System.out.println("SUNDAY");break;
case 1:System.out.println("MONDAY");break;
case 2:System.out.println("TUESDAY");break;
case 3:System.out.println("WEDNESDAY");break;
case 4:System.out.println("THURSDAY");break;
case 5:System.out.println("FRIDAY");break;
case 6:System.out.println("SATURDAY");break;
default:System.out.println("INVALID REQUEST");
}}
public static void main(String args[]){
Scanner sob=new Scanner(System.in);
int n;
n=sob.nextInt();
display(n);
}}