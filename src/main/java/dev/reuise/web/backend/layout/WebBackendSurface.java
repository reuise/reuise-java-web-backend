package dev.reuise.web.backend.layout;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.layout.WebSurface;
public interface WebBackendSurface extends WebBackendSurfacePart , WebBackendComponent , WebSurface , WebBackendFlexContainer {
    WebBackendSurface getComponent();
}