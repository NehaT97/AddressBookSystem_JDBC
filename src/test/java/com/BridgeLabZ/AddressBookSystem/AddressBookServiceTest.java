package com.BridgeLabZ.AddressBookSystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class AddressBookServiceTest {
    @Before
    public void init() {
        System.out.println("Welcome to AddressBook Management Service");
    }

    @Test
    public void givenAddressBookDB_WhenRetrivedShouldMatchPersonCount() {
        AddressBookService addressBookService = new AddressBookService();
        List<Person> addressBookData = addressBookService.readAddressBookData(AddressBookService.IOService.DB_IO);
        Assert.assertEquals(3, addressBookData.size());
    }

    @Test
    public void givenContactNumber_WhenUpdated_ShouldSyncWithDb() {
        AddressBookService addressBookService = new AddressBookService();
        List<Person> addressBookData = addressBookService.readAddressBookData(AddressBookService.IOService.DB_IO);
        addressBookService.updateContactNumber("Neha", "2233445566");
        boolean result = addressBookService.checkAddressBookInSyncWithDB("Neha");
        Assert.assertTrue(result);
    }

    @Test
    public void givenDateRangeWhenRetrieved_ShouldMatchEntryCount() {
        AddressBookService addressBookService = new AddressBookService();
        LocalDate startDate = LocalDate.of(2017, 01, 01);
        LocalDate endDate = LocalDate.now();
        List<Person> addressBookDataList =
                addressBookService.readAddressBookForDateRange(AddressBookService
                        .IOService.DB_IO, startDate, endDate);
        Assert.assertEquals(3, addressBookDataList.size());
    }

    @Test
    public void givenState_WhenRetrieved_ShouldMatchEntryCount() {
        AddressBookService addressBookService = new AddressBookService();
        List<Person> addressBookDataList =
                addressBookService.countPeopleFromGivenCity(AddressBookService
                        .IOService.DB_IO, "Dhule");
        Assert.assertEquals(1, addressBookDataList.size());
    }
}


