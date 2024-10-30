package ru.tlcfr.stepik.java187.step_2_4_10;

public class PrintTextPerRole {

    private PrintTextPerRole() {
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();

        StringBuilder[] rolesLines = new StringBuilder[roles.length];
        for (int lineIndex = 0; lineIndex < textLines.length; lineIndex++) {
            String line = textLines[lineIndex];
            for (int roleIndex = 0; roleIndex < roles.length; roleIndex++) {
                String role = roles[roleIndex];
                if (line.startsWith(role + ':')) {
                    if (rolesLines[roleIndex] == null) {
                        rolesLines[roleIndex] = new StringBuilder();
                    }
                    rolesLines[roleIndex]
                            .append(lineIndex + 1).append(')')
                            .append(line.substring(role.length() + 1)).append("\n");
                    break;
                }
            }
        }

        for (int roleIndex = 0; roleIndex < roles.length; roleIndex++) {
            result
                    .append(roles[roleIndex]).append(':').append('\n')
                    .append(rolesLines[roleIndex]).append('\n');
        }

        return result.toString();
    }
}
