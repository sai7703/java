import java.util.*;
class Charc{
public static void main(String args[]){
System.out.println("enter a charcter");
Scanner sc=new Scanner(System.in);
char str=sc.nextline();
char ch=str.charAt(0);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
System.out.println(ch+"  is an alphabet");
else if(ch>=48&&ch<=57)
System.out.println(ch+"is an digit");
else
System.out.println(ch+"is aspecial number");
}}