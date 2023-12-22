package org.javaacadmey.wonderfield;

import static org.javaacadmey.wonderfield.util.TestData.fillRandomQuestions;

import java.util.Scanner;


public class Game {

    private static final int NUMBER_PLAYERS = 3;
    private static final int TOTAL_ROUNDS = 4;
    private static final int COUNT_GROUP_ROUNDS = 3;

    private static final int INDEX_FINAL_ROUNDS = 3;

    private static final Scanner scanner = new Scanner(System.in);

    private String[][] questionsArr = new String[TOTAL_ROUNDS][2];

    public void init() throws InterruptedException {
        System.out.println("Запуск игры \"Поле Чудес\" "
                + "- подготовка к игре. "
                + "Вам нужно ввести вопросы и ответы для игры.");
        //getQuestionsFromConsole();
        questionsArr = fillRandomQuestions(TOTAL_ROUNDS);
        System.out.println("Иницализация закончена, игра начнется через 5 секунд");
        Thread.sleep(5000);
        for (int i = 0; i < 50; i++) {
            System.out.print(System.lineSeparator());
        }
    }

    private void getQuestionsFromConsole() {
        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            System.out.printf("%s #%s: ", "Введите вопрос и нажмите <ENTER>, вопрос", i + 1);
            questionsArr[i][0] = scanner.nextLine();
            System.out.printf("%s #%s: ", "Введите ответ и нажмите <ENTER>,", i + 1);
            questionsArr[i][1] = scanner.nextLine().trim().toLowerCase();
        }
    }
}
