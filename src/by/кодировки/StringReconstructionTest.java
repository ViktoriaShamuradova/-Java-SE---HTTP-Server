package by.кодировки;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
//имеем на входе массив байтов - исходный файл.
//Переводим массив байт в массив символов, делается с помощью кодировки.
//Выбранная кодировка - windows 1251. Эта кодировка неверна. то есть нужно проделать операцию заново
//и для этого нужно иметь исходный массив байтов. Для чего имеющийся массив символов должен быть переведен в массив байтов
//с использованием той же самой кодировки, которая была использована для получения этого массива символов из массива байтов.
public class StringReconstructionTest {
    private static final String FILENAME = "C:/Users/Бегенч/EPAM/HTTP-ServerUdemyОсновыJavaSE/src/by/кодировки/alphabet.utf8";
    private static final String ENCODING_WIN1251 = "windows-1251";
    private static final String ENCODING_UTF8 = "UTF-8";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(FILENAME), ENCODING_WIN1251));     // 1.читается файл в неверной кодировке
        String incorrect = br.readLine();
        br.close();
        System.out.println("Incorrect string: " + incorrect);
        //здесь получаем исходный массив. это метод переводит строку чар в строку байтов с использованием указанной кодировки
        String restored = new String(incorrect.getBytes(ENCODING_WIN1251), ENCODING_UTF8); // 2.из неверно декодированной кодировки получаем корректная
        System.out.println("Restored string: " + restored);
        br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(FILENAME), ENCODING_UTF8));     // 3.строка читается еще раз уже в верной кодировке
        String correct = br.readLine();
        br.close();
        System.out.println("Correct string: " + correct);
    }
}
