package dev.reuise.web.backend.scrollablecontainer;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.scrollablecontainer.WebScrollableContainerScrollArea;
public interface WebBackendScrollableContainerScrollArea extends WebBackendParentComponent , WebBackendScrollableContainerScrollAreaPart , WebScrollableContainerScrollArea , WebBackendComponent {
    WebBackendScrollableContainerScrollArea getComponent();
}