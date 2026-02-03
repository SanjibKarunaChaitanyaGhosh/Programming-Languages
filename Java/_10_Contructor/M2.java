// Type-2
class Myclass{
    int a;
    Myclass()
    {
        a=50;
        System.out.println("a="+a);
    }
}
class M2{
    public static void main(String args[])
    {
        Myclass m = new Myclass();
        new Myclass();
    }
}