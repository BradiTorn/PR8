import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class IsxCodTest {

    IsxCod isxCod;

    @BeforeAll
    static void start(){
        System.out.println("сработал @BeforeAll");

    }

    @BeforeEach
    void init(){
        System.out.println("сработал BeforeEach");
        isxCod = new IsxCod();
    }



    @Test
    void lol() {
        System.out.println("сработал lol");
        assertAll(
                () -> assertEquals(2, isxCod.Lol(1)),
                () -> assertEquals(2, isxCod.Lol(1)),
                () -> assertNotNull(isxCod)
        );

    }
    @Test
    void lol2(){
        System.out.println("сработал lol2");

        assertThrows(ArithmeticException.class, () -> isxCod.del(9));
    }

    @AfterEach
    void afterEach(){
        System.out.println("сработал afterEach");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("сработал afterAll");

    }

    @ParameterizedTest
    @ValueSource(ints = {6, 8, 2, 9})
    void parameterizedTest(int number){
        assertTrue(number < 7);
        System.out.println("сработал parameterizedTest");

    }


}