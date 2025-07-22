package dev.reuise.web.backend.layout;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.layout.WebRowLayoutPart;
public interface WebBackendRowLayoutPart extends WebBackendRowLayoutFeatures , WebBackendComponentPart , WebBackendFlexContainerPart , WebRowLayoutPart {
    WebBackendFlexContainerPart getFlexContainerPart();
}