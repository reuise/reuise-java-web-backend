package dev.reuise.web.backend.scrollablecontainer;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.core.scrollablecontainer.WebScrollableContainerPart;
public interface WebBackendScrollableContainerPart extends WebScrollableContainerPart , WebBackendScrollableContainerFeatures , WebBackendComponentPart , WebBackendContainerPart {
    WebBackendContainer getScrollAreaBefore();

    WebBackendScrollableContainerScrollArea getScrollArea();

    WebBackendContainer getScrollAreaAfter();

    WebBackendContainerPart getContainerPart();
}