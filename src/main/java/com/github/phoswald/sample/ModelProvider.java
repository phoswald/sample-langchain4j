package com.github.phoswald.sample;

import dev.langchain4j.model.anthropic.AnthropicChatModel;
import dev.langchain4j.model.chat.ChatModel;

public enum ModelProvider {

    ANTHROPIC {
        @Override
        public ChatModel buildChatModel() {
            return AnthropicChatModel.builder()
                    .apiKey(System.getenv("ANTHROPIC_API_KEY"))
                    .modelName("claude-sonnet-5-5")
                    .build();
        }
    };

    public abstract ChatModel buildChatModel();
}
