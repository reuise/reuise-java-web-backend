package dev.reuise.web.backend.chat;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.floating.WebBackendFloatingPanel;
import dev.reuise.web.backend.input.WebBackendBasicInputField;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.backend.text.WebBackendParagraph;
import dev.reuise.web.core.chat.WebChatBoxPart;
public interface WebBackendChatBoxPart extends WebChatBoxPart , WebBackendComponentPart , WebBackendChatBoxFeatures , WebBackendContainerPart {
    WebBackendFloatingPanel getFloatingPanel();

    WebBackendContainer getChatContent();

    WebBackendContainer getMessages();

    WebBackendParagraph getLoadingIndicator();

    WebBackendParagraph getErrorDisplay();

    WebBackendButton getRetryButton();

    WebBackendParagraph getHandoffDisplay();

    WebBackendButton getRequestHumanButton();

    WebBackendContainer getComposerArea();

    WebBackendBasicInputField getComposer();

    WebBackendButton getSendButton();

    WebBackendButton getStopButton();

    WebBackendContainerPart getContainerPart();
}
