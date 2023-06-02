import java.util.*;
class Charcter{
public static void main(String args[]){
char ch;
System.out.println("enter a charcter");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
int c;
c=sc.nextInt();
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
System.out.println(ch+"  is an alphabet");}
else{
System.out.println(ch+"   is not an alphabet");}
if(c>=0&&c<=10)
{
System.out.println(c+"  is an digit");}
else
{
System.out.println("it is not an digit");}
}}

