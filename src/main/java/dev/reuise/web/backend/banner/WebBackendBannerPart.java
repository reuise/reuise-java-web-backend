package dev.reuise.web.backend.banner;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPart;
import dev.reuise.web.backend.text.WebBackendParagraph;
import dev.reuise.web.core.banner.WebBannerPart;
public interface WebBackendBannerPart extends WebBackendComponentPart , WebBackendFlexContainerPart , WebBackendBannerFeatures , WebBannerPart {
    WebBackendIcon getIcon();

    WebBackendContainer getContent();

    WebBackendParagraph getMessageParagraph();

    WebBackendFlexContainer getActions();

    WebBackendButton getDismissButton();

    WebBackendFlexContainerPart getFlexContainerPart();
}
