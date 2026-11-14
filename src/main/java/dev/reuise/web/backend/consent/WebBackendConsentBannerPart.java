package dev.reuise.web.backend.consent;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.dialog.WebBackendDialog;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPart;
import dev.reuise.web.backend.text.WebBackendParagraph;
import dev.reuise.web.core.consent.WebConsentBannerPart;
public interface WebBackendConsentBannerPart extends WebBackendComponentPart , WebBackendFlexContainerPart , WebBackendConsentBannerFeatures , WebConsentBannerPart {
    WebBackendParagraph getMessageParagraph();

    WebBackendFlexContainer getActions();

    WebBackendButton getAcceptButton();

    WebBackendButton getRejectButton();

    WebBackendButton getPreferencesButton();

    WebBackendDialog getPreferencesDialog();

    WebBackendFlexContainerPart getFlexContainerPart();
}
