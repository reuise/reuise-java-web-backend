package dev.reuise.web.backend.link;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.link.WebLink;
public interface WebBackendLink extends WebLink , WebBackendParentComponent , WebBackendLinkPart , WebBackendComponent {
    WebBackendLink getComponent();
}