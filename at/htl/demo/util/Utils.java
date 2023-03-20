package at.htl.demo.util;

public class Utils {
    public static void printStart(String message) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= Math.floor(38f - message.length() / 2f); i++) {
            sb.append("-");
        }
        sb.append(" ").append(message).append(" ");
        for (int i = 0; i <= Math.ceil(38f - message.length() / 2f); i++) {
            sb.append("-");
        }
        System.out.println(sb);
    }

    public static void printEnd() {
        System.out.printf("--------------------------------------------------------------------------------%n%n");
    }
}
