package ru.zagrebin.logics;

import ru.zagrebin.dao.impl.ContactDAOImpl;
import ru.zagrebin.models.Contact;
import ru.zagrebin.validation.ContactValidator;

import java.util.List;
import java.util.Scanner;

public class Scenarios {

    private static ContactValidator validator = new ContactValidator();
    private static ContactDAOImpl contactDAOImpl = new ContactDAOImpl();

    //�������� ���������� ��������
    void addContact() {
        Contact contact = new Contact();

        //��������� ���� ���
        contact.setFirstName(validator.nameValidation());

        //��������� ���� surname
        contact.setLastName(validator.surnameValidation());

        //��������� ������ ��������
        contact.setPhone(validator.phoneValidation());

        //��������� ����������� �����
        contact.setEmail(validator.emailValidation());

        contactDAOImpl.save(contact);
        System.out.println("������� ������� ��������.");
    }

    //�������� ��������� ���� ���������
    void allContact() {
        System.out.println("������ ���������: ");
        List<Contact> contacts = contactDAOImpl.index();
        if(contacts.isEmpty())
            System.out.println("�����");
        for(Contact contact1 : contacts) {
            System.out.println(contact1);
        }
    }

    //�������� ������ ��������
    void searchContact() {
        Scanner searchScanner = new Scanner(System.in);
        System.out.println("������� ��� ��� ������: ");
            List<Contact> contacts = contactDAOImpl.searchByName(searchScanner.nextLine());
            for(Contact contact : contacts) {
                System.out.println(contact);
            }
    }

    //�������� �������� ��������
    void deleteContact() {
        Scanner deleteScanner = new Scanner(System.in);
        System.out.println("������� ����� �������� ��� ��������:");
        try {
            int id = deleteScanner.nextInt();
            Contact contact5 = contactDAOImpl.delete(id);
            System.out.println("������� " + contact5.getFirstName() + " " + contact5.getLastName() + " ������� ������.");
        }catch (Exception e) {
            System.out.println("�������� � ����� ������� �� �������");
        }
    }

    //�������� ���������� ���������
    void stopApp() {
        System.out.println("�� ��������!");
        Menu.flag = false;
    }
}
