import java.util.Scanner;

public class calculator {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        parse();
        System.out.println(ToInt("V"));
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


        Scanner input = new Scanner(System.in);//ввод
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
            System.out.println(number);
            System.out.println(romans[i]);
            if (romans[i] == number){
            roman_checker++;
            num_int = i + 1;
            System.out.println(num_int);
            }    
        }
        for (int i = 0; i < 10; i++){
            if (arabics[i] == number){
            num_int = i + 1;
            System.out.println(num_int);
            }    
        }
        return (num_int);
    }
    

}