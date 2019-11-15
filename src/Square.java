
public class Square
{
    public Square(int side)
    {
        this.side=side;
    }

    public int side;

    public void area()
    {
        int squareArea = this.side * this.side;
        System.out.println("The square area is:"+squareArea);
    }
    public void perimeter()
    {
        int squareP = this.side * 4;
        System.out.println("The square perimeter is:"+squareP);
    }
}
