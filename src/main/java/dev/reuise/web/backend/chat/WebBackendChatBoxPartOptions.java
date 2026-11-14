package dev.reuise.web.backend.chat;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
import dev.reuise.web.backend.floating.WebBackendFloatingPanel;
import dev.reuise.web.backend.floating.WebBackendFloatingPanelOptions;
import dev.reuise.web.backend.input.WebBackendBasicInputField;
import dev.reuise.web.backend.input.WebBackendBasicInputFieldOptions;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.text.WebBackendParagraph;
import dev.reuise.web.backend.text.WebBackendParagraphOptions;
import dev.reuise.web.core.chat.WebChatBoxPartOptions;
public interface WebBackendChatBoxPartOptions extends WebChatBoxPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendChatBoxPartOptions setFloatingPanelCreator(ComponentCreator<? extends WebBackendFloatingPanel, ? extends WebBackendFloatingPanelOptions> floatingPanelCreator);

    WebBackendChatBoxPartOptions setChatContentCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> chatContentCreator);

    WebBackendChatBoxPartOptions setMessagesCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> messagesCreator);

    WebBackendChatBoxPartOptions setLoadingIndicatorCreator(ComponentCreator<? extends WebBackendParagraph, ? extends WebBackendParagraphOptions> loadingIndicatorCreator);

    WebBackendChatBoxPartOptions setErrorDisplayCreator(ComponentCreator<? extends WebBackendParagraph, ? extends WebBackendParagraphOptions> errorDisplayCreator);

    WebBackendChatBoxPartOptions setRetryButtonCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> retryButtonCreator);

    WebBackendChatBoxPartOptions setHandoffDisplayCreator(ComponentCreator<? extends WebBackendParagraph, ? extends WebBackendParagraphOptions> handoffDisplayCreator);

    WebBackendChatBoxPartOptions setRequestHumanButtonCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> requestHumanButtonCreator);

    WebBackendChatBoxPartOptions setComposerAreaCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> composerAreaCreator);

    WebBackendChatBoxPartOptions setComposerCreator(ComponentCreator<? extends WebBackendBasicInputField, ? extends WebBackendBasicInputFieldOptions> composerCreator);

    WebBackendChatBoxPartOptions setSendButtonCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> sendButtonCreator);

    WebBackendChatBoxPartOptions setStopButtonCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> stopButtonCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendChatBox getComponent();
}
