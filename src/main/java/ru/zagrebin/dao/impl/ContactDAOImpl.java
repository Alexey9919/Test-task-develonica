package ru.zagrebin.dao.impl;

import ru.zagrebin.dao.ContactDAO;
import ru.zagrebin.models.Contact;
import java.util.ArrayList;
import java.util.List;

public class ContactDAOImpl implements ContactDAO {

    private static int CONTACT_COUNT;

    //Список контактов
    private List<Contact> contacts;

    {
        contacts = new ArrayList<>();
    }

    //Вернуть все контакты
    public List<Contact> index() {
        return contacts;
    }

    //Поиск контактов по имени
    public Contact searchByName(String name) {
        return contacts.stream().filter(contact -> contact.getFirstName().equals(name)).findAny().orElse(null);
    }

    //Сохранение контакта
    public void save(Contact contact) {
        contact.setId(++CONTACT_COUNT);
        contacts.add(contact);
    }

    //Удаление контакта
    public Contact delete(int id) {
        Contact user = contacts.stream().filter(contact -> contact.getId() == id).findAny().orElse(null);
        contacts.removeIf(p -> p.getId() == id);
        return user;
    }
}
