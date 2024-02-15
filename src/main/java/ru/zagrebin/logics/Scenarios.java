package ru.zagrebin.logics;

import ru.zagrebin.dao.impl.ContactDAOImpl;
import ru.zagrebin.models.Contact;
import ru.zagrebin.validation.ContactValidator;

import java.util.List;
import java.util.Scanner;

public class Scenarios {

    private static ContactValidator validator = new ContactValidator();
    private static ContactDAOImpl contactDAOImpl = new ContactDAOImpl();

    //Сценарий добавления контакта
    void addContact() {
        Contact contact = new Contact();

        //Валидация поля Имя
        contact.setFirstName(validator.nameValidation());

        //Валидация поля surname
        contact.setLastName(validator.surnameValidation());

        //Валидация номера телефона
        contact.setPhone(validator.phoneValidation());

        //Валидация электронной почты
        contact.setEmail(validator.emailValidation());

        contactDAOImpl.save(contact);
        System.out.println("Контакт успешно добавлен.");
    }

    //Сценарий просмотра всех контактов
    void allContact() {
        System.out.println("Список контактов: ");
        List<Contact> contacts = contactDAOImpl.index();
        if(contacts.isEmpty())
            System.out.println("Пусто");
        for(Contact contact1 : contacts) {
            System.out.println(contact1);
        }
    }

    //Сценарий поиска контакта
    void searchContact() {
        Scanner searchScanner = new Scanner(System.in);
        System.out.println("Введите имя для поиска: ");
            List<Contact> contacts = contactDAOImpl.searchByName(searchScanner.nextLine());
            for(Contact contact : contacts) {
                System.out.println(contact);
            }
    }

    //Сценарий удаления контакта
    void deleteContact() {
        Scanner deleteScanner = new Scanner(System.in);
        System.out.println("Введите номер контакта для удаления:");
        try {
            int id = deleteScanner.nextInt();
            Contact contact5 = contactDAOImpl.delete(id);
            System.out.println("Контакт " + contact5.getFirstName() + " " + contact5.getLastName() + " успешно удален.");
        }catch (Exception e) {
            System.out.println("Контакта с таким номером не найдено");
        }
    }

    //Сценарий завершения программы
    void stopApp() {
        System.out.println("До свидания!");
        Menu.flag = false;
    }
}
