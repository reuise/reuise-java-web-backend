package dev.reuise.web.backend.carousel;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.core.carousel.WebCarouselPart;
public interface WebBackendCarouselPart extends WebBackendCarouselFeatures , WebBackendComponentPart , WebBackendContainerPart , WebCarouselPart {
    WebBackendContainer getViewport();

    WebBackendContainer getSlider();

    WebBackendContainer getNavigation();

    WebBackendButton getPreviousButton();

    WebBackendContainer getIndicators();

    WebBackendButton getNextButton();

    WebBackendButton getAutoplayButton();

    WebBackendInlineText getAnnouncement();

    WebBackendContainerPart getContainerPart();
}
