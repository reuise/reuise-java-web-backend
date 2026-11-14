package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.core.text.WebRotatingTextPart;
public interface WebBackendRotatingTextPart extends WebBackendRotatingTextFeatures , WebBackendComponentPart , WebBackendBaseComponentPart , WebRotatingTextPart {
    WebBackendBaseComponentPart getBaseComponentPart();
}
