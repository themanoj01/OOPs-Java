/*This is a code of bank card where cardId,clientName,issuerBank,bankAccount,balanceAmount are attributes */
public class BankCard
{   //Declaring all variables
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;
    //Constructor with parameters
    public BankCard(double balanceAmount, int cardId, String bankAccount, String issuerBank)
    {
        this.clientName = "";
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;

    }
    //Getter Methods
    public int getCardId()
    {
        return this. cardId;
    }

    public String getClientName()
    {
        return this.clientName;
    }

    public String getIssuerBank()
    {
        return this.issuerBank;
    }

    public String getBankAccount()
    {
        return this.bankAccount;
    }

    public double getBalanceAmount()
    {
        return this.balanceAmount;
    }
    //Mutator Methods of clientName and balanceAmount

    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }

    public void setBalanceAmount(double balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }

    //Displaying the output with a method named display().
    public void display()
    {
        if(this.clientName.isEmpty()){
            System.out.println("The Client Name Is Not Assigned.");//an output when clientName is not assigned.
        }
        else
        {
            System.out.println("Card Id is " + this.cardId);
            System.out.println("Client Name is " + this.clientName);
            System.out.println("Issuer Bank is " + this.issuerBank);
            System.out.println("Bank Account is " + this.bankAccount);
            System.out.println("Balance Amount is " + this.balanceAmount);
        }
    }

}