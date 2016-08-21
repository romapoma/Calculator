        package money;
        
        import java.util.Scanner;
        
        
        public class Calculator {
        
            public static void main(String[] args){
            
                Scanner Nums = new Scanner(System.in);
                Scanner Oper = new Scanner(System.in);
                double fnum,snum;
                String operator;
                System.out.println("Enter first number:");
                fnum = Nums.nextDouble();
                System.out.println("Enter Second number:");
                snum = Nums.nextDouble();
                System.out.println("What operation will be done? (+, -, *, /)");
                operator = Oper.nextLine();
                
                Calculation(fnum, snum, operator);	
                //System.exit(0);
            }
            
            public static void Calculation(double a, double b, String oper){
                double answ;
                if(oper.equals("*")){
                    answ = a * b;
                    System.out.println(answ);
                }
                else if(oper.equals("+")){
                    answ = a + b;
                    System.out.println(answ);
                }
                else if(oper.equals("-")){
                    answ = a - b;
                    System.out.println(answ);
                }
                else if(oper.equals("/")){
                    answ =  a / b;
                    System.out.println(answ);
                }
                else{
                    System.out.println("wrong operator, please try either +, -, *, or /");
                    main(null);
                }
            //main(null);
        }
        }
