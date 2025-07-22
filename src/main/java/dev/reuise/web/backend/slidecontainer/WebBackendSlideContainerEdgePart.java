package dev.reuise.web.backend.slidecontainer;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.slidecontainer.WebSlideContainerEdgePart;
public interface WebBackendSlideContainerEdgePart extends WebSlideContainerEdgePart , WebBackendComponentPart , WebBackendSlideContainerEdgeFeatures , WebBackendParentComponentPart {
    WebBackendParentComponentPart getParentComponentPart();
}