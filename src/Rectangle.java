/**
 * Created by Dear User on 9/28/2019.
 */
public class Rectangle
{
    public Rectangle(int length,int width)
    {
        this.length = length;
        this.width = width;
    }
    public int length;
    public int width;

    public void area()
    {
        int  rectangle_S= this.length*this.width;
        System.out.println("The Rectangle Area is:"+rectangle_S);
    }
    public void perimeter()
    {
        int rectangle_P = 2*(this.length+this.width);
        System.out.println("The Rectangle Perimeter is:"+rectangle_P);
    }
}
