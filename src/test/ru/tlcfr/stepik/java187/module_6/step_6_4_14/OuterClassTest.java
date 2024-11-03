package ru.tlcfr.stepik.java187.module_6.step_6_4_14;

import org.junit.jupiter.api.Test;
import ru.tlcfr.stepik.java187.module_6.step_6_4_14.OuterClass.MailMessage;
import ru.tlcfr.stepik.java187.module_6.step_6_4_14.OuterClass.MailService;
import ru.tlcfr.stepik.java187.module_6.step_6_4_14.OuterClass.Salary;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class OuterClassTest {

    private static final String RANDOM_FROM = "Иванов Иван Иванович";
    private static final String RANDOM_TO = "Петров Петр Петрович";
    private static final int RANDOM_SALARY = new Random().nextInt();

    @Test
    void sampleInput1() {
        // Создание почтового сервиса.
        MailService<String> mailService = new MailService<>();

        // Создание и обработка списка из трех писем писем почтовым сервисом
        givenMessages().forEach(mailService);

        // Получение и проверка словаря "почтового ящика",
        // где по получателю можно получить список сообщений, которые были ему отправлены
        Map<String, List<String>> mailBox = mailService.getMailBox();

        assertIterableEquals(
                List.of("This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"),
                mailBox.get("H.P. Lovecraft")
        );
        assertIterableEquals(
                List.of(
                        "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!",
                        "Я так и не понял Интерстеллар."
                ),
                mailBox.get("Christopher Nolan")
        );
        assertEquals(0, mailBox.get(RANDOM_TO).size());

        // Создание списка из трех зарплат.
        Salary salary1 = new Salary("Facebook", "Mark Zuckerberg", 1);
        Salary salary2 = new Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
        Salary salary3 = new Salary(RANDOM_FROM, RANDOM_TO, RANDOM_SALARY);

        // Создание почтового сервиса, обрабатывающего зарплаты.
        MailService<Integer> salaryService = new MailService<>();

        // Обработка списка зарплат почтовым сервисом
        List.of(salary1, salary2, salary3).forEach(salaryService);

        // Получение и проверка словаря "почтового ящика",
        // где по получателю можно получить список зарплат, которые были ему отправлены.
        Map<String, List<Integer>> salaries = salaryService.getMailBox();

        assertIterableEquals(List.of(1), salaries.get(salary1.getTo()));
        assertIterableEquals(List.of(Integer.MAX_VALUE), salaries.get(salary2.getTo()));
        assertIterableEquals(List.of(RANDOM_SALARY), salaries.get(RANDOM_TO));
    }

    private List<MailMessage> givenMessages() {
        MailMessage firstMessage = new MailMessage(
                "Robert Howard",
                "H.P. Lovecraft",
                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
        );

        assertEquals("Robert Howard", firstMessage.getFrom());
        assertEquals("H.P. Lovecraft", firstMessage.getTo());
        assertTrue(firstMessage.getContent().endsWith("Howard!"));

        MailMessage secondMessage = new MailMessage(
                "Jonathan Nolan",
                "Christopher Nolan",
                "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!"
        );

        MailMessage thirdMessage = new MailMessage(
                "Stephen Hawking",
                "Christopher Nolan",
                "Я так и не понял Интерстеллар."
        );

        return List.of(firstMessage, secondMessage, thirdMessage);
    }
}
