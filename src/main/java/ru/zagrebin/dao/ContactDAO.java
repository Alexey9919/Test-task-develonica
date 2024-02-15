package ru.zagrebin.dao;
import ru.zagrebin.models.Contact;
import java.util.List;

public interface ContactDAO {

    List<Contact> index();

    Contact searchByName(String name);

    void save(Contact contact);

    Contact delete(int id);
}
