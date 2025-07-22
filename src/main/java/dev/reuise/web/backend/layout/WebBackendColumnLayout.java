package dev.reuise.web.backend.layout;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.layout.WebColumnLayout;
public interface WebBackendColumnLayout extends WebColumnLayout , WebBackendComponent , WebBackendColumnLayoutPart , WebBackendFlexContainer {
    WebBackendColumnLayout getComponent();
}