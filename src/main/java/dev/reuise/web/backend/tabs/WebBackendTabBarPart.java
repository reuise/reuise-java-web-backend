package dev.reuise.web.backend.tabs;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.core.tabs.WebTabBarPart;
public interface WebBackendTabBarPart extends WebTabBarPart , WebBackendComponentPart , WebBackendContainerPart , WebBackendTabBarFeatures {
    WebBackendContainer getContainer();

    WebBackendContainer getActiveIndicator();

    WebBackendContainerPart getContainerPart();
}