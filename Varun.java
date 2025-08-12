class A{
int a=100;
}
class B extends A{
int a=10;
void disp() {
System.out.println(a);
}
void accessparent(){
System.out.println(super.a);
}
}
public class main{
public static void main(String[] args){
B b = new B();
b.accessparent();
}
}
