package org.javaacadmey.wonderfield.util;

import java.util.Random;

public class TestData {

    private static final int COUNT_RANDOM_QUESTIONS = 10;
    private static final String[][] testData = new String[COUNT_RANDOM_QUESTIONS][2];


    static {
        testData[0][0] = "Какой металл был открыт Гансом Кристианом Эрстедом в 1825 году?";
        testData[0][1] = "алюминий";
        testData[1][0] = "Какая столица Португалии?";
        testData[1][1] = "Лиссабон";
        testData[2][0] = "В каком фильме Хью Джекман сыграл фокусника, соперника персонажа, "
                + "которого сыграл Кристиан Бэйл?";
        testData[2][1] = "престиж";
        testData[3][0] = "В каком виде спорта отличился Нил Адамс?";
        testData[3][1] = "Дзюдо";
        testData[4][0] = "Какая страна выиграла чемпионат мира 1982 года в Испании, "
                + "победив Западную Германию со счетом 3: 1?";
        testData[4][1] = "Италия";
        testData[5][0] = "Какую спортивную игру изобрел Джеймс Нейсмит в 1891 году?";
        testData[5][1] = "баскетбол";
        testData[6][0] = "Канадский Коннор МакДэвид - восходящая звезда в каком виде спорта?";
        testData[6][1] = "хоккей";
        testData[7][0] = "Фамилия художника, который создал «Суповые банки Кэмпбелла» в 1962 году?";
        testData[7][1] = "Уорхол";
        testData[8][0] = "Название музея, где выставлена Мона Лиза Леонардо да Винчи?";
        testData[8][1] = "лувр";
        testData[9][0] = "В каком городе находится место для вымышленной высадки королей?";
        testData[9][1] = "Дубровник";
    }

    public static String[][] fillRandomQuestions(int countQuestions) {
        int[] randomIndexArr = getRandomIndexesQuestions(countQuestions);
        String[][] randomArrQuestions = new String[randomIndexArr.length][2];
        for (int i = 0; i < randomArrQuestions.length; i++) {
            randomArrQuestions[i][0] = testData[randomIndexArr[i]][0];
            randomArrQuestions[i][1] = testData[randomIndexArr[i]][1].trim().toLowerCase();
        }
        return randomArrQuestions;
    }

    private static int[] getRandomIndexesQuestions(int countQuestions) {
        Random random = new Random();
        int[] arr = new int[countQuestions];
        int size = 0;
        while (size < countQuestions) {
            int randomIndex = random.nextInt(COUNT_RANDOM_QUESTIONS);
            if (!checkDuplicates(arr, size, randomIndex)) {
                arr[size++] = randomIndex;
            }
        }
        return arr;
    }

    private static boolean checkDuplicates(int[] arr, int countElements, int checkNumber) {
        for (int i = 0; i < countElements; i++) {
            if (arr[i] == checkNumber) {
                return true;
            }
        }
        return false;
    }
}
