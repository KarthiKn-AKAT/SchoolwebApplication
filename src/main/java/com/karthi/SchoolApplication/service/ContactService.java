package com.karthi.SchoolApplication.service;


import com.karthi.SchoolApplication.Model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private static Logger logger = LoggerFactory.getLogger(ContactService.class);

    public boolean saveMessageDetails(Contact contact){
        boolean is_saved = true;
        logger.info(contact.toString());
        return is_saved;
    }

}
