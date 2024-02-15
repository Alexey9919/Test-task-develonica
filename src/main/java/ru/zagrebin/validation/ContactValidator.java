package ru.zagrebin.validation;

import java.util.Scanner;

public class ContactValidator {

    //��������� �����
    public String nameValidation() {
        Scanner nameScanner = new Scanner(System.in);
        String name;
        do {
            System.out.println("������� ��� ��������: ");
            name = nameScanner.nextLine();
            if(name.isEmpty() || name.length() > 50)
                System.out.println("��� ������ ��������� �� 1 �� 50 ��������");
        }
        while (name.isEmpty() || name.length() > 50);
        return name;
    }

    //��������� �������
    public String surnameValidation() {
        Scanner surnameScanner = new Scanner(System.in);
        String surname;
        do {
            System.out.println("������� ������� ��������: ");
            surname = surnameScanner.nextLine();
            if(surname.isEmpty() || surname.length() > 50)
                System.out.println("������� ������ ��������� �� 1 �� 50 ��������");
        }
        while (surname.isEmpty() || surname.length() > 50);
        return surname;
    }

    //��������� ������ ��������
    public String phoneValidation() {
        Scanner phoneScanner = new Scanner(System.in);
        String phone;
        do {
            System.out.println("������� ����� ��������: ");
            phone = phoneScanner.nextLine();
            if(!phone.matches("(-|\\+)?\\d{11}"))
                System.out.println("�������� ����� ��������. ������: +79042886524 ��� 89042886524");
        }
        while (!phone.matches("(-|\\+)?\\d{11}"));
        return phone;
    }

    //��������� ������ ����������� �����
    public String emailValidation() {
        Scanner emailScanner = new Scanner(System.in);
        String email;
        do {
            System.out.println("������� ����� ����������� �����: ");
            email = emailScanner.nextLine();
            if(!email.matches(".+\\@(gmail.com|yandex.ru|mail.ru|bk.ru|inbox.ru)"))
                System.out.println("������ �������� ����� ����������� �����. ������: example@yandex.ru");
        }
        while (!email.matches(".+\\@(gmail.com|yandex.ru|mail.ru|bk.ru|inbox.ru)"));
        return email;
    }

    //��������� ������ ����
    public int numberValidation() {
        Scanner scanner = new Scanner(System.in);
        String number;
        do {
            System.out.println("�������� �������� (������� �����): ");
            number = scanner.nextLine();
            if(!number.matches("[1-5]{1}"))
                System.out.println("����� ������ ���� �� 1 �� 5");
        }
        while (!number.matches("[1-5]{1}"));
        return Integer.parseInt(number);
    }
}
