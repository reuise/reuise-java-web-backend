package dev.reuise.web.backend.parentcomponent;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebBackendParentComponentPart extends WebBackendParentComponentFeatures , WebParentComponentPart , WebBackendComponentPart , WebBackendBaseComponentPart {
    WebBackendBaseComponentPart getBaseComponentPart();
}