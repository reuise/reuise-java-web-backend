package dev.reuise.web.backend.view;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.core.view.WebRouteLayout;
public interface WebBackendRouteLayout extends WebBackendRouteLayoutPart , WebRouteLayout , WebBackendComponent , WebBackendContainer {
    WebBackendRouteLayout getComponent();
}