package dev.reuise.web.backend.carousel;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.core.carousel.WebCarousel;
public interface WebBackendCarousel extends WebCarousel , WebBackendComponent , WebBackendContainer , WebBackendCarouselPart {
    WebBackendCarousel getComponent();

    WebBackendCarousel setAnimation(ComponentAnimation animation);

    WebBackendCarousel startAnimation();

    WebBackendCarousel cancelAnimation();
}
