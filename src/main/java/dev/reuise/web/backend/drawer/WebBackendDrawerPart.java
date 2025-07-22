package dev.reuise.web.backend.drawer;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.core.drawer.WebDrawerPart;
public interface WebBackendDrawerPart extends WebDrawerPart , WebBackendDrawerFeatures , WebBackendComponentPart , WebBackendContainerPart {
    WebBackendContainerPart getContainerPart();
}