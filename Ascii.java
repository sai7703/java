import java.util.Scanner;
public class Ascii {
public static void main(String args[])
{
char ch;
Scanner s=new Scanner(System.in);
ch=s.next().charAt(0);
int ascii_var=(int)ch;
System.out.println("Ascii of"+ch+"is"+ascii_var);
}}

