package dev.reuise.web.backend.layout;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.layout.WebSurfacePart;
public interface WebBackendSurfacePart extends WebSurfacePart , WebBackendComponentPart , WebBackendFlexContainerPart , WebBackendSurfaceFeatures {
    WebBackendFlexContainerPart getFlexContainerPart();
}