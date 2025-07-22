package dev.reuise.web.backend.badge;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.core.badge.WebBadgePart;
public interface WebBackendBadgePart extends WebBackendBadgeFeatures , WebBadgePart , WebBackendComponentPart , WebBackendBaseComponentPart {
    WebBackendBaseComponentPart getBaseComponentPart();
}