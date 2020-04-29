import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        parse();
    }

    static void parse()
    {
        int num1;
        int num2;
        String operation;


        Scanner input = new Scanner(System.in);//ввод
        System.out.println("введите пример");

        num1 = input.nextInt();
        operation = input.next();
        num2 = input.nextInt();

        System.out.println(num1 + " " + operation + " " + num2);
        //проверка ввода
    }

}