package task2325;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * @author Kretov D.V
 * @version 1. Разобраться в какой переменной класс String хранит значение строки.
 * С помощью рефлексии влезть в класс String и изменить значение в этом поле.
 * Таким образом будет нарушено правило "строки - неизменяемые объекты".
 * <p>
 * 2. С помощью рефлексии создать объект класса Math.
 */

public class StartPoint {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException {

        //first
        ClassWithString classWithString = new ClassWithString("Some string");

        Class<ClassWithString> clazz = ClassWithString.class;

        Field field = clazz.getDeclaredField("somePrivateString");

        field.setAccessible(true);
        System.out.println(field.get(classWithString));

        System.out.println("---------");

        field.set(classWithString, "New string");
        System.out.println(field.get(classWithString));
        field.setAccessible(false);

        //second
        Class<Math> clazzMath = Math.class;
        Constructor<Math> constr = clazzMath.getDeclaredConstructor();
        constr.setAccessible(true);
        Math m = constr.newInstance();
        int i = (int) m.pow(2, 4);
        System.out.println(i);
        System.out.println("---------");


        //restartFirst WORK ONLY ON 8 JAVA!!!!!!!!!
        String str = new String();
        Class<String> clazzString = String.class;

        char[] arrayChar = new char[]{'a', 'a', 'a', 'a'};

        Field[] fieldsStringClass = clazzString.getDeclaredFields();

        fieldsStringClass[0].setAccessible(true);
        System.out.println(Arrays.toString((char[]) fieldsStringClass[0].get(str)));
        fieldsStringClass[0].set(str, arrayChar);
        System.out.println(Arrays.toString((char[]) fieldsStringClass[0].get(str)));
    }
}