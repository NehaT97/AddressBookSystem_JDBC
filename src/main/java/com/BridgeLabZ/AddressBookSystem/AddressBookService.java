package com.BridgeLabZ.AddressBookSystem;

import java.util.List;

public class AddressBookService {

    public enum IOService {DB_IO, REST_IO}

    private List<Person> personList;
    private AddressBookDBService addressBookDBService;

    public AddressBookService() {
        addressBookDBService = AddressBookDBService.getInstance();
    }

    public AddressBookService(List<Person> personList) {
        this();
        this.personList = personList;
    }

    public List<Person> readAddressBookData(IOService ioService) {
        if (ioService.equals(IOService.DB_IO))
            this.personList = addressBookDBService.readData();
        return personList;
    }
}
