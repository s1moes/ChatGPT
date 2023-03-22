package pt.franciscosimoes.chatgpt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pt.franciscosimoes.chatgpt.model.request.OpenAiRequest;

public class Main {

	public static void main(String[] args) {

		OpenAiRequest req = new OpenAiRequest();
		req.setModel("text-davinci-003");
		req.setPrompt("you are and AI\nAI:");
		req.setTemperature(0.5f);
		req.setMaxTokens(60);
		req.setTopP(1.0f);
		req.setFrequencyPenalty(0.5f);
		req.setPresencePenalty(0.5f);
		req.setStop(new String[] {"AI:"});
		req.getModel();
		
		ObjectMapper mapper = new ObjectMapper();
		
		String jsonPayLoad = null;
		
		try {
			jsonPayLoad = mapper.writeValueAsString(req);
		} catch (JsonProcessingException e) {
			System.err.println(e.getMessage());
			return;
		}
		System.out.println(jsonPayLoad);
	}
}