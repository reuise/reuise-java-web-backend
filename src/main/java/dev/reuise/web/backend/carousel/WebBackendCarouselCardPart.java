package dev.reuise.web.backend.carousel;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.core.carousel.WebCarouselCardPart;
public interface WebBackendCarouselCardPart extends WebCarouselCardPart , WebBackendComponentPart , WebBackendContainerPart , WebBackendCarouselCardFeatures {
    WebBackendContainerPart getContainerPart();
}
