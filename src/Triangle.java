
public class Triangle
{
    public Triangle(int a,int b ,int base,int heigh)
    {
        this.a = a;
        this.b = b;
        this.base = base;
        this.heigh = heigh;
    }
    public int a;
    public int b;
    public int heigh;
    public int base;

    public void area()
    {
        int tArea = (this.base * this.heigh)/2;
        System.out.println("The triangle area is:"+tArea);
    }
    public void perimeter() {
        int tPerimeter = this.a + this.b + this.base;
        System.out.println("The triangle perimeter is:"+tPerimeter);
    }
}
