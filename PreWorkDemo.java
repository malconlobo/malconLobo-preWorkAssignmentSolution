import java.util.Scanner;

class PreWorkDemo{
    

    public static void main(String[] args){
        Operation op = new Operation();
        op.doOperate();
    }
}

class Operation{
    int choice;
    Scanner sc = new Scanner(System.in);

    public void doOperate(){

        do{
            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

            + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

            + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println("Please enter choice");
            choice = sc.nextInt();
            //System.out.println("Choice is "+ choice);

            switch(choice){
        
                case 0:

                choice = 0;

                break;

    

                case 1: {

                checkPalindrome();

                }

                break;

    

                case 2: {

                printPattern();

                } 

                break;

    

                case 3: {

                checkPrimeNumber();

                }

                break;

    

                case 4: {

                printFibonacciSeries();

                }

                break;

    
                default:

                System.out.println("Invalid choice. Enter a valid no.\n");
        


            }
        }while(choice != 0);
    
        System.out.println("Exited Successfully!!!");
        sc.close();
    }

    public void checkPalindrome(){
        int inputNum;
        int reverseNum = 0;
        int remainder;
        int num;

        System.out.println("Please enter the number to check for palindrome");
        inputNum = sc.nextInt();

        num = inputNum;

        while(num > 0){    
            remainder=num % 10;  
            reverseNum = (reverseNum*10) + remainder;    
            num = num/10;    
        }

        if(inputNum == reverseNum){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }

    public void printPattern(){
        int inputNum;
        int tempNum;

        System.out.println("Please enter the number to print pattern");
        inputNum = sc.nextInt();
        tempNum = inputNum;

        for(int i = 0; i < inputNum; i++){
            for(int j = 0; j < tempNum; j++){
                System.out.print("*");
            }
            System.out.println();
            tempNum--;
        }
    }

    public void checkPrimeNumber(){
        int inputNum;
        int isPrimeNumber = 1;

        System.out.println("Please enter the number to check prime number");
        inputNum = sc.nextInt();

        if (inputNum <= 1){
            System.out.println("The number should be greater than 1");
        }
        else {
            for (int i = 2; i < inputNum; i++){
                if (inputNum % i == 0)
                    isPrimeNumber = 0;
            }
  
            if(isPrimeNumber == 1){
                System.out.println("The number is a prime number");
            }
            else{
                System.out.println("The number is not a prime number");
            }
        }
    }

    public void printFibonacciSeries(){
        int inputNum;
        int firstNum = 0;
        int secondNum = 1;
        int sum;

        System.out.println("Please enter the number to print Fibonacci series");
        inputNum = sc.nextInt();

        if(inputNum == 0){
            System.out.println("The number should be greater than 0");
        }
        else if (inputNum == 1){
            System.out.println("The Fibonacci series is");
            System.out.println("0");
        }
        else{
            System.out.println("The Fibonacci series is");
            System.out.println("0");
            System.out.println("1");

            for(int i = 0 ; i < inputNum - 2; i++){
                sum = firstNum + secondNum;
                System.out.println(sum);

                firstNum = secondNum;
                secondNum = sum;
            }

        }

    } 
        
}