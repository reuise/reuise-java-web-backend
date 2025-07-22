package dev.reuise.web.backend.splitcontainer;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.core.splitcontainer.WebSplitContainerDivider;
public interface WebBackendSplitContainerDivider extends WebBackendComponent , WebBackendSplitContainerDividerPart , WebBackendContainer , WebSplitContainerDivider {
    WebBackendSplitContainerDivider getComponent();
}