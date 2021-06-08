package task03.exercise03;

/**
 * @author Kretov D.V
 * @version Создать двухмерный массив целых чисел размерами 5х5.
 * Значениями ячеек должно быть произведение индекса строки и индекса столбца.
 * Инвертируйте значения в ячейках, расположенных по диагонали.
 */

public class Main {

    public static void main(String[] args) {

        ArrayFiveOnFive ar = new ArrayFiveOnFive(new int[5][5]);    // создали объект по контруктору
        Printer pr = new Printer();                                 // налупили объектов необходимых классов
        Aggregate ag = new Aggregate();
        BulletinBoard bb = new BulletinBoard();

        bb.makeTheFirstAnnouncement();  // дёрнули инфу с доски объявлений 1
        pr.printInfo(ar.getArray());    // отправили на печать массив

        ar.setArray(ag.fillArray(ar.getArray()));   // отправили массив на заполнение

        bb.makeTheSecondAnnouncement(); // дёрнули инфу с доски объявлений 2
        pr.printInfo(ar.getArray());    // отправили на печать заполненый массив

        ar.setArray(ag.invertValues(ar.getArray()));       // отправили массив на инверсию

        bb.makeTheThirdAnnouncement();  // дёрнули инфу с доски объявлений 3
        pr.printInfo(ar.getArray());    // отправили на печать уже сынвертированный массив
    }
}
