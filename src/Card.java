import java.time.LocalDate;
import java.util.Date;

public abstract class Card {

    //Properties
    int cardNumber;
    int cardVerificationValue;
    LocalDate cardExpirationDate;

    //Constructor

    public Card(int cardNumber, int cardVerificationValue, LocalDate cardExpirationDate) {
        this.cardNumber = cardNumber;
        this.cardVerificationValue = cardVerificationValue;
        this.cardExpirationDate = cardExpirationDate;
    }

    //Setters and Getters

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardVerificationValue() {
        return cardVerificationValue;
    }

    public void setCardVerificationValue(int cardVerificationValue) {
        this.cardVerificationValue = cardVerificationValue;
    }

    public LocalDate getCardExpirationDate() {
        return cardExpirationDate;
    }

    public void setCardExpirationDate(LocalDate cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    //Methods

    public void processPayment(Double amount){
        validateCardDate();
        payAmount(amount);
    }

    protected boolean validateCardDate(){
        LocalDate today = LocalDate.now();
        if (this.cardExpirationDate.isAfter(today)){
            System.out.println("Your card is valid");
            return true;
        } else {
            System.out.println("Your card is expired");
            return false;
        }

    }

    //Methods

    protected abstract Double payAmount(Double amount);
}
