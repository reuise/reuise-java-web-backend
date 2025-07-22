package dev.reuise.web.backend.layout;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.layout.WebFieldSetPart;
public interface WebBackendFieldSetPart extends WebBackendComponentPart , WebBackendContainerPart , WebBackendFieldSetFeatures , WebFieldSetPart {
    WebBackendContainerPart getContainerPart();
}