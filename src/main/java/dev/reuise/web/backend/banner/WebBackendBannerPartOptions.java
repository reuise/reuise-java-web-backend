package dev.reuise.web.backend.banner;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.icon.WebBackendIconOptions;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPartOptions;
import dev.reuise.web.backend.text.WebBackendParagraph;
import dev.reuise.web.backend.text.WebBackendParagraphOptions;
import dev.reuise.web.core.banner.WebBannerPartOptions;
public interface WebBackendBannerPartOptions extends WebBannerPartOptions {
    WebBackendFlexContainerPartOptions getFlexContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendBannerPartOptions setIconCreator(ComponentCreator<? extends WebBackendIcon, ? extends WebBackendIconOptions> iconCreator);

    WebBackendBannerPartOptions setContentCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> contentCreator);

    WebBackendBannerPartOptions setMessageParagraphCreator(ComponentCreator<? extends WebBackendParagraph, ? extends WebBackendParagraphOptions> messageParagraphCreator);

    WebBackendBannerPartOptions setActionsCreator(ComponentCreator<? extends WebBackendFlexContainer, ? extends WebBackendFlexContainerOptions> actionsCreator);

    WebBackendBannerPartOptions setDismissButtonCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> dismissButtonCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendBanner getComponent();
}
