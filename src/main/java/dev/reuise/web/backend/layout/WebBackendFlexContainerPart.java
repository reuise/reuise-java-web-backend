package dev.reuise.web.backend.layout;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.layout.WebFlexContainerPart;
public interface WebBackendFlexContainerPart extends WebBackendComponentPart , WebBackendContainerPart , WebBackendFlexContainerFeatures , WebFlexContainerPart {
    WebBackendContainerPart getContainerPart();
}