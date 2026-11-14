package dev.reuise.web.backend.floating;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.core.floating.WebFloatingPanelPart;
public interface WebBackendFloatingPanelPart extends WebBackendComponentPart , WebBackendContainerPart , WebBackendFloatingPanelFeatures , WebFloatingPanelPart {
    WebBackendFloatingActionButton getTrigger();

    WebBackendContainer getPanel();

    WebBackendContainer getHeader();

    WebBackendInlineText getTitleContainer();

    WebBackendButton getMinimiseButton();

    WebBackendButton getCloseButton();

    WebBackendContainer getContent();

    WebBackendContainerPart getContainerPart();
}
