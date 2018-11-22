package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    LoginService loginService;
    LoginGenerator loginGenerator;

    @Before
    public void init(){
        loginService = new LoginService(new String[]
                {"JROL","BPER","CGUR","JDU","JRAL","JRAL1"});
    }

    @Test
    public void generateLoginForNomAndPrenomCas1() {
        //Given new login generate
        //When
        //Then the result should be "PDUR"
        loginGenerator = new LoginGenerator(loginService);
        loginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        assertEquals(true,loginService.loginExists("PDUR"));
    }

    @Test
    public void generateLoginForNomAndPrenomCas2() {
        //Given new login generate
        //When
        //Then the result should be "PDUR"
        loginGenerator = new LoginGenerator(loginService);
        loginGenerator.generateLoginForNomAndPrenom("Ralling","John");
        assertEquals(true,loginService.loginExists("JRAL2"));
    }
}