package dev.reuise.web.backend.scrollablecontainer;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.scrollablecontainer.WebScrollableContainerEdge;
public interface WebBackendScrollableContainerEdge extends WebScrollableContainerEdge , WebBackendParentComponent , WebBackendComponent , WebBackendScrollableContainerEdgePart {
    WebBackendScrollableContainerEdge getComponent();
}