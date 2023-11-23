package com.ron.service;

import java.util.Arrays;
import java.util.Date;

import javax.mail.internet.MimeMessage;

import org.apache.naming.factory.SendMailFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service("service")
public class PurchaseOrderImpl implements IPurchaseOrder {

	@Autowired
	private JavaMailSender sender;
	
	@Value("${spring.mail.username}")
	private String fromEmail;
	
	@Override
	public String purchase(String[] items, double[] prices, String[] toEmails) throws Exception {

		double bilAmt = 0.0;
		for (double price : prices) {
			bilAmt =+ price;
		}
		
		String msg = Arrays.toString(items) +" with price :: "+ Arrays.toString(prices) 
					+" are purchased with Bill Amount :"+bilAmt;
		
		String status = sendMail(msg , toEmails);
		
		return msg +"------>"+status;
	}

	private String sendMail(String msg, String[] toEmails)throws Exception {
		
		System.out.println("PurchaseOrderImpl.sendMail()");
		
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,true);
		
		helper.setFrom(fromEmail);
		helper.setTo(toEmails);
		helper.setSubject("Shopping Bill");
		helper.setSentDate(new Date());
		helper.setText(msg);
		sender.send(message);
					
		return "mail sent";
	}

}
