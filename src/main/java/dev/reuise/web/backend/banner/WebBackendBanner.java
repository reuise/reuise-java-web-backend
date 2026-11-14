package dev.reuise.web.backend.banner;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.core.banner.WebBanner;
public interface WebBackendBanner extends WebBanner , WebBackendComponent , WebBackendBannerPart , WebBackendFlexContainer {
    WebBackendBanner getComponent();

    WebBackendBanner setAnimation(ComponentAnimation animation);

    WebBackendBanner startAnimation();

    WebBackendBanner cancelAnimation();
}
