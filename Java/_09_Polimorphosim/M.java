class A
{
    int s,l,b;
    float r;

    // area of a square
    int area(int x)
    {
        return x*x;
    }

    // area of a rectangle
    int area(int x,int y)
    {
        return x*y;
    }

    // area of a circle

    float area(float r)
    {
        return 3.14f*r*r;
    }
}
class M
{
    public static void main(String args[])
    {
        A obj= new A(); // object Created

        int area_of_Square =obj.area(5);
        System.out.println("area of a Square is "+ area_of_Square);

        int area_of_Rectangle =obj.area(5,6);
        System.out.println("area of a Rectangle is "+ area_of_Rectangle);

        float area_of_Circle =obj.area(4);
        System.out.println("area of a Circle is "+ area_of_Circle);
    }
}