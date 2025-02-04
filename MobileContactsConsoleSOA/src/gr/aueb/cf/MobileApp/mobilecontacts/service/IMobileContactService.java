package gr.aueb.cf.MobileApp.mobilecontacts.service;

import gr.aueb.cf.MobileApp.mobilecontacts.MobileContact;
import gr.aueb.cf.MobileApp.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.MobileApp.mobilecontacts.dto.MobileContactUpdateDTO;
import gr.aueb.cf.MobileApp.mobilecontacts.exceptions.ContactNotFoundException;
import gr.aueb.cf.MobileApp.mobilecontacts.exceptions.PhoneNumberAlreadyExistsException;

import java.util.List;

public interface IMobileContactService {

    MobileContact insertMobileContact(MobileContactInsertDTO dto) throws PhoneNumberAlreadyExistsException;
    MobileContact updateMobileContact(MobileContactUpdateDTO dto)
        throws PhoneNumberAlreadyExistsException, ContactNotFoundException;
    void deleteContactById(Long id) throws ContactNotFoundException;
    MobileContact getContactById(Long id) throws ContactNotFoundException;
    List<MobileContact>getAllContacts();





}


