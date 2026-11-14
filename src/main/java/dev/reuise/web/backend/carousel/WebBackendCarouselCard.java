package dev.reuise.web.backend.carousel;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.core.carousel.WebCarouselCard;
public interface WebBackendCarouselCard extends WebBackendCarouselCardPart , WebBackendComponent , WebBackendContainer , WebCarouselCard {
    WebBackendCarouselCard getComponent();

    WebBackendCarouselCard setAnimation(ComponentAnimation animation);

    WebBackendCarouselCard startAnimation();

    WebBackendCarouselCard cancelAnimation();
}
