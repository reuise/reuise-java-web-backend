package dev.reuise.web.backend.basecomponent;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.basecomponent.WebBaseComponent;
public interface WebBackendBaseComponent extends WebBackendBaseComponentPart , WebBackendComponent , WebBaseComponent {
    WebBackendBaseComponent getComponent();
}