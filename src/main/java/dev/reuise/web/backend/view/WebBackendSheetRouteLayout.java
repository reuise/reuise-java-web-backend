package dev.reuise.web.backend.view;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendSheetLayout;
import dev.reuise.web.core.view.WebSheetRouteLayout;
public interface WebBackendSheetRouteLayout extends WebSheetRouteLayout , WebBackendSheetLayout , WebBackendComponent , WebBackendSheetRouteLayoutPart {
    WebBackendSheetRouteLayout getComponent();
}