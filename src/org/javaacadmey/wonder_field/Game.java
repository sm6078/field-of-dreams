package org.javaacadmey.wonder_field;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Game {

    private static final int NUMBER_PLAYERS = 3;
    private static final int TOTAL_ROUNDS = 4;
    private static final int COUNT_GROUP_ROUNDS = 3;

    private static final int INDEX_FINAL_ROUNDS = 3;

    private static final Scanner scanner = new Scanner(System.in);

    private final String[][] questionsArr = new String[TOTAL_ROUNDS][TOTAL_ROUNDS];

    public static Scanner sc = new Scanner(System.in);
    //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void init() throws InterruptedException {
        System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре. Вам нужно ввести вопросы и ответы для игры.");
        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            System.out.printf("%s#%s%n", "Введите вопрос", i + 1);

            /*
            if (sc.hasNextLine()) {
                questionsArr[0][i] = sc.nextLine();

             */

            questionsArr[i][0] = sc.nextLine();


            System.out.printf("%s#%s%n", "Введите ответ", i + 1);
            questionsArr[i][1] = sc.nextLine();
        }

        System.out.println("Иницализация закончена, игра начнется через 5 секунд");
        Thread.sleep(5000);
        System.lineSeparator().repeat(50);

        /*
        for (int i = 0; i < 50; i++) {
            System.out.print(System.lineSeparator());
        }
         */
        //System.getProperty("line.separator").repeat(50);
    }

}
