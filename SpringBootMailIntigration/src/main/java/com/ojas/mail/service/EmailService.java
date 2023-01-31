package com.ojas.mail.service;

import com.ojas.mail.model.EmailDetails;

public interface EmailService {

	String sendSimpleMail(EmailDetails details);

	String sendMailWithAttachment(EmailDetails details);

}
