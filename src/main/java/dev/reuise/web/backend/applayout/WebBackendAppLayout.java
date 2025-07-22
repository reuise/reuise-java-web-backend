package dev.reuise.web.backend.applayout;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.applayout.WebAppLayout;
public interface WebBackendAppLayout extends WebAppLayout , WebBackendParentComponent , WebBackendAppLayoutPart , WebBackendComponent {
    WebBackendAppLayout getComponent();
}