package dev.reuise.web.backend.divider;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.divider.WebDivider;
public interface WebBackendDivider extends WebBackendParentComponent , WebDivider , WebBackendDividerPart , WebBackendComponent {
    WebBackendDivider getComponent();
}