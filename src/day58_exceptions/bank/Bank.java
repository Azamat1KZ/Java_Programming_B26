package day58_exceptions.bank;

public class Bank {
    double balance;
    public void withdraw(double amountToTakeOut){
        if (amountToTakeOut > balance){
            throw new NotEnoughMoneyException("Balance only has " + balance);
        }
        balance -= amountToTakeOut;
    }

    // in this method we throw checked exceptions, so they must be handled, nut we created the class, so we don't want to handle it. We ude throws to allow the program to compile so that user of the class handles the exceptions
    public void login (String username, String  password) throws InvalidCredentialsException{
        if(!username.equals("jamesbond")){
            throw new InvalidCredentialsException("Invalid username");
        }
        if(!password.equals("007")){
            throw new InvalidCredentialsException("Invalid password");
        }
        System.out.println("Login");
    }
}
/*
        if (amountToTakeOut > balance){
            NotEnoughMoneyException e = new NotEnoughMoneyException();
            throw e;
        }
 */