package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidEmailTest {

    @Test
    void testValidEmail() {
        assertTrue(ValidEmail.isValid("mario@fh.com"));
        assertTrue(ValidEmail.isValid("user1234@asd.com"));
    }

    @Test
    void testInValidEmails() {
        assertFalse(ValidEmail.isValid("marioShenouda.com"));
        assertFalse(ValidEmail.isValid("halloWorld.com"));
    }

    @Test
    void testNullOrEmpty() {
        assertFalse(ValidEmail.isValid(null));
        assertFalse(ValidEmail.isValid(""));
        assertFalse(ValidEmail.isValid(" "));
    }

    @Test
    void  testAtEndOfEmail(){
        assertFalse(ValidEmail.isValid("marioShenouda@"));
    }
    

}
