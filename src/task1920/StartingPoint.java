package task1920;

/**
 * @author Kretov D.V
 * @version 1) С помощью класса LocalDateTime посчитать сколько дней, часов, минут и секунд проходит между началом лекции в понедельник и концом лекции в субботу.
 * (один и тот же промежуток отобразить в днях, часах, минутах и секундах)
 * 2) С помощью класса Duration посчитать количество минут и секунд в лекции
 * 3) С помощью класса DateTimeFormatter парсить строку в формате "1999/Jun/18 07:34:56 PM" (год/аббревиатура месяца/число часы в 12часовом формате:минута:секунда) в LocalDateTime.
 * 4) С помощью класса DateTimeFormatter форматировать дату в строку вида "23:56 2001/15/01" (часы:минуты год/месяц/день)
 * <p>
 * 5*. Посчитать сколько минут длились весна, лето, осень и зима в 1965 году
 */

public class StartingPoint {

    public static void main(String[] args) {

        TimeIntervals timeIntervals = new TimeIntervals();
        timeIntervals.measureIntervalBetweenLectures();
        timeIntervals.countHowLongLectureLasts();
        timeIntervals.formatDateToString();
        timeIntervals.countHowLongSeasonsLasted();
        timeIntervals.parseStringToDateFormat();
    }
}