package pt.franciscosimoes.chatgpt;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pt.franciscosimoes.chatgpt.model.Chat;
import pt.franciscosimoes.chatgpt.model.request.*;
import pt.franciscosimoes.chatgpt.model.request.factory.OpenAIRequestFactory;
import pt.franciscosimoes.chatgpt.util.ConfigParser;
import pt.franciscosimoes.chatgpt.util.FileUtils;

public class Main {

	public static void main(String[] args) throws IOException {
		Map<String, String> config = ConfigParser.parse("application.properties");
		String greeting = config.get("greeting");

		System.out.println(greeting);

		OpenAIRequestFactory openAiRequestFactory = new OpenAIRequestFactory();
		Chat chat = new Chat(greeting);

		ObjectMapper mapper = new ObjectMapper();
		String jsonPayload = null;
		try {
			jsonPayload = mapper.writeValueAsString(openAiRequestFactory);
		} catch (JsonProcessingException e) {
			System.err.println(e.getMessage());
			return;
		}

		System.out.println(jsonPayload);
	}

}