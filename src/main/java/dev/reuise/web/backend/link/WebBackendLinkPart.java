package dev.reuise.web.backend.link;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.link.WebLinkPart;
public interface WebBackendLinkPart extends WebBackendComponentPart , WebLinkPart , WebBackendParentComponentPart , WebBackendLinkFeatures {
    WebBackendParentComponentPart getParentComponentPart();
}