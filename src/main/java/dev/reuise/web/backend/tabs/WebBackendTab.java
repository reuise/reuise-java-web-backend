package dev.reuise.web.backend.tabs;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.tabs.WebTab;
public interface WebBackendTab extends WebTab , WebBackendParentComponent , WebBackendComponent , WebBackendTabPart {
    WebBackendTab getComponent();
}