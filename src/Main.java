import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate expiredDate = LocalDate.of(2020, 6,15);
        CreditCard expiredCard = new CreditCard(123456, 123,expiredDate,5000.0, 3800.0);
        expiredCard.validateCardDate();
    }
}