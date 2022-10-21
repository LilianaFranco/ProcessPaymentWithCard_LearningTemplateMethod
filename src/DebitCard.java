import java.util.Date;

public class DebitCard extends Card{

    //Properties
    Double availableAmount;

    //Constructor

    public DebitCard(int cardNumber, int cardVerificationValue, Date cardExpirationDate, Double availableAmount) {
        super(cardNumber, cardVerificationValue, cardExpirationDate);
        this.availableAmount = availableAmount;
    }

    //Setters and Getter

    public Double getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(Double availableAmount) {
        this.availableAmount = availableAmount;
    }


    //Methods

    @Override
    protected void payAmount(Double amount) {
        if (amount < this.availableAmount){
            this.availableAmount = this.availableAmount - amount;
        } else {
            System.out.println("Su saldo es insuficiente. Intente con un valor menor");
        }
    }
}
