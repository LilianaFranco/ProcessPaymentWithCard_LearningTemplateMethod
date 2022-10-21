import org.testng.annotations.Test;

import java.time.LocalDate;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class CreditCardTest {

    @Test
    public void validateCardDate_ExpiredCard(){
        //Given
        LocalDate expiredDate = LocalDate.of(2020, 6,15);
        CreditCard expiredCard = new CreditCard(123456, 123,expiredDate,5000.0, 3800.0);
        boolean noValidCard = expiredCard.validateCardDate();
        //Then
        assertFalse(noValidCard);
    }

    @Test
    public void payAmount_amountExceedBalance(){
        //Given
        LocalDate validDate = LocalDate.of(2025, 6,15);
        CreditCard validCard = new CreditCard(123456, 123,validDate,5000.0, 3000.0);
        Double amount = 2500.0;
        //When
        Double negativeBalance = validCard.payAmount(amount);
        //Then
        assertTrue(negativeBalance<0.0);
    }
}
