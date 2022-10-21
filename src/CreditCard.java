import java.time.LocalDate;

public class CreditCard extends Card{

    //Properties
    Double creditLimit;
    Double currentDebt;
    Double balance;

    //Constructor

    public CreditCard(int cardNumber, int cardVerificationValue, LocalDate cardExpirationDate, Double creditLimit, Double currentCredit) {
        super(cardNumber, cardVerificationValue, cardExpirationDate);
        this.creditLimit = creditLimit;
        this.currentDebt = currentCredit;
        this.balance = creditLimit - currentCredit;
    }

    //Setters and Getter

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Double getCurrentDebt() {
        return currentDebt;
    }

    public void setCurrentDebt(Double currentDebt) {
        this.currentDebt = currentDebt;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = this.creditLimit - this.currentDebt;
    }

    //Methods

    @Override
    protected Double payAmount(Double amount) {
        if(amount < this.balance){
            this.currentDebt = this.currentDebt + amount;
            this.balance = this.balance - amount;
            System.out.println("Payment done! Your balance is:" + this.balance);
            return this.balance;
        } else {
            Double impossibleDebt = this.balance - amount;
            System.out.println("Non-sufficient funds. This amount exceed your limit in:" + impossibleDebt);
            return impossibleDebt;

        }
    }
}
