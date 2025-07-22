package dev.reuise.web.backend.tabs;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.core.tabs.WebTabBar;
public interface WebBackendTabBar extends WebBackendTabBarPart , WebBackendComponent , WebTabBar , WebBackendContainer {
    WebBackendTabBar getComponent();
}