package dev.reuise.web.backend.parentcomponent;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebBackendParentComponent extends WebParentComponent , WebBackendBaseComponent , WebBackendComponent , WebBackendParentComponentPart {
    WebBackendParentComponent getComponent();
}