package Unit_Testing;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProgramTest {
    @Test
    public void IsPrime_IsValidPrime_ReturnTrue() {
        //Arrange 
    
        //Act
        boolean IsPrime = Program.IsPrime(7);

        //Assert
        assertTrue(IsPrime);
    }

    public void IsPrime_ZeroValue_ReturnFalase() {

        //Arrange

        //Act
        boolean IsPrime = Program.IsPrime(0);
    
        //Assert
        assertFalse(IsPrime);
    }

    @Test
    public void IsPrime_NotPrime_NotValidPrime_ReturnFalse() {

        //Arrange

        //Act
        boolean IsPrime = Program.IsPrime(10);

        //Assert
        assertFalse(IsPrime);
    }

    @Test
    public void IsPrime_IsNumber9_ReturnFalse() {

        //Arrange

        //Act
        boolean IsPrime = Program.IsPrime(9);

        //Assert
        assertFalse(IsPrime);
    }

    @Test
    //@Test(expected = NullPointerException.class)  //Assert is in Test notation
    public void Special_Input2023_ThrowException() {
        
        //Arrange

        //Act + Assert
        assertThrows(NullPointerException.class, () -> Program.Special(2023));
    }
}
