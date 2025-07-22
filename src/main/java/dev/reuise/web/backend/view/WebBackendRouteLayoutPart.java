package dev.reuise.web.backend.view;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.core.view.WebRouteLayoutPart;
public interface WebBackendRouteLayoutPart extends WebBackendComponentPart , WebBackendContainerPart , WebBackendRouteLayoutFeatures , WebRouteLayoutPart {
    WebBackendContainerPart getContainerPart();
}