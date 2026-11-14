package dev.reuise.web.backend.menu;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.core.menu.WebMenuButtonPart;
public interface WebBackendMenuButtonPart extends WebMenuButtonPart , WebBackendComponentPart , WebBackendContainerPart , WebBackendMenuButtonFeatures {
    WebBackendButton getTrigger();

    WebBackendContainer getPopup();

    WebBackendContainerPart getContainerPart();
}
