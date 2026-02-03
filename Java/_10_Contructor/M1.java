// Type-1

// Constructor OverLoading
class MyClass
{
    int a;
    MyClass() // Non-parametrize constructor
    {
        a=20; // initialize of DATA member
    }
    MyClass(int x) // Parametrize Constructor
    {
        a=x;
    }
    void show()
    {
        System.out.println("a = "+a);
    }
}
class M1
{
    public static void main(String args[])
    {
        MyClass mca1=new MyClass();
        mca1.show();

        MyClass mca2=new MyClass(100);
        mca2.show();
    }
}
