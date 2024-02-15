package ru.zagrebin.logics;

import ru.zagrebin.validation.ContactValidator;

public class Menu {

    static boolean flag = true;
    private static Scenarios scenarios = new Scenarios();
    private static ContactValidator validator = new ContactValidator();

    //��������� ����
    public static void start() {
        System.out.println("����� ���������� � ���������� \"������ ���������\"!\n" +
                "1. �������� �������\n" +
                "2. ����������� ������ ���������\n" +
                "3. ����� ������� �� �����\n" +
                "4. ������� �������\n" +
                "5. �����");
    }

    //���������� �����
    public static void completingTasks() {

        while(flag) {

            //��������� ������ �� ����
            int i = validator.numberValidation();

            //�������� ���������
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
