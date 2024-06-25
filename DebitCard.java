/* code of Debit card which includes four attributes and then a constructor with parameters */
public class DebitCard extends BankCard {
    //Declaring variables
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    //constructors with six parameters
    public DebitCard(int cardId,String clientName,String issuerBank, String bankAccount,double balanceAmount, int pinNumber) {
        super(balanceAmount, cardId, bankAccount, issuerBank);//calling super class for other attributes//
        setClientName(clientName);
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
    }
    //Accessor method of all attributes
    public int getPinNumber() {
        return this.pinNumber;
    }

    public int getWithdrawalAmount() {
        return this.withdrawalAmount;
    }

    public String getDateOfWithdrawal() {
        return this.dateOfWithdrawal;
    }

    public boolean getHasWithdrawn(){
        return false;
    }
    //setter method for the attribute:withdrawal amount
    public void setWithdrawalAmount(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }
    //Withdraw method to deduct money from client's account which includes parameters withdrawalAmount,dateOfwithdrawal and pinNumber
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber) {
        //if else condition to check eligibility for balance withdrawal
        if (pinNumber == this.pinNumber)
        {
            if (withdrawalAmount <= getBalanceAmount())
            {
                setBalanceAmount(getBalanceAmount() - withdrawalAmount);
                this.withdrawalAmount = withdrawalAmount;
                this.dateOfWithdrawal = dateOfWithdrawal;
                this.hasWithdrawn = true;
                System.out.println("Transaction successful. Amount withdrawn: " + withdrawalAmount);
                System.out.println("The Current balance amount is " + getBalanceAmount());
            }
            else
            {
                System.out.println("Insufficient balance. Please check balance in your account and try again later.");
            }
        } 
        else 
        {
            System.out.println("Invalid PIN. Please try again with a valid pin.");
        }
    }
    //Display method  to show the debit card details.
    public void display()
    {
        super.display();//Calling the Bank card for data of super class.
        System.out.println("Pin Number: " + this.pinNumber);//condition if pin number is correct or not.
        if (hasWithdrawn==true) {
            System.out.println("The Withdrawal Amount is " + this.withdrawalAmount);
            System.out.println("Date of Withdrawal: " + this.dateOfWithdrawal);
        }
        else 
        {

            System.out.println("No transaction has been made yet from this account. The available balance amount is " +getBalanceAmount());
        }
    }
}
