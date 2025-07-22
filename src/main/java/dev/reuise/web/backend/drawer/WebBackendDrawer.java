package dev.reuise.web.backend.drawer;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.core.drawer.WebDrawer;
public interface WebBackendDrawer extends WebBackendDrawerPart , WebDrawer , WebBackendComponent , WebBackendContainer {
    WebBackendDrawer getComponent();
}