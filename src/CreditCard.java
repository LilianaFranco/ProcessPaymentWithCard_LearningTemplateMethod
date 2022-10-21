import java.util.Date;

public class CreditCard extends Card{

    //Properties
    Double maxDebtAllowed;
    Double currentDebt;
    Double availableAmount;

    //Constructor
    public CreditCard(int cardNumber, int cardVerificationValue, Date cardExpirationDate, Double maxDebtAllowed, Double currentDebt, Double availableAmount) {
        super(cardNumber, cardVerificationValue, cardExpirationDate);
        this.maxDebtAllowed = maxDebtAllowed;
        this.currentDebt = currentDebt;
        this.availableAmount = availableAmount;
    }

    //Setters and Getter

    public Double getMaxDebtAllowed() {
        return maxDebtAllowed;
    }

    public void setMaxDebtAllowed(Double maxDebtAllowed) {
        this.maxDebtAllowed = maxDebtAllowed;
    }

    public Double getCurrentDebt() {
        return currentDebt;
    }

    public void setCurrentDebt(Double currentDebt) {
        this.currentDebt = currentDebt;
    }

    public Double getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(Double availableAmount) {
        this.availableAmount = availableAmount;
    }

    //Methods

    @Override
    protected void payAmount(Double amount) {
        if ((amount< this.availableAmount) && (availableAmount+amount)<this.maxDebtAllowed){
            this.currentDebt = this.currentDebt + amount;
            this.availableAmount = this.availableAmount - amount;
        } else{
            System.out.println("Su saldo es insuficiente. Intente con un valor menor");
        }
    }
}
