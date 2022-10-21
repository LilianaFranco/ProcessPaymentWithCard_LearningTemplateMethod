import java.time.LocalDate;

public class DebitCard extends Card{

    //Properties
    Double balance;

    //Constructor

    public DebitCard(int cardNumber, int cardVerificationValue, LocalDate cardExpirationDate, Double availableAmount) {
        super(cardNumber, cardVerificationValue, cardExpirationDate);
        this.balance = availableAmount;
    }

    //Setters and Getter

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }


    //Methods

    @Override
    protected Double payAmount(Double amount) {
        if (amount < this.balance){
            this.balance = this.balance - amount;
            System.out.println("The payment was done! Your balance is:" + this.balance);
            return this.balance;
        } else {
            Double impossiblePayment = this.balance - amount;
            System.out.println("Non-sufficient funds. Your are missing:" + impossiblePayment);
            return impossiblePayment;
        }
    }
}
