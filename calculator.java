import java.util.Scanner;


public class calculator {
    static Scanner scanner = new Scanner(System.in);
 
    
    public static void main(String[] args) {
            

        PARSER.parse();
        //int result = calc(num1,num2,operation);
        //System.out.println("Результат операции: "+result);
    }
    

    public static class PARSER{
        public static void parse()
        {   

            String num1;
            String num2;
            int num1_int;
            int num2_int;
            

            String operation;


            Scanner input = new Scanner(System.in);//ввод
            System.out.println("vvedite primer");

            num1 = input.next();
            num1_int = ROMAN.ToInt(num1);
            CHECKER.limit(num1_int);
            operation = input.next();
            num2 = input.next();
            num2_int = ROMAN.ToInt(num2);
            CHECKER.limit(num2_int);
            CHECKER.roman();

            System.out.println(num1_int + " " + operation + " " + num2_int);
            //проверка ввода

        }
    }
    public static class ROMAN{
        static int roman_checker = 0; //если 0 - вывод арабских; 2 - римских; 1 - ошибка.
        static String [] romans = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        static String [] arabics = {"1","2","3","4","5","6","7","8","9","10"};

        public static int ToInt(String number){
            
            number = number.toUpperCase();
            int num_int = 0;
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
    }
    
    public static class CHECKER{

        public static void limit(int check_number){
            if (check_number == 0) {
                System.out.println("chisla ne nahodyatsya v predelah 1-10; i-x.");
                System.exit(0);
            } 
        }
        public static void roman(){
            if (ROMAN.roman_checker == 1){
                System.out.println("chisla dolzhni bit' tol'ko arbskimi, libo rimskimi.");
                System.exit(0);
            }
        }

    }
    

}