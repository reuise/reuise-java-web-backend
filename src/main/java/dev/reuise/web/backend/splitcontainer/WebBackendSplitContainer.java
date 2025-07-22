package dev.reuise.web.backend.splitcontainer;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.core.splitcontainer.WebSplitContainer;
public interface WebBackendSplitContainer extends WebBackendSplitContainerPart , WebSplitContainer , WebBackendComponent , WebBackendContainer {
    WebBackendSplitContainer getComponent();
}