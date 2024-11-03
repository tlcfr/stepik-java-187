package ru.tlcfr.stepik.java187.module_6.step_6_4_14;

import java.util.*;
import java.util.function.*;

public class OuterClass {

    private OuterClass() {
    }

    public static interface IMessage<T> {

        String getFrom();

        String getTo();

        T getContent();
    }

    public static class MailBox<T> extends HashMap<String, List<T>> {

        @Override
        public List<T> get(Object key) {
            return getOrDefault(key, new ArrayList<>());
        }
    }

    public static class MailMessage implements IMessage<String> {

        private final String from;
        private final String to;
        private final String content;

        public MailMessage(String from, String to, String content) {
            this.from = from;
            this.to = to;
            this.content = content;
        }

        public String getFrom() {
            return from;
        }

        public String getTo() {
            return to;
        }

        public String getContent() {
            return content;
        }
    }

    public static class Salary implements IMessage<Integer> {

        private final String from;
        private final String to;
        private final int content;

        public Salary(String from, String to, int content) {
            this.from = from;
            this.to = to;
            this.content = content;
        }

        public String getFrom() {
            return from;
        }

        public String getTo() {
            return to;
        }

        public Integer getContent() {
            return content;
        }
    }

    public static class MailService<T> implements Consumer<IMessage<T>> {

        private final MailBox<T> mailBox = new MailBox<>();

        @Override
        public void accept(IMessage<T> message) {
            String to = message.getTo();
            T content = message.getContent();

            if (mailBox.containsKey(to)) {
                mailBox.get(to).add(content);
            } else {
                mailBox.put(to, new ArrayList<>(Collections.singletonList(content)));
            }
        }

        public MailBox<T> getMailBox() {
            return mailBox;
        }
    }
}
