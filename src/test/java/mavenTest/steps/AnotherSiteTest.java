package mavenTest.steps;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

public class AnotherSiteTest {

    @Дано("пользователь идет на сайт {string}")
    public void goToSite(String url) {
        System.out.println("Идет на сайт - " + url);
    }

    @Когда("пользователь нажимает на кнопку содержащий текст {string}")
    public void clickTheFindButton(String text) {
        System.out.println("нажимает на кнопку с текстом - " + text);
    }

    @Тогда("пользователь ожидает {int} секунд")
    public void waitTheCalcIsExist(int seconds) {
        System.out.println("Пользователь ждет " + seconds + " секунд");
    }

}
