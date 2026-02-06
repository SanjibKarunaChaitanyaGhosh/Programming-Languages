// Assignment
// =, += , -=, *=, /=, %=
class Assignment
{
    public static void main(String args[])
    {
        int a=20, b=6;
        System.out.println("a= "+a);
        System.out.println("b= "+b);

        // by 1
        System.out.println("a=a+1 : "+ (a+=1));
        System.out.println("a=a-1 :  "+(a-=1));
        System.out.println("(a=a*1) = "+(a*=1));

        // by 2
        System.out.println("a=a+2 : "+ (a+=2));
        System.out.println("a=a-2 :  "+(a-=2));
        System.out.println("(a=a*3) = "+(a*=3));
    }
}