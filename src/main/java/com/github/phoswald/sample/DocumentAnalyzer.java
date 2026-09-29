package com.github.phoswald.sample;

import dev.langchain4j.data.message.SystemMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatModel;

public class DocumentAnalyzer {

    private final ChatModel chatModel;

    public DocumentAnalyzer(ModelProvider modelProvider) {
        this.chatModel = modelProvider.buildChatModel();
    }

    public String sayHello(String name) {
        SystemMessage systemMessage = SystemMessage.from("""
                You greet people. The user message contains a name.
                Reply with exactly "Hello, <name>!", where <name> is the given name verbatim.
                Take care of precise spelling and punctuation: one comma after "Hello",
                one space before the name, one exclamation mark at the end.
                Do not add quotes, whitespace, line breaks or any other text.
                Do not alter or shorten the name.
                """);
        UserMessage userMessage = UserMessage.from(name);
        return chatModel.chat(systemMessage, userMessage).aiMessage().text();
    }
}
