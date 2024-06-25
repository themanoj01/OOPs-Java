import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BankGUI{
    private ArrayList<BankCard> bankCards;
    private JFrame frame;
    private JPanel panelDebit;
    private JPanel panelCredit;
    private JLabel lblDebitCard;
    private JLabel lblCardIdDebit;
    private JTextField txtCardIdDebit;
    private JLabel lblClientNameDebit;
    private JTextField txtClientNameDebit;
    private JLabel lblIssuerBankDebit;
    private JTextField txtIssuerBankDebit;
    private JLabel lblBankAccountDebit;
    private JTextField txtBankAccountDebit;
    private JLabel lblBalanceAmountDebit;
    private JTextField txtBalanceAmountDebit;
    private JLabel lblPinNumber;
    private JPasswordField txtPinNumber;
    private JLabel lblWithdrawalAmount;
    private JTextField txtWithdrawalAmount;
    private JLabel lbldateOfWithdrawal;
    private JComboBox<String> years;
    private JComboBox<String> months;
    private JComboBox<String> days;
    private JLabel lblCreditCard;
    private JLabel lblCardIdCredit;
    private JTextField txtCardIdCredit;
    private JLabel lblClientNameCredit;
    private JTextField txtClientNameCredit;
    private JLabel lblIssuerBankCredit;
    private JTextField txtIssuerBankCredit;
    private JLabel lblBankAccountCredit;
    private JTextField txtBankAccountCredit;
    private JLabel lblBalanceAmountCredit;
    private JTextField txtBalanceAmountCredit;
    private JLabel lblCvcNumber;
    private JTextField txtCvcNumber;
    private JLabel lblCreditLimit;
    private JTextField txtCreditLimit;
    private JLabel lblInterestRate;
    private JTextField txtInterestRate;
    private JLabel lblGracePeriod;
    private JTextField txtGracePeriod;
    private JLabel lblExpirationDate;
    private JComboBox<String> expyears;
    private JComboBox<String> expmonths;
    private JComboBox<String> expdays;
    private JButton btnAddDebitCard;
    private JButton btnWithdraw;
    private JButton btnDisplayDebit;
    private JButton btnClearDebit;
    private JButton btnAddCreditCard;
    private JButton btnSetCreditLimit;
    private JButton btnCancelCreditCard;
    private JButton btnDisplayCredit;
    private JButton btnClearCredit;

    public BankGUI(){
        bankCards = new ArrayList<BankCard>();
        UIManager.put("Label.font", new Font("PT Sans", Font.BOLD, 14));
        UIManager.put("TextField.font", new Font("Roboto", Font.BOLD, 14));
        UIManager.put("Button.font", new Font("Open Sans", Font.BOLD, 14));
        frame = new JFrame("BankGUI");
        panelDebit = new JPanel();
        panelCredit = new JPanel();
        panelDebit.setLayout(null);
        panelCredit.setLayout(null);
        panelDebit.setBackground(Color.LIGHT_GRAY);
        panelCredit.setBackground(Color.CYAN);
        frame.add(panelDebit);
        frame.add(panelCredit);
        panelDebit.setBounds(0,0,900,400);
        panelCredit.setBounds(0,400,900,400);

        lblDebitCard = new JLabel("Debit Card");
        lblDebitCard.setFont(new Font("PT Sans", Font.BOLD, 20));
        lblDebitCard.setBounds(360, 5, 150, 50);
        panelDebit.add(lblDebitCard);

        // Card ID
        lblCardIdDebit = new JLabel("Card ID:");
        lblCardIdDebit.setBounds(30, 60, 100, 30);
        panelDebit.add(lblCardIdDebit);
        txtCardIdDebit = new JTextField();
        txtCardIdDebit.setBounds(140, 60, 200, 35);
        panelDebit.add(txtCardIdDebit);

        // Client Name
        lblClientNameDebit = new JLabel("Client Name:");
        lblClientNameDebit.setBounds(30, 110, 100, 30);
        panelDebit.add(lblClientNameDebit);
        txtClientNameDebit = new JTextField();
        txtClientNameDebit.setBounds(140, 110, 200, 35);
        panelDebit.add(txtClientNameDebit);

        // Issuer Bank
        lblIssuerBankDebit = new JLabel("Issuer Bank:");
        lblIssuerBankDebit.setBounds(30, 160, 100, 30);
        panelDebit.add(lblIssuerBankDebit);
        txtIssuerBankDebit = new JTextField();
        txtIssuerBankDebit.setBounds(140, 160, 200, 35);
        panelDebit.add(txtIssuerBankDebit);

        // Bank Account
        lblBankAccountDebit = new JLabel("Bank Account:");
        lblBankAccountDebit.setBounds(30, 210, 100, 30);
        panelDebit.add(lblBankAccountDebit);
        txtBankAccountDebit = new JTextField();
        txtBankAccountDebit.setBounds(140, 210, 200, 35);
        panelDebit.add(txtBankAccountDebit);

        // Balance Amount
        lblBalanceAmountDebit = new JLabel("Balance Amount:");
        lblBalanceAmountDebit.setBounds(450, 60, 200, 30);
        panelDebit.add(lblBalanceAmountDebit);
        txtBalanceAmountDebit = new JTextField();
        txtBalanceAmountDebit.setBounds(580, 60, 200, 35);
        panelDebit.add(txtBalanceAmountDebit);

        // PIN Number
        lblPinNumber = new JLabel("PIN Number:");
        lblPinNumber.setBounds(450, 110, 100, 30);
        panelDebit.add(lblPinNumber);
        txtPinNumber = new JPasswordField();
        txtPinNumber.setBounds(580, 110, 200, 35);
        panelDebit.add(txtPinNumber);

        // Withdrawal Amount
        lblWithdrawalAmount = new JLabel("Withdrawal Amount:");
        lblWithdrawalAmount.setBounds(450, 160, 150, 30);
        panelDebit.add(lblWithdrawalAmount);
        txtWithdrawalAmount = new JTextField();
        txtWithdrawalAmount.setBounds(590, 160, 170, 35);
        panelDebit.add(txtWithdrawalAmount);

        lbldateOfWithdrawal = new JLabel("Withdrawal Date:");
        lbldateOfWithdrawal.setBounds(450, 220, 150, 30);
        panelDebit.add(lbldateOfWithdrawal);
        String [] Year = {"2023","2024","2025"};
        String [] Month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String [] Day ={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        years = new JComboBox<String>(Year);
        months = new JComboBox<String>(Month);
        days = new JComboBox<String>(Day);
        years.setBounds(580,220,75,30);
        months.setBounds(670,220,100,30);
        days.setBounds(790,220,50,30);
        panelDebit.add(years);
        panelDebit.add(months);
        panelDebit.add(days);
        

        btnDisplayDebit = new JButton("Display");
        btnDisplayDebit.setBounds(450,280,180,40);
        panelDebit.add(btnDisplayDebit);
        btnDisplayDebit.setForeground(Color.black);
        btnDisplayDebit.setBackground(Color.blue);

        btnClearDebit = new JButton("Clear");
        btnClearDebit.setBounds(650,280,180,40);
        panelDebit.add(btnClearDebit);
        btnClearDebit.setForeground(Color.black);
        btnClearDebit.setBackground(Color.green);

        btnAddDebitCard = new JButton("Add Debit Card");
        btnAddDebitCard.setBounds(50,280,150,40);
        panelDebit.add(btnAddDebitCard);
        btnAddDebitCard.setBackground(Color.pink);

        btnWithdraw = new JButton("Withdraw");
        btnWithdraw.setBounds(220,280,220,40);
        panelDebit.add(btnWithdraw);
        btnWithdraw.setBackground(Color.orange);

        lblCreditCard = new JLabel("Credit Card");
        lblCreditCard.setFont(new Font("PT Sans", Font.BOLD, 20));
        lblCreditCard.setBounds(360,410, 150, 50);
        panelCredit.add(lblCreditCard);

        // Card ID
        lblCardIdCredit = new JLabel("Card ID:");
        lblCardIdCredit.setBounds(30, 460, 100, 30);
        panelCredit.add(lblCardIdCredit);
        txtCardIdCredit = new JTextField();
        txtCardIdCredit.setBounds(140, 460, 200, 35);
        panelCredit.add(txtCardIdCredit);

        // Client Name
        lblClientNameCredit = new JLabel("Client Name:");
        lblClientNameCredit.setBounds(30, 510, 100, 30);
        panelCredit.add(lblClientNameCredit);
        txtClientNameCredit = new JTextField();
        txtClientNameCredit.setBounds(140, 510, 200, 35);
        panelCredit.add(txtClientNameCredit);

        // Issuer Bank
        lblIssuerBankCredit = new JLabel("Issuer Bank:");
        lblIssuerBankCredit.setBounds(30, 560, 100, 30);
        panelCredit.add(lblIssuerBankCredit);
        txtIssuerBankCredit = new JTextField();
        txtIssuerBankCredit.setBounds(140, 560, 200, 35);
        panelCredit.add(txtIssuerBankCredit);

        // Bank Account
        lblBankAccountCredit = new JLabel("Bank Account:");
        lblBankAccountCredit.setBounds(30, 610, 100, 30);
        panelCredit.add(lblBankAccountCredit);
        txtBankAccountCredit = new JTextField();
        txtBankAccountCredit.setBounds(140, 610, 200, 35);
        panelCredit.add(txtBankAccountCredit);

        // Balance Amount
        lblBalanceAmountCredit = new JLabel("Balance Amount:");
        lblBalanceAmountCredit.setBounds(30,660, 200, 30);
        panelCredit.add(lblBalanceAmountCredit);
        txtBalanceAmountCredit = new JTextField();
        txtBalanceAmountCredit.setBounds(150,660, 200, 35);
        panelCredit.add(txtBalanceAmountCredit);

        // CVC Number
        lblCvcNumber = new JLabel("CVC Number:");
        lblCvcNumber.setBounds(450,460 ,100, 30);
        panelCredit.add(lblCvcNumber);
        txtCvcNumber = new JTextField();
        txtCvcNumber.setBounds(570,460 ,200, 35);
        panelCredit.add(txtCvcNumber);

        //Credit Limit
        lblCreditLimit = new JLabel("Credit Limit:");
        lblCreditLimit.setBounds(450, 510, 100, 30);
        panelCredit.add(lblCreditLimit);
        txtCreditLimit= new JTextField();
        txtCreditLimit.setBounds(570, 510, 200, 35);
        panelCredit.add(txtCreditLimit);

        // Interest Rate
        lblInterestRate = new JLabel("Interest Rate:");
        lblInterestRate.setBounds(450, 560,100, 30);
        panelCredit.add(lblInterestRate);
        txtInterestRate = new JTextField();
        txtInterestRate.setBounds(570, 560,200, 35);
        panelCredit.add(txtInterestRate);

        //Grace period
        lblGracePeriod = new JLabel("Grace Period:");
        lblGracePeriod.setBounds(450, 610, 100, 30);
        panelCredit.add(lblGracePeriod);
        txtGracePeriod= new JTextField();
        txtGracePeriod.setBounds(570, 610, 200, 35);
        panelCredit.add(txtGracePeriod);

        lblExpirationDate = new JLabel("Expiration Date:");
        lblExpirationDate.setBounds(450, 660, 220, 30);
        panelCredit.add(lblExpirationDate);
        String[] expYear = {"2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
        String[] expMonth = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] expDay ={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        expyears = new JComboBox<String>(expYear);
        expmonths = new JComboBox<String>(expMonth);
        expdays = new JComboBox<String>(expDay);
        expyears.setBounds(580,660,75,30);
        expmonths.setBounds(670,660,100,30);
        expdays.setBounds(790,660,50,30);
        panelCredit.add(expyears);
        panelCredit.add(expmonths);
        panelCredit.add(expdays);
        

        btnAddCreditCard = new JButton("Add Credit Card");
        btnAddCreditCard.setBounds(60, 720, 150, 40);
        panelCredit.add(btnAddCreditCard);
        btnAddCreditCard.setBackground(Color.LIGHT_GRAY);

        btnSetCreditLimit = new JButton("Set Credit Limit");
        btnSetCreditLimit.setBounds(250,720,200,40);
        panelCredit.add(btnSetCreditLimit);
        btnSetCreditLimit.setBackground(Color.GREEN);

        btnCancelCreditCard = new JButton("Cancel Credit Card");
        btnCancelCreditCard.setBounds(470,720,200,40);
        panelCredit.add(btnCancelCreditCard);
        btnCancelCreditCard.setBackground(Color.MAGENTA);

        btnDisplayCredit = new JButton("Display");
        btnDisplayCredit.setBounds(160,780,200,40);
        panelCredit.add(btnDisplayCredit);
        btnDisplayCredit.setBackground(Color.PINK);

        btnClearCredit = new JButton("Clear");
        btnClearCredit.setBounds(410,780,200,40);
        panelCredit.add(btnClearCredit);
        btnClearDebit.setForeground(Color.black);
        btnClearCredit.setBackground(Color.blue);

        btnAddDebitCard.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) { 
                    try{
                        int cardId = Integer.parseInt(txtCardIdDebit.getText());
                        String clientName = txtClientNameDebit.getText();
                        String issuerBank = txtIssuerBankDebit.getText();
                        String bankAccount = txtBankAccountDebit.getText();
                        double balanceAmount = Double.parseDouble(txtBalanceAmountDebit.getText());
                        // int pinNumber = Integer.parseInt(txtPinNumber.getText());
                        
                        char[] pinChars = txtPinNumber.getPassword(); // retrieve the password as a character array
                        String pinString = new String(pinChars); // convert the character array to a String
                        int pinNumber = Integer.parseInt(pinString); 

                        if (cardId <= 0 || balanceAmount < 0 || pinNumber <= 0) {
                            JOptionPane.showMessageDialog(frame,"Please fill in all required fields with valid inputs only.","Error",JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        for(BankCard card : bankCards){
                            if (card instanceof DebitCard && card.getCardId() == cardId){
                                JOptionPane.showMessageDialog(frame, "Card ID already in use. Please enter a different Card ID.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                        DebitCard objDebitCard = new DebitCard(cardId,clientName,issuerBank,bankAccount,balanceAmount,pinNumber);
                        bankCards.add(objDebitCard);
                        JOptionPane.showMessageDialog(frame,"Debit Card added successfully.","SUCCESS",JOptionPane.INFORMATION_MESSAGE);

                    } catch(NumberFormatException e1){
                        JOptionPane.showMessageDialog(frame, "Invalid input. Please try again with a valid integer.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

        btnWithdraw.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) { 
                    try{
                        int cardId = Integer.parseInt(txtCardIdDebit.getText());
                        double balanceAmount = Double.parseDouble(txtBalanceAmountDebit.getText());
                        int withdrawalAmount = Integer.parseInt(txtWithdrawalAmount.getText());
                        String year = (String) years.getSelectedItem();
                        String month = (String) months.getSelectedItem();
                        String day = (String) days.getSelectedItem();
                        String dateOfWithdrawal = year + "/" + month + "/" + day;
                        // int pinNumber = Integer.parseInt(txtPinNumber.getText());
                        
                        char[] pinChars = txtPinNumber.getPassword(); // retrieve the password as a character array
                        String pinString = new String(pinChars); // convert the character array to a String
                        int pinNumber = Integer.parseInt(pinString); 
                        
                        boolean done = false; 
                        if (cardId <= 0 || balanceAmount < 0 || pinNumber <= 0|| withdrawalAmount<=0) {
                            JOptionPane.showMessageDialog(frame,"Please fill in all required fields only with valid inputs .","Error",JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        for(BankCard card : bankCards){
                            if (card instanceof DebitCard && card.getCardId() == cardId){
                                DebitCard debitCard = (DebitCard) card;
                                if (debitCard.getPinNumber() == pinNumber && withdrawalAmount <= debitCard.getBalanceAmount()){
                                    debitCard.withdraw(withdrawalAmount, dateOfWithdrawal, pinNumber);
                                    done = true;
                                    String withdraw_message = "Withdrawal of " + withdrawalAmount + " from Debit Card " + cardId + " is successfully completed."+"\nCard ID: " + cardId + "\nWithdrawal Amount: " + withdrawalAmount +
                                        "\nDate of Withdrawal: " + dateOfWithdrawal ;
                                    JOptionPane.showMessageDialog(frame, withdraw_message,
                                        "Withdrawal Information",JOptionPane.INFORMATION_MESSAGE);
                                    // exit the loop if a debit card match is found
                                }
                                else if (debitCard.getPinNumber() != pinNumber) {
                                    // Display an error message indicating that the PIN is incorrect
                                    JOptionPane.showMessageDialog(frame, "Incorrect PIN. Please check your PIN number and try again.","Error",JOptionPane.ERROR_MESSAGE);
                                    return;

                                }
                                else if (withdrawalAmount > debitCard.getBalanceAmount()) {
                                    // Display an error message indicating that the withdrawal amount exceeds the balance amount
                                    JOptionPane.showMessageDialog(frame, "Withdrawal amount exceeds balance amount. Please check your withdrawal amount and try again.","Error",JOptionPane.ERROR_MESSAGE);
                                    return;
                                }
                            }

                        }

                        if(done == false){
                            // Display an error message indicating that the withdrawal was unsuccessful
                            JOptionPane.showMessageDialog(frame, "Withdrawal failed due to Invalid CardId. Please check your card ID and try again.","Error",JOptionPane.ERROR_MESSAGE);
                        }

                    }
                    catch(NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(frame, "Invalid Input! Please fill in required fields with valid integers.","Error",JOptionPane.ERROR_MESSAGE);
                    }

                }
            });

        btnDisplayDebit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        int cardId = Integer.parseInt(txtCardIdDebit.getText());
                        for(BankCard card : bankCards){
                            if (card instanceof DebitCard && card.getCardId() == cardId){
                                DebitCard debitCard = (DebitCard) card;
                                debitCard.display();
                            }
                        }
                    }
                    catch(NumberFormatException e1){
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }

            });

        btnClearDebit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    txtCardIdDebit.setText("");
                    txtClientNameDebit.setText("");
                    txtIssuerBankDebit.setText("");
                    txtBankAccountDebit.setText("");
                    txtBalanceAmountDebit.setText("");
                    txtPinNumber.setText("");
                    txtWithdrawalAmount.setText("");
                }
            });

        btnAddCreditCard.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) { 

                    try{
                        int cardId = Integer.parseInt(txtCardIdCredit.getText());
                        String clientName = txtClientNameCredit.getText();
                        String issuerBank = txtIssuerBankCredit.getText();
                        String bankAccount = txtBankAccountCredit.getText();
                        double balanceAmount = Double.parseDouble(txtBalanceAmountCredit.getText());
                        int cvcNumber = Integer.parseInt(txtCvcNumber.getText());
                        double interestRate = Double.parseDouble(txtInterestRate.getText());
                        String yearExp = (String) expyears.getSelectedItem();
                        String monthExp = (String) expmonths.getSelectedItem();
                        String dayExp = (String) expdays.getSelectedItem();
                        String expirationDate = yearExp + "/" + monthExp + "/" + dayExp;

                        if(cardId<=0||balanceAmount<0||cvcNumber<0||interestRate<0){
                            JOptionPane.showMessageDialog(frame,"Null and negative numbers are not acceptable.Please fill in all required fields only with valid inputs.","Error",JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        for(BankCard card : bankCards){
                            if (card instanceof CreditCard && card.getCardId() == cardId){
                                JOptionPane.showMessageDialog(frame, "Card ID already in use. Please enter a different Card ID.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                        CreditCard objCreditCard = new CreditCard(cardId,clientName,issuerBank,bankAccount,balanceAmount,cvcNumber,interestRate,expirationDate);
                        bankCards.add(objCreditCard);
                        JOptionPane.showMessageDialog(frame,"Credit Card added successfully.","Title",JOptionPane.INFORMATION_MESSAGE);

                    }
                    catch(NumberFormatException e1){
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.","Error",JOptionPane.ERROR_MESSAGE);
                    }

                }
            });

        btnSetCreditLimit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        int cardId = Integer.parseInt(txtCardIdCredit.getText());
                        double creditLimit = Double.parseDouble(txtCreditLimit.getText());
                        int gracePeriod = Integer.parseInt(txtGracePeriod.getText());
                        boolean cardFound = false;
                        if(cardId<=0||creditLimit<=0||gracePeriod<=0){
                            JOptionPane.showMessageDialog(frame,"Null and negative numbers are not acceptable.Please fill in all required fields only with valid inputs.","Error",JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        
                        for(BankCard card : bankCards){
                            if (card instanceof CreditCard && card.getCardId() == cardId){
                                CreditCard creditCard = (CreditCard) card;
                                if (creditCard.getCreditLimit() != 0.0) {
                                    JOptionPane.showMessageDialog(frame, "Credit limit is already set for card ID " + cardId, "Error", JOptionPane.ERROR_MESSAGE);
                                    return;
                                
                                } else if(creditLimit <= 2.5*creditCard.getBalanceAmount()){
                                    creditCard.setCreditLimit(creditLimit,gracePeriod);
                                    cardFound= true;
                                    String message = "New credit limit for card ID " + cardId + "is " + creditLimit
                                        + "\nNew grace period for card ID " + cardId + "is " + gracePeriod + "days";
                                    JOptionPane.showMessageDialog(frame, message, " Setting Credit Limit", JOptionPane.INFORMATION_MESSAGE);
                                }
                                else{
                                 JOptionPane.showMessageDialog(frame,"The Credit Cannot be issued because of insufficient balance.","Error" ,JOptionPane.ERROR_MESSAGE);
                                 return;
                                }
                            }
                        }
                        if (cardFound==false){
                            JOptionPane.showMessageDialog(frame, "Invalid card ID.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException e1) {
                        JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }
            });

        btnCancelCreditCard.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int cardId = Integer.parseInt(txtCardIdCredit.getText());
                    boolean cardFound = false;
                    for(BankCard card : bankCards){
                        if (card instanceof CreditCard && card.getCardId() == cardId){
                            CreditCard creditCard = (CreditCard) card;
                            if (creditCard.getCvcNumber() == 0) {
                                JOptionPane.showMessageDialog(frame, "Credit card with card ID " + cardId + " has already been canceled.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            else{
                                creditCard.cancelCreditCard();
                                cardFound= true;
                                // Display a message to the user indicating whether the credit card was successfully canceled or not
                                JOptionPane.showMessageDialog(frame, "Credit card with card ID "+"" + cardId + " has been successfully canceled.", "Success", JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }

                        }
                        if (cardFound==false) {
                            JOptionPane.showMessageDialog(frame, "Invalid card ID. Credit card could not be canceled.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                    }        
                }
            });

        btnDisplayCredit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        int cardId = Integer.parseInt(txtCardIdCredit.getText());
                        for(BankCard card : bankCards){
                            if (card instanceof CreditCard && card.getCardId() == cardId){
                                CreditCard creditCard = (CreditCard) card;
                                creditCard.display();
                            }
                        }
                    }
                    catch(NumberFormatException e2){
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.");
                    }
                }
            });

        btnClearCredit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    txtCardIdCredit.setText("");
                    txtClientNameCredit.setText("");
                    txtIssuerBankCredit.setText("");
                    txtBankAccountCredit.setText("");
                    txtBalanceAmountCredit.setText("");
                    txtCvcNumber.setText("");
                    txtCreditLimit.setText("");
                    txtInterestRate.setText("");
                    txtGracePeriod.setText("");

                }
            });        

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(900,900);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

    public static void main(String []args){
        new BankGUI();
    }
}