// 3. Logical

// && -> logical and, || -> Logical or , ! - Logical Not

class Logical
{
    public static void main(String args[])
    {
        int a=20, b=6;
        System.out.println("a= "+a);
        System.out.println("b= "+b);

        System.out.println("a>b && a<b = "+(a>b && a<b));
        System.out.println("a>b || a<b = "+(a>b || a<b));
        System.out.println("(!(a>b)) = "+(!(a>b)));
    }
}