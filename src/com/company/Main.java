package com.company;

public class Main {

    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Бакыт";
        names[1] = "Аман";
        names[2] = "Сакен";

        for (int i = 0; i < 1; i++) {
            switch (names[i]) {
                case "Бакыт":
                    System.out.println("Доброе утро " + names[0]);

                case "Аман":
                    System.out.println("Добрый день " + names[1]);

                case "Сакен":
                    System.out.println("Добрый вечер " + names[2]);
            }

            System.out.println("Привет " + names[0] + names[1] + names[2]);

        }
    }
}
