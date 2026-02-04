// Single Inheritance

class A{
    int a;       // Data Member
    void show()  // method of A
    {
        System.out.println("Super Class Data a="+a);
    }
}
class B extends A
{
    int b;
    void display()
    {
        System.out.println("Child class own data b="+b);
    }
}
class M1{
    public static void main(String args[])
    {
        B obj1 = new B();
        obj1.a=15;
        obj1.b=17;
        obj1.show();
        obj1.display();
    }
}