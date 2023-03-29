package pt.franciscosimoes.chatgpt.model;

import java.util.ArrayList;
import java.util.List;

public class Chat {
	private String prompt;
	private List<Message> messages;
	
	
	public Chat() {
		this.messages = new ArrayList<>();
	}
	public String getPrompt() {
		return prompt;
	}
	
	public List<Message> getMessage() {
		return messages;
	}
	
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	
	public void addMessage(Message message) {
		if (this.messages == null) {
			this.messages = new ArrayList<>();
	        }
		this.messages.add(message);
	}
}