import java.util.scanner;
Public class ArithemticExceptionOperator{
    public static void main(string[] args){
        Scanner scanner=new Scanner(system.in);
        System.out.println("Enter two numbers");
        int num1 =scanner.nextInt();
        int num2 =scanner.nextInt();
        try{
         int result= num1/num2;
         System.out.println("Result: +Result");
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division byb zero is not allowed");
            e.printStackTrace();
            System.out.println("please try with non-zero denominator");
            scanner.close();
        }
        finally{
            System.out.println("Here is youe final solution");
        scanner.close();
            }
        }
        }
