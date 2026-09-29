package com.github.phoswald.sample;

import dev.langchain4j.model.anthropic.AnthropicChatModel;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;

public enum ModelProvider {

    ANTHROPIC {
        @Override
        public ChatModel buildChatModel() {
            return AnthropicChatModel.builder()
                    .apiKey(System.getenv("ANTHROPIC_API_KEY"))
                    .modelName("claude-sonnet-5-5")
                    .build();
        }
    },

    OPENAI {
        @Override
        public ChatModel buildChatModel() {
            return OpenAiChatModel.builder()
                    .apiKey(System.getenv("OPENAI_API_KEY"))
                    .modelName("gpt-5.6-luna")
                    .build();
        }
    };

    public abstract ChatModel buildChatModel();
}
