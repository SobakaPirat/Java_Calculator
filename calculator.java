import java.util.Scanner;

public class calculator {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        parse();
        //int result = calc(num1,num2,operation);
        //System.out.println("Результат операции: "+result);
    }

    public static void parse()
    {
        String num1;
        String num2;
        int num1_int;
        int num2_int;
        String operation;


        Scanner input = new Scanner(System.in, "cp866");//ввод
        System.out.println("введите пример");

        num1 = input.next();
        num1_int = ToInt(num1);
        operation = input.next();
        num2 = input.next();
        num2_int = ToInt(num2);

        System.out.println(num1_int + " " + operation + " " + num2_int);
        //проверка ввода

    }
    public static int ToInt(String number){
        number = number.toUpperCase();
        int num_int = 0;
        int roman_checker = 0; //если 0 - вывод арабских; 2 - римских; 1 - ошибка.
        String [] romans = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String [] arabics = {"1","2","3","4","5","6","7","8","9","10"};
        for (int i = 0; i < 10; i++){
            if (romans[i].equals(number)){
            roman_checker++;
            num_int = i + 1;
            }    
        }
        for (int i = 0; i < 10; i++){
            if (arabics[i].equals(number)){
            num_int = i + 1;
            }    
        }
        return (num_int);
    }

    public static int Сheck(String number){
        boolean stop_checker = true;
        int num_checker = 0;
        while (stop_checker) {
            num_checker = ToInt(number);
            if (num_checker == 0){
                System.out.println("Число вышло за границы. Попробуйте ещё раз.");
            } else {
                stop_checker = false;
            }
        }
        return (num_checker);
    }
    

}