package Session4;

public class ReturnMethod {
    public static void main (String[]args) {// Method
        // Calling
        Sum(1,5);
        Sum(3,15);
        Sum(6,30);
// Arguments الأرقام الي بحطها



    }
    //Declaration
    public static int Sum (int x, int y) {

        // Body
        // Parameters المتغيرات (X, Y)
        int resultofsum = x+y;
        System.out.println(resultofsum);
        return resultofsum;
    }

}
/*
{
    public static void main (String[]args) {// Method
        // Calling
        Sum(1,5);
        Sum(3,15);
        Sum(6,30);




    }
    //Declaration
    public static int Sum (int x, int y) {
        System.out.println(x+y);
        return x+y;
    }

}

 */

