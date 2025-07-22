package dev.reuise.web.backend.applayout;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPart;
import dev.reuise.web.core.applayout.WebAppLayoutBodyPart;
public interface WebBackendAppLayoutBodyPart extends WebBackendComponentPart , WebBackendFlexContainerPart , WebBackendAppLayoutBodyFeatures , WebAppLayoutBodyPart {
    WebBackendFlexContainerPart getFlexContainerPart();
}