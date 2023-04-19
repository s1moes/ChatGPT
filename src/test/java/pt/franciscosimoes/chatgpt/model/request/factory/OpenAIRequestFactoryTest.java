package pt.franciscosimoes.chatgpt.model.request.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pt.franciscosimoes.chatgpt.model.Chat;
import pt.franciscosimoes.chatgpt.model.Message;
import pt.franciscosimoes.chatgpt.model.request.OpenAiRequest;

class OpenAIRequestFactoryTest {

	private OpenAIRequestFactory subject = new OpenAIRequestFactory();
	
	@Test
	void testCreateChatOpenAIRequest() {
		
		final Chat chat = new Chat("test prompt");
		chat.addMessage(new Message("AI", "HelloHuman"));
		
		final OpenAiRequest result = subject.createChatOpenAIRequest(chat);
		
		assertEquals("test-davinci-003", result.getModel());
		assertEquals(0.5f, result.getTemperature());
		
		
	}

}
