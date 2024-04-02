package codewars;
public class BasicOperations
{
    public static Integer basicMath(String op, int v1, int v2)
    {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                return v1 / v2;
            default:
                System.out.println("Operador no valido");
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(basicMath("+",4,5));
        System.out.println(basicMath("-",6,5));
        System.out.println(basicMath("*",4,5));
        System.out.println(basicMath("/",4,5));

    }
}