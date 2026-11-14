package dev.reuise.web.backend.carousel;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.backend.text.WebBackendInlineTextOptions;
import dev.reuise.web.core.carousel.WebCarouselPartOptions;
public interface WebBackendCarouselPartOptions extends WebCarouselPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendCarouselPartOptions setViewportCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> viewportCreator);

    WebBackendCarouselPartOptions setSliderCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> sliderCreator);

    WebBackendCarouselPartOptions setNavigationCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> navigationCreator);

    WebBackendCarouselPartOptions setPreviousButtonCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> previousButtonCreator);

    WebBackendCarouselPartOptions setIndicatorsCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> indicatorsCreator);

    WebBackendCarouselPartOptions setNextButtonCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> nextButtonCreator);

    WebBackendCarouselPartOptions setAutoplayButtonCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> autoplayButtonCreator);

    WebBackendCarouselPartOptions setAnnouncementCreator(ComponentCreator<? extends WebBackendInlineText, ? extends WebBackendInlineTextOptions> announcementCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendCarousel getComponent();
}
