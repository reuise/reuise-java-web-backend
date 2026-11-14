package dev.reuise.web.backend.chat;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.core.chat.WebChatBox;
public interface WebBackendChatBox extends WebChatBox , WebBackendChatBoxPart , WebBackendComponent , WebBackendContainer {
    WebBackendChatBox getComponent();

    WebBackendChatBox setAnimation(ComponentAnimation animation);

    WebBackendChatBox startAnimation();

    WebBackendChatBox cancelAnimation();
}
