package ru.tlcfr.stepik.java187.module_4.step_4_3_9;

import java.util.logging.Logger;

public class OuterClass {

    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    private OuterClass() {
    }

    /*
    Интерфейс: сущность, которую можно отправить по почте.
    У такой сущности можно получить от кого и кому направляется письмо.
    */
    public static interface Sendable {

        String getFrom();

        String getTo();
    }

    /*
    Абстрактный класс,который позволяет абстрагировать логику хранения
    источника и получателя письма в соответствующих полях класса.
    */
    public static abstract class AbstractSendable implements Sendable {

        protected final String from;
        protected final String to;

        public AbstractSendable(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String getFrom() {
            return from;
        }

        @Override
        public String getTo() {
            return to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AbstractSendable that = (AbstractSendable) o;

            if (!from.equals(that.from)) return false;
            if (!to.equals(that.to)) return false;

            return true;
        }
    }

    /*
    Письмо, у которого есть текст, который можно получить с помощью метода `getMessage`
    */
    public static class MailMessage extends AbstractSendable {

        private final String message;

        public MailMessage(String from, String to, String message) {
            super(from, to);
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailMessage that = (MailMessage) o;

            if (message != null ? !message.equals(that.message) : that.message != null) return false;

            return true;
        }
    }

    /*
    Посылка, содержимое которой можно получить с помощью метода `getContent`
    */
    public static class MailPackage extends AbstractSendable {

        private final Package content;

        public MailPackage(String from, String to, Package content) {
            super(from, to);
            this.content = content;
        }

        public Package getContent() {
            return content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailPackage that = (MailPackage) o;

            if (!content.equals(that.content)) return false;

            return true;
        }
    }

    /*
    Класс, который задает посылку. У посылки есть текстовое описание содержимого и целочисленная ценность.
    */
    public static class Package {

        private final String content;
        private final int price;

        public Package(String content, int price) {
            this.content = content;
            this.price = price;
        }

        public String getContent() {
            return content;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Package aPackage = (Package) o;

            if (price != aPackage.price) return false;
            if (!content.equals(aPackage.content)) return false;

            return true;
        }
    }

    /*
    Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
    */
    public static interface MailService {

        Sendable processMail(Sendable mail);
    }

    /*
    Класс, в котором скрыта логика настоящей почты
    */
    public static class RealMailService implements MailService {

        @Override
        public Sendable processMail(Sendable mail) {
            // Здесь описан код настоящей системы отправки почты.
            return mail;
        }
    }

    public static class UntrustworthyMailWorker implements MailService {

        private final MailService[] thirdParties;
        private final MailService realMailService = new RealMailService();

        public UntrustworthyMailWorker(MailService[] thirdParties) {
            this.thirdParties = thirdParties;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            for (MailService mailService : thirdParties) {
                mail = mailService.processMail(mail);
            }
            return realMailService.processMail(mail);
        }

        public MailService getRealMailService() {
            return realMailService;
        }
    }

    public static class Spy implements MailService {

        private final Logger log;

        public Spy(Logger log) {
            this.log = log;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailMessage) {
                MailMessage mailMessage = (MailMessage) mail;
                if (AUSTIN_POWERS.equals(mailMessage.getFrom()) || AUSTIN_POWERS.equals(mailMessage.getTo())) {
                    log.warning(() -> String.format(
                            "Detected target mail correspondence: from %s to %s \"%s\"",
                            mailMessage.getFrom(), mailMessage.getTo(), mailMessage.getMessage()
                    ));
                } else {
                    log.info(() -> String.format(
                            "Usual correspondence: from %s to %s",
                            mailMessage.getFrom(), mailMessage.getTo()
                    ));
                }
            }
            return mail;
        }
    }

    public static class Thief implements MailService {

        private final int minCost;

        private int stolenValue;

        public Thief(int minCost) {
            this.minCost = minCost;
            this.stolenValue = 0;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage) {
                MailPackage mailPackage = (MailPackage) mail;
                Package content = mailPackage.getContent();
                if (content.getPrice() >= minCost) {
                    stolenValue += content.getPrice();

                    Package emptyPackage = new Package("stones instead of " + content.getContent(), 0);
                    return new MailPackage(mailPackage.getFrom(), mailPackage.getTo(), emptyPackage);
                }
            }
            return mail;
        }

        public int getStolenValue() {
            return stolenValue;
        }
    }

    public static class Inspector implements MailService {

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage) {
                MailPackage mailPackage = (MailPackage) mail;
                String content = mailPackage.getContent().getContent();

                if (content.contains(WEAPONS) || content.contains(BANNED_SUBSTANCE)) {
                    throw new IllegalPackageException();
                }
                if (content.contains("stones")) {
                    throw new StolenPackageException();
                }
            }
            return mail;
        }
    }

    public static class StolenPackageException extends RuntimeException {
    }

    public static class IllegalPackageException extends RuntimeException {
    }
}
