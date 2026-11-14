package dev.reuise.web.backend.consent;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
import dev.reuise.web.backend.dialog.WebBackendDialog;
import dev.reuise.web.backend.dialog.WebBackendDialogOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPartOptions;
import dev.reuise.web.backend.text.WebBackendParagraph;
import dev.reuise.web.backend.text.WebBackendParagraphOptions;
import dev.reuise.web.core.consent.WebConsentBannerPartOptions;
public interface WebBackendConsentBannerPartOptions extends WebConsentBannerPartOptions {
    WebBackendFlexContainerPartOptions getFlexContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendConsentBannerPartOptions setMessageParagraphCreator(ComponentCreator<? extends WebBackendParagraph, ? extends WebBackendParagraphOptions> messageParagraphCreator);

    WebBackendConsentBannerPartOptions setActionsCreator(ComponentCreator<? extends WebBackendFlexContainer, ? extends WebBackendFlexContainerOptions> actionsCreator);

    WebBackendConsentBannerPartOptions setAcceptButtonCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> acceptButtonCreator);

    WebBackendConsentBannerPartOptions setRejectButtonCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> rejectButtonCreator);

    WebBackendConsentBannerPartOptions setPreferencesButtonCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> preferencesButtonCreator);

    WebBackendConsentBannerPartOptions setPreferencesDialogCreator(ComponentCreator<? extends WebBackendDialog, ? extends WebBackendDialogOptions> preferencesDialogCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendConsentBanner getComponent();
}
