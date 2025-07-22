package dev.reuise.web.backend.slidecontainer;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.core.slidecontainer.WebSlideContainerPart;
public interface WebBackendSlideContainerPart extends WebSlideContainerPart , WebBackendSlideContainerFeatures , WebBackendComponentPart , WebBackendContainerPart {
    WebBackendContainer getSlideAreaBefore();

    WebBackendContainer getSlideArea();

    WebBackendContainer getSlideAreaAfter();

    WebBackendContainerPart getContainerPart();
}