package dev.reuise.web.backend.badge;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponent;
import dev.reuise.web.core.badge.WebBadge;
public interface WebBackendBadge extends WebBadge , WebBackendBadgePart , WebBackendBaseComponent , WebBackendComponent {
    WebBackendBadge getComponent();
}