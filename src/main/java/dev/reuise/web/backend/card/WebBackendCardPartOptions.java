package dev.reuise.web.backend.card;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.image.WebBackendImage;
import dev.reuise.web.backend.image.WebBackendImageOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.backend.layout.WebBackendSurfacePartOptions;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.backend.link.WebBackendLinkOptions;
import dev.reuise.web.backend.text.WebBackendTextBlock;
import dev.reuise.web.backend.text.WebBackendTextBlockOptions;
import dev.reuise.web.core.card.WebCardPartOptions;
public interface WebBackendCardPartOptions extends WebCardPartOptions {
    WebBackendSurfacePartOptions getSurfacePart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendCardPartOptions setMediaLinkCreator(ComponentCreator<? extends WebBackendLink, ? extends WebBackendLinkOptions> mediaLinkCreator);

    WebBackendCardPartOptions setMediaContainerCreator(ComponentCreator<? extends WebBackendFlexContainer, ? extends WebBackendFlexContainerOptions> mediaContainerCreator);

    WebBackendCardPartOptions setImageCreator(ComponentCreator<? extends WebBackendImage, ? extends WebBackendImageOptions> imageCreator);

    WebBackendCardPartOptions setTextContentCreator(ComponentCreator<? extends WebBackendFlexContainer, ? extends WebBackendFlexContainerOptions> textContentCreator);

    WebBackendCardPartOptions setHeadlineCreator(ComponentCreator<? extends WebBackendFlexContainer, ? extends WebBackendFlexContainerOptions> headlineCreator);

    WebBackendCardPartOptions setHeadingLinkCreator(ComponentCreator<? extends WebBackendLink, ? extends WebBackendLinkOptions> headingLinkCreator);

    WebBackendCardPartOptions setHeadingContainerCreator(ComponentCreator<? extends WebBackendTextBlock, ? extends WebBackendTextBlockOptions> headingContainerCreator);

    WebBackendCardPartOptions setSubHeadingContainerCreator(ComponentCreator<? extends WebBackendTextBlock, ? extends WebBackendTextBlockOptions> subHeadingContainerCreator);

    WebBackendCardPartOptions setTextContainerCreator(ComponentCreator<? extends WebBackendTextBlock, ? extends WebBackendTextBlockOptions> textContainerCreator);

    WebBackendCardPartOptions setActionsContainerCreator(ComponentCreator<? extends WebBackendFlexContainer, ? extends WebBackendFlexContainerOptions> actionsContainerCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendCard getComponent();
}