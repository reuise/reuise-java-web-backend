package dev.reuise.web.backend.scriptcomponent;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.scriptcomponent.WebScriptComponentPart;
public interface WebBackendScriptComponentPart extends WebBackendScriptComponentFeatures , WebScriptComponentPart , WebBackendComponentPart , WebBackendParentComponentPart {
    WebBackendParentComponentPart getParentComponentPart();
}