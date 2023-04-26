package pt.franciscosimoes.chatgpt.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pt.franciscosimoes.chatgpt.model.request.OpenAiRequest;

public class OpenAiRequestToJasonString {

	private final ObjectMapper mapper;

	public OpenAiRequestToJasonString() {
		mapper = new ObjectMapper();
	}

	public String map(OpenAiRequest request) {
		String jsonPayload = null;
		try {
			jsonPayload = mapper.writeValueAsString(request);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
		return jsonPayload;
	}
}
