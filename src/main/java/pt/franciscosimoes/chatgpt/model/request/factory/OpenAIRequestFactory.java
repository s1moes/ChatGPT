package pt.franciscosimoes.chatgpt.model.request.factory;

import pt.franciscosimoes.chatgpt.model.Chat;
import pt.franciscosimoes.chatgpt.model.request.OpenAiRequest;

public class OpenAIRequestFactory {

	public OpenAiRequest createChatOpenAIRequest(Chat chat) {
		final OpenAiRequest req = new OpenAiRequest();
		
		req.setModel("text-davinci-003");
		req.setPrompt("TO BE DONE\nAI:");
		req.setTemperature(0.5f);
		req.setMaxTokens(60);
		req.setTopP(1.0f);
		req.setFrequencyPenalty(0.5f);
		req.setPresencePenalty(0.5f);
		req.setStop(new String[] {"AI:"});
		
		return req;
	}
	
	private String chatPromptToString(Chat chat) {
		String result = chat.getPrompt();
		
		//Chat need to be Subject:MessageContent\n...
		for (int i = 0; i < chat.getMessages().size(); i++) {
			result = result + "\n" + chat.getMessages().get(i).toString();
		}
			
		return result;
	}
}
