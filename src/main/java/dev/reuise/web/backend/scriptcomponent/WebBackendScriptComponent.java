package dev.reuise.web.backend.scriptcomponent;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.scriptcomponent.WebScriptComponent;
public interface WebBackendScriptComponent extends WebBackendParentComponent , WebScriptComponent , WebBackendComponent , WebBackendScriptComponentPart {
    WebBackendScriptComponent getComponent();
}