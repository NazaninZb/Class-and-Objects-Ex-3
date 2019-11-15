import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        String selectedItem;
        System.out.println("1-Triangle  2-Rectangle  3-Square:");
        selectedItem= myObj.nextLine();
        switch (selectedItem)
        {
            case "1":
                String a;
                String b;
                String base;
                String heigh;
                System.out.println("Enter value a:");
                a = myObj.nextLine();
                System.out.println("Enter value b:");
                b = myObj.nextLine();
                System.out.println("Enter value base:");
                base = myObj.nextLine();
                System.out.println("Enter value heigh:");
                heigh = myObj.nextLine();
                Triangle myTriangle=new Triangle(Integer.parseInt(a),Integer.parseInt(b),Integer.parseInt(base),Integer.parseInt(heigh));
                myTriangle.area();
                myTriangle.perimeter();
                break;
            case "2":
                String length;
                String width;
                System.out.println("Enter value of length:");
                length=myObj.nextLine();
                System.out.println("Enter value of width:");
                width=myObj.nextLine();
                Rectangle myRectangle = new Rectangle (Integer.parseInt(length),Integer.parseInt(width));
                myRectangle.area();
                myRectangle.perimeter();
                break;
            case "3":
                String side;
                System.out.println("Enter value of square side:");
                side = myObj.nextLine();
                Square mySquare = new Square(Integer.parseInt(side));
                mySquare.area();
                mySquare.perimeter();
        }

    }
}
