/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentprogresstracking.classes;

import javax.mail.*;
import javax.activation.*;
import java.util.Properties;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

/**
 *
 * @author overlord_96
 */


public class Email {
    
    public void mail1(String a,String date){
                        
    String username = "mitcoecomputerdepartment@gmail.com";
		final String password = "mitcoecomputer";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session;
                session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("computerdepartment@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(a));
			message.setSubject("Mentor meet");
			message.setText("Dear student,\n\tYour mentor's meet is scheduled on "+date+".\nEnsure your attendance."
                                + " \n\n\n\nThis is auto-generated e-mail.Please do not reply");
			Transport.send(message);

			System.out.println("Done");
                        JOptionPane.showMessageDialog(null, "Email sent successfully!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

        public static void main(String[] args){
            //new Email().mail1("pritamrikame19@gmail.com,amey0696@gmail.com,mckakade@gmail.com,yashtatkondawar@gmail.com","3 Oct, 2016");
        }

}

    
    
    
    

