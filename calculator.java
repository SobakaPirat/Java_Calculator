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
            int  answer;
            

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
            
            

            //System.out.println(num1_int + " " + operation + " " + num2_int);
            //проверка ввода

            answer = (CHECKER.opearation(num1_int, num2_int, operation));
            System.out.println(ROMAN.ToRoman(answer));
        }
    }
    public static class ROMAN{
        static int roman_checker = 0; //если 0 - вывод арабских; 2 - римских; 1 - ошибка.
        static String [] romans = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};
        static String [] arabics = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};

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
        public static String ToRoman(int answer){
            String str_answer = String.valueOf(answer);
            if (roman_checker == 2){
                for (int i = 0; i < 20; i++){
                    if (str_answer.equals(arabics[i])){
                        roman_checker++;
                        str_answer = romans[i];
                    }  
                } 
            } return str_answer;
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
        public static int opearation(int num1_int,int num2_int,String operation){
            int answer = 0;
            if (operation.equals("+")){
                answer = CALCULATION.plus(num1_int,num2_int);
            } else if (operation.equals("-")){
                answer = CALCULATION.minus(num1_int,num2_int);
            } else if (operation.equals("*")){
                answer = CALCULATION.multiply(num1_int,num2_int);
            } else if (operation.equals("/")){
                answer = CALCULATION.divide(num1_int,num2_int);
            }
            return answer;
        }

    }

    public static class CALCULATION{
        public static int plus(int num1_int,int num2_int){
            return (num1_int + num2_int);
        }
        public static int minus(int num1_int,int num2_int){
            return (num1_int + num2_int);
        }
        public static int multiply(int num1_int,int num2_int){
            return (num1_int + num2_int);
        }
        public static int divide(int num1_int,int num2_int){
            return (num1_int + num2_int);
        }

    }
    

}