package dev.reuise.web.backend.layout;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.layout.WebContainerPart;
public interface WebBackendContainerPart extends WebBackendComponentPart , WebBackendParentComponentPart , WebContainerPart , WebBackendContainerFeatures {
    WebBackendParentComponentPart getParentComponentPart();
}