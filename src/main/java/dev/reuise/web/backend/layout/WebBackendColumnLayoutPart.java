package dev.reuise.web.backend.layout;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.layout.WebColumnLayoutPart;
public interface WebBackendColumnLayoutPart extends WebBackendComponentPart , WebBackendFlexContainerPart , WebBackendColumnLayoutFeatures , WebColumnLayoutPart {
    WebBackendFlexContainerPart getFlexContainerPart();
}