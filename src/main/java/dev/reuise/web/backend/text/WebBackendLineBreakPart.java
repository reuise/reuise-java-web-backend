package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.core.text.WebLineBreakPart;
public interface WebBackendLineBreakPart extends WebBackendComponentPart , WebLineBreakPart , WebBackendBaseComponentPart , WebBackendLineBreakFeatures {
    WebBackendBaseComponentPart getBaseComponentPart();
}