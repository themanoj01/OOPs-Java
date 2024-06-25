/* The Credit card is a sub class of Bank card having six attributes */
public class CreditCard extends BankCard{
    // Declaring variables.
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    //constructor having eight parameters
    public CreditCard(int cardId,String clientName,String issuerBank,String bankAccount,double balanceAmount,int cvcNumber,double interestRate,String expirationDate){
        super(balanceAmount, cardId, bankAccount, issuerBank);
        setClientName(clientName);
        this.cvcNumber=cvcNumber;
        this.creditLimit = creditLimit;
        this.interestRate=interestRate;
        this.expirationDate=expirationDate;
        this.isGranted=false;

    }
    //Accessor method for each attribute
    public int getCvcNumber(){
        return this.cvcNumber;
    }

    public double getCreditLimit(){
        return this.creditLimit;
    }

    public double getInterestRate(){
        return this.interestRate;
    }

    public String getExpirationDate(){
        return this.expirationDate;
    }

    public int getGracePeriod() {
        return this.gracePeriod;
    }

    public boolean getIsGranted(){
        return false;
    }
    //a mutator method to set the credit limit
    public void setCreditLimit(double creditLimit,int gracePeriod){
        //if else condition for the credit limit and grace period as it satisfy the given condition or not.
        if (creditLimit <= 2.5*getBalanceAmount()){
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted= true;
            System.out.println("The Credit is granted to you with a credit limit of " +""+creditLimit + "and a grace period of " +gracePeriod + ""  + "days.");
        }
        else{
            System.out.println("The Credit Cannot be issued.Sorry for the inconvinience caused.");
        }

    }
    //the method cancelcreditcard will remove the client's credit card
    public void cancelCreditCard(){
        if(isGranted==true) {
            this.cvcNumber= 0;
            this.creditLimit= 0;
            this.gracePeriod= 0;
            this.isGranted=false;
            System.out.println("The credit card has been cancelled.");
        }
        else{
            System.out.println("Credit Card is not Cancelled. The card is active.");
        }
    }
    //Display method  with all details of class credit card.Declare 
    public void display()
    {
        super.display();
        System.out.println("CVC Number:" + this.cvcNumber);
        System.out.println("Interest Rate:" + this.interestRate);
        System.out.println("Expiration Date:" + this.expirationDate);
        if (isGranted==true){
            System.out.println("Credit Limit:"+ this.creditLimit);
            System.out.println("Grace Period:" + this.gracePeriod);
        }
        else
        {
            System.out.println("the Credit Card has not been issued yet.");
        }
    }
}