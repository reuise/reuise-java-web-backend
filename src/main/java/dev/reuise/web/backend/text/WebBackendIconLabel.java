package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.text.WebIconLabel;
public interface WebBackendIconLabel extends WebBackendParentComponent , WebIconLabel , WebBackendComponent , WebBackendIconLabelPart {
    WebBackendIconLabel getComponent();
}