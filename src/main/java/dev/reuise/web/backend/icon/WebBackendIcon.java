package dev.reuise.web.backend.icon;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.icon.WebIcon;
public interface WebBackendIcon extends WebBackendIconPart , WebIcon , WebBackendParentComponent , WebBackendComponent {
    WebBackendIcon getComponent();
}