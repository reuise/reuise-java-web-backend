package dev.reuise.web.backend.layout;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.layout.WebFlexContainer;
public interface WebBackendFlexContainer extends WebFlexContainer , WebBackendFlexContainerPart , WebBackendComponent , WebBackendContainer {
    WebBackendFlexContainer getComponent();
}