package ru.zagrebin.validation;

import java.util.Scanner;

public class ContactValidator {

    //Валидация имени
    public String nameValidation() {
        Scanner nameScanner = new Scanner(System.in);
        String name;
        do {
            System.out.println("Введите имя контакта: ");
            name = nameScanner.nextLine();
            if(name.isEmpty() || name.length() > 50)
                System.out.println("Имя должно содержать от 1 до 50 символов");
        }
        while (name.isEmpty() || name.length() > 50);
        return name;
    }

    //Валидация фамилии
    public String surnameValidation() {
        Scanner surnameScanner = new Scanner(System.in);
        String surname;
        do {
            System.out.println("Введите фамилию контакта: ");
            surname = surnameScanner.nextLine();
            if(surname.isEmpty() || surname.length() > 50)
                System.out.println("Фамилия должна содержать от 1 до 50 символов");
        }
        while (surname.isEmpty() || surname.length() > 50);
        return surname;
    }

    //Валидация номера телефона
    public String phoneValidation() {
        Scanner phoneScanner = new Scanner(System.in);
        String phone;
        do {
            System.out.println("Введите номер телефона: ");
            phone = phoneScanner.nextLine();
            if(!phone.matches("(-|\\+)?\\d{11}"))
                System.out.println("Неверный номер телефона. Пример: +79042886524 или 89042886524");
        }
        while (!phone.matches("(-|\\+)?\\d{11}"));
        return phone;
    }

    //Валидация адреса электронной почты
    public String emailValidation() {
        Scanner emailScanner = new Scanner(System.in);
        String email;
        do {
            System.out.println("Введите адрес электронной почты: ");
            email = emailScanner.nextLine();
            if(!email.matches(".+\\@(gmail.com|yandex.ru|mail.ru|bk.ru|inbox.ru)"))
                System.out.println("Введен неверный адрес электронной почты. Пример: example@yandex.ru");
        }
        while (!email.matches(".+\\@(gmail.com|yandex.ru|mail.ru|bk.ru|inbox.ru)"));
        return email;
    }

    //Валидация номера меню
    public int numberValidation() {
        Scanner scanner = new Scanner(System.in);
        String number;
        do {
            System.out.println("Выберите действие (введите номер): ");
            number = scanner.nextLine();
            if(!number.matches("[1-5]{1}"))
                System.out.println("Число должно быть от 1 до 5");
        }
        while (!number.matches("[1-5]{1}"));
        return Integer.parseInt(number);
    }
}
