package dev.reuise.web.backend.consent;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.core.consent.WebConsentBanner;
public interface WebBackendConsentBanner extends WebConsentBanner , WebBackendConsentBannerPart , WebBackendComponent , WebBackendFlexContainer {
    WebBackendConsentBanner getComponent();

    WebBackendConsentBanner setAnimation(ComponentAnimation animation);

    WebBackendConsentBanner startAnimation();

    WebBackendConsentBanner cancelAnimation();
}
