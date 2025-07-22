package dev.reuise.web.backend.scrollablecontainer;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.scrollablecontainer.WebScrollableContainerEdgePart;
public interface WebBackendScrollableContainerEdgePart extends WebBackendScrollableContainerEdgeFeatures , WebBackendComponentPart , WebScrollableContainerEdgePart , WebBackendParentComponentPart {
    WebBackendParentComponentPart getParentComponentPart();
}