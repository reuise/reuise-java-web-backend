package dev.reuise.web.backend.splitcontainer;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.core.splitcontainer.WebSplitContainerPanel;
public interface WebBackendSplitContainerPanel extends WebBackendComponent , WebBackendSplitContainerPanelPart , WebSplitContainerPanel , WebBackendContainer {
    WebBackendSplitContainerPanel getComponent();
}