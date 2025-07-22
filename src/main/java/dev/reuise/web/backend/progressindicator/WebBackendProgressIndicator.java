package dev.reuise.web.backend.progressindicator;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.progressindicator.WebProgressIndicator;
public interface WebBackendProgressIndicator extends WebProgressIndicator , WebBackendParentComponent , WebBackendProgressIndicatorPart , WebBackendComponent {
    WebBackendProgressIndicator getComponent();
}