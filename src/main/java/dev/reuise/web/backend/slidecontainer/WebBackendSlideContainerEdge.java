package dev.reuise.web.backend.slidecontainer;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.slidecontainer.WebSlideContainerEdge;
public interface WebBackendSlideContainerEdge extends WebSlideContainerEdge , WebBackendParentComponent , WebBackendSlideContainerEdgePart , WebBackendComponent {
    WebBackendSlideContainerEdge getComponent();
}