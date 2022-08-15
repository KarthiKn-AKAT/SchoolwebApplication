package com.karthi.SchoolApplication.controller;


import com.karthi.SchoolApplication.Model.Contact;
import com.karthi.SchoolApplication.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    private static Logger logger = LoggerFactory.getLogger(ContactController.class);

    @RequestMapping("/contact")
    public String displayContact(){
        return "contact.html";
    }

//    @PostMapping("/saveMsg")
//    public ModelAndView saveMessage(@RequestParam String name,
//                                    @RequestParam String mobileNum,
//                                    @RequestParam String email,
//                                    @RequestParam String subject,
//                                    @RequestParam String message){
//        logger.info("name : " + name);
//        logger.info("mobile number : " + mobileNum);
//        logger.info("email : " + email);
//        logger.info("subject : "+subject);
//        logger.info("message : " + message);
//
//        return new ModelAndView("redirect:/contact");

    //}

    @PostMapping("/saveMsg")
    public ModelAndView saveMessage(Contact contact) {
       contactService.saveMessageDetails(contact);
       return new ModelAndView("redirect:/contact");
    }

}

