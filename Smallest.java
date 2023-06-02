import java.util.*;
public class Smallest{
static int diff(int a,int b){return a-b;}
static int product(int a,int b){return a*b;}
static int smallest(int a,int b){
if(a<b) return a;
if(b<a) return b;
return 0;}
static int largest(int a,int b){
if(a>b) return a;
if(b>a) return b;
return 0;}
public static void main(String args[]){
Scanner sob=new Scanner(System.in);
int a;
a=sob.nextInt();
int b;
b=sob.nextInt();
System.out.println("the smallest number is "+smallest(a,b));
System.out.println("the largest number is "+largest(a,b));
System.out.println("the diffrence is "+diff(a,b));
System.out.println("the product is "+product(a,b));
}}