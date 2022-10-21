import java.util.Date;

public abstract class Card {

    //Properties
    int cardNumber;
    int cardVerificationValue;
    Date cardExpirationDate;

    //Constructor

    public Card(int cardNumber, int cardVerificationValue, Date cardExpirationDate) {
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

    public Date getCardExpirationDate() {
        return cardExpirationDate;
    }

    public void setCardExpirationDate(Date cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    //Methods

    public void processPayment(){
        validateCardDate();
        payAmount();
    }

    protected boolean validateCardDate(){
        Date today = new Date();
        return this.cardExpirationDate.after(today);
    }

    protected abstract void payAmount();

}
