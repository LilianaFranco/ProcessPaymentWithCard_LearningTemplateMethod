import org.testng.annotations.Test;

import java.time.LocalDate;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class DebitCardTest {

    @Test
    public void validateCardDate_ExpiredCard(){
        //Given
        LocalDate expiredDate = LocalDate.of(2020, 6,15);
        DebitCard expiredCard = new DebitCard(123456, 123, expiredDate, 2000.0);
        boolean noValidCard = expiredCard.validateCardDate();
        //Then
        assertFalse(noValidCard);
    }

    @Test
    public void payAmount_amountExceedBalance(){
        //Given
        LocalDate validDate = LocalDate.of(2025, 6,15);
        DebitCard validCard = new DebitCard(123456, 123, validDate, 2000.0);
        Double amount = 2500.0;
        //When
        Double negativeBalance = validCard.payAmount(amount);
        //Then
        assertTrue(negativeBalance<0.0);
    }
}
