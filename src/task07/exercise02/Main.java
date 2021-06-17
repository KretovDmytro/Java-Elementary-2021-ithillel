package task07.exercise02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Kretov D.V
 * @version Написать регулярное выражение, которое будет искать домен почтового ящика и возвращать его
 * Примеры:
 * abc@mail.com -> main.com
 * zzz@ccc.v -> ccc.y
 */

public class Main {

    public static void main(String[] args) {
        String mail = "abc@mail.com";
        String regex = "([a-z0-9]+)@([a-z0-9]+\\.[a-z0-9]+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);

        if (matcher.find()) {
            String domain = matcher.group(2);
            System.out.println("Domain is: " + domain);
        } else {
            System.out.println("not a valid email domain");
        }
    }
}
