package dev.reuise.web.backend.button;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPart;
import dev.reuise.web.core.button.WebButtonBarPart;
public interface WebBackendButtonBarPart extends WebBackendComponentPart , WebBackendFlexContainerPart , WebButtonBarPart , WebBackendButtonBarFeatures {
    WebBackendFlexContainerPart getFlexContainerPart();
}
