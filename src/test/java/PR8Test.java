import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PR8Test {

    @ParameterizedTest
    @ValueSource(strings = {"valera8800", "vanek9857"})
    void login( String result) {

        PR8 pr8 = new PR8();

        boolean factLog = pr8.login(result);

        assertTrue(factLog);
    }

    @ParameterizedTest
    @ValueSource(strings = {"3723HFf!8jfF", "12312dfdfFGF"})
    void password(String rez) {
        PR8 pr8 = new PR8();

        boolean factPass = pr8.password(rez);

        assertTrue(factPass, "Пользователь не создан");
        System.out.println("Пользователь создан");
    }

    @ParameterizedTest
    @CsvSource({
            "valera8800, 3723HFf!8jfF",
            "vanek9857, 12312dfdfFGF"})
    void vse(String log, String pas) {
        PR8 pr8 = new PR8();

        boolean vse  = pr8.vs(log, pas);

        assertTrue(vse, "Пользователь не создан");
        System.out.println("Пользователь создан в тесте vse");
    }
}