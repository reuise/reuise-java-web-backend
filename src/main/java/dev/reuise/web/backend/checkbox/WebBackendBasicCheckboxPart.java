package dev.reuise.web.backend.checkbox;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.core.checkbox.WebBasicCheckboxPart;
public interface WebBackendBasicCheckboxPart extends WebBackendBasicCheckboxFeatures , WebBackendComponentPart , WebBackendBaseComponentPart , WebBasicCheckboxPart {
    WebBackendBaseComponentPart getBaseComponentPart();
}