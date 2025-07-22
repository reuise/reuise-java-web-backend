package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.text.WebTextPart;
public interface WebBackendTextPart extends WebTextPart , WebBackendComponentPart , WebBackendTextFeatures , WebBackendParentComponentPart {
    WebBackendParentComponentPart getParentComponentPart();
}