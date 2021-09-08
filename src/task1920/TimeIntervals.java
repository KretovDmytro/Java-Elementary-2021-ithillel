package task1920;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeIntervals {

    private final LocalDateTime startOfLectureOnMonday = LocalDateTime.of(2021, 9, 6, 20, 0);
    private final LocalDateTime finishOfLectureOnMonday = LocalDateTime.of(2021, 9, 6, 21, 59);
    private final LocalDateTime finishOfLectureOnSaturday = LocalDateTime.of(2021, 9, 11, 15, 59);

    //С помощью класса LocalDateTime посчитать сколько дней, часов, минут и секунд проходит между началом лекции в понедельник и концом лекции в субботу.
    // (один и тот же промежуток отобразить в днях, часах, минутах и секундах)
    public void measureIntervalBetweenLectures() {
        Duration dayDuration = Duration.between(startOfLectureOnMonday, finishOfLectureOnSaturday);
        System.out.println("Между стартом лекции в пн и финишем в сб прошло: " + dayDuration.toSeconds() + " сек.");
        System.out.println("Между стартом лекции в пн и финишем в сб прошло: " + dayDuration.toMinutes() + " мин.");
        System.out.println("Между стартом лекции в пн и финишем в сб прошло: " + dayDuration.toHours() + " часов.");
        System.out.println("Между стартом лекции в пн и финишем в сб прошло: " + dayDuration.toDays() + " собственно дней.");
    }

    // Посчитать сколько минут длились весна, лето, осень и зима в 1965 году
    public void countHowLongSeasonsLasted() {
        LocalDateTime startYear1965 = LocalDateTime.of(1965, Month.JANUARY, 1, 0, 0, 0);

        System.out.println("\nwinter Period " + Duration.between(startYear1965.minusMonths(1), startYear1965.plusMonths(2)).toMinutes() + " min" +
                "\nspring Period " + Duration.between(startYear1965.plusMonths(2), startYear1965.plusMonths(5)).toMinutes() + " min" +
                "\nsummer Period " + Duration.between(startYear1965.plusMonths(5), startYear1965.plusMonths(8)).toMinutes() + " min" +
                "\nautumn Period " + Duration.between(startYear1965.plusMonths(8), startYear1965.plusMonths(11)).toMinutes() + " min");
    }

    //С помощью класса Duration посчитать количество минут и секунд в лекции
    public void countHowLongLectureLasts() {
        Duration lectureDuration = Duration.between(startOfLectureOnMonday, finishOfLectureOnMonday);
        System.out.println("\nНа лекции в пн мы проводим " + lectureDuration.toSeconds() + " сек. Или " + lectureDuration.toMinutes() + " минут.");
    }

    // С помощью класса DateTimeFormatter форматировать дату в строку вида "23:56 2001/15/01" (часы:минуты год/месяц/день)
    public void formatDateToString() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm yyyy/MM/dd");
        System.out.println("\n" + dateTimeFormatter.format(now));
    }

    // С помощью класса DateTimeFormatter парсить строку в формате "1999/Jun/18 07:34:56 PM" (год/аббревиатура месяца/число часы в 12часовом формате:минута:секунда) в LocalDateTime.
    public void parseStringToDateFormat() {
        String str = "1999/Jun/18 07:34:56 PM";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MMM/dd h:mm:ss a", Locale.ENGLISH);
        LocalDateTime localDateTime = LocalDateTime.parse(str, dateTimeFormatter);
        System.out.println("\n" + localDateTime);
    }
}