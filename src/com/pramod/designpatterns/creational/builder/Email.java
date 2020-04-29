package com.pramod.designpatterns.creational.builder;

public class Email {
	
	public static class EmailBuilder {
		private String recipient;
		private String messageBody;
		private String subject;
		
		public EmailBuilder addRecipient(String recipient) {
			this.recipient = recipient;
			return this;
		}
		
		public EmailBuilder addMessageBody(String messageBody) {
			this.messageBody = messageBody;
			return this;
		}
		
		public EmailBuilder addSubjectLine(String subject) {
			this.subject = subject;
			return this;
		}
		
		public Email build() {
			return new Email(this);
		}
	}
	
	private String recipient;
	private String messageBody;
	private String subject;
	
	public Email(EmailBuilder eb) {
		this.recipient = eb.recipient;
		this.messageBody = eb.messageBody;
		this.subject = eb.subject;
	}
	public String getRecipient() {
		return recipient;
	}
	public String getMessageBody() {
		return messageBody;
	}
	public String getSubject() {
		return subject;
	}
	@Override
	public String toString() {
		return "Email [recipient=" + recipient + ", messageBody=" + messageBody + ", subject=" + subject + "]";
	}
	
	
	
	

}
