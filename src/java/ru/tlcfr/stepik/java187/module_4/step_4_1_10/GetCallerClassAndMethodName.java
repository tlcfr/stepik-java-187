package ru.tlcfr.stepik.java187.module_4.step_4_1_10;

public class GetCallerClassAndMethodName {

    private GetCallerClassAndMethodName() {
    }

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            if (stackTrace.length > 2) {
                StackTraceElement callerMethod = stackTrace[2];
                return callerMethod.getClassName() + "#" + callerMethod.getMethodName();
            }
        }
        return null;
    }
}
