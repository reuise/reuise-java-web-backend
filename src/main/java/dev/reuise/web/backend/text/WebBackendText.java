package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.text.WebText;
public interface WebBackendText extends WebBackendTextPart , WebText , WebBackendParentComponent , WebBackendComponent {
    WebBackendText getComponent();
}