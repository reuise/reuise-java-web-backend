package dev.reuise.web.backend.slidecontainer;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.core.slidecontainer.WebSlideContainer;
public interface WebBackendSlideContainer extends WebBackendSlideContainerPart , WebSlideContainer , WebBackendComponent , WebBackendContainer {
    WebBackendSlideContainer getComponent();
}