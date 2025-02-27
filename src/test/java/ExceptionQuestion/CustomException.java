package ExceptionQuestion;

import java.util.Scanner;

public class CustomException {

    private int accountBalance;
    private String accountName;

    public CustomException(int accountBalance,String accountName){
        this.accountBalance=accountBalance;
        this.accountName=accountName;
    }

    public int withdrawl(int withDamount) throws CustomClass{
        if(withDamount > accountBalance){
            throw new CustomClass("Please withdrawl the amount less than Deposited Amount");
        }else{
            accountBalance = accountBalance-withDamount;
        }

        return accountBalance;
    }
    public static void main(String[] args) throws CustomClass {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int amount = scanner.nextInt();
        CustomException customException = new CustomException(50000,"Arman");

        System.out.println(STR."Left Account Balance is   : \{customException.withdrawl(amount)}");

        System.out.println("Please collect your Amount............");



    }




}


