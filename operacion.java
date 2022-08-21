public class operacion{

    public static int res;

    public static void main(String []args)
    {
        SUMA(3,4);
        RESTA(5,3);
        MULTIPLICACION(3,5);
        DIVISION(6,2);
    }

    public static void SUMA(int no1, int no2)
    {
        res=no1+no2;
        System.out.println(res);
    }
    public static void RESTA(int no1, int no2)
    {
        res=no1-no2;
        System.out.println(res);
    }
    public static void MULTIPLICACION(int no1, int no2)
    {
        res=no1*no2;
        System.out.println(res);
    }
    public static void DIVISION(int no1, int no2)
    {
        res=no1/no2;
        System.out.println(res);
    }
}