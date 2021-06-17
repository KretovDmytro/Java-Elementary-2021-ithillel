package task07.exercise01;

/**
 * @author Kretov D.V
 * @version Написать регулярное выражение для формата даты YYYY/MM/dd HH:mm
 * Примеры:
 * 2020/12/23 05:30 - valid
 * 2020/13/77 99:99 - invalid
 * asdasdasd - invalid
 */

public class Main {

    public static void main(String[] args) {
        String input = "2020/12/23 05:30";
        String regex = "((?!0000)\\d{4}/(0[12]|1[0-2])/(0[1-9]|[1][\\d]|2[0-9]|3[01])\\s([01][\\d]|2[0-3]):([0-5][\\d]))";
        boolean matched = input.matches(regex);
        if (matched) {
            System.out.print("valid");
        } else {
            System.out.print("invalid");
        }
    }
}

// link to algorithm 🠗
// src="https://embed.ihateregex.io/make/KCUzRiEwMDAwKSU1QyU1Q2QlN0I0JTdEJTVDJTVDJTJGKDAlNUIxMiU1RCU3QzElNUIwLTIlNUQpJTVDJTVDJTJGKDAlNUIxLTklNUQlN0MlNUIxJTVEJTVCJTVDJTVDZCU1RCU3QzIlNUIwLTklNUQlN0MzJTVCMDElNUQpJTVDJTVDcyglNUIwMSU1RCU1QiU1QyU1Q2QlNUQlN0MyJTVCMC0zJTVEKSUzQSglNUIwLTUlNUQlNUIlNUMlNUNkJTVEKQ"