package ru.zagrebin.logics;

import ru.zagrebin.validation.ContactValidator;

public class Menu {

    static boolean flag = true;
    private static Scenarios scenarios = new Scenarios();
    private static ContactValidator validator = new ContactValidator();

    //Стартовое меню
    public static void start() {
        System.out.println("Добро пожаловать в приложение \"Список контактов\"!\n" +
                "1. Добавить контакт\n" +
                "2. Просмотреть список контактов\n" +
                "3. Найти контакт по имени\n" +
                "4. Удалить контакт\n" +
                "5. Выход");
    }

    //Выполнение задач
    public static void completingTasks() {

        while(flag) {

            //Валидация номера из меню
            int i = validator.numberValidation();

            //Сценарии программы
            switch (i) {
                case 1:
                    scenarios.addContact();
                    break;

                case 2:
                    scenarios.allContact();
                    break;

                case 3:
                    scenarios.searchContact();
                    break;

                case 4:
                    scenarios.deleteContact();
                    break;

                case 5:
                    scenarios.stopApp();
                    break;
            }
        }
    }
}
