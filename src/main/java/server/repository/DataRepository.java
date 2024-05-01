package server.repository;

import server.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Contact> fetchData() {
        List<Contact> list = new ArrayList<>();
        list.add(new Contact("Alex", "Alex@gmail.com"));
        return list;
    }
}
