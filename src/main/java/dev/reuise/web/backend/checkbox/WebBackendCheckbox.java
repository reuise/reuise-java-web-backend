package dev.reuise.web.backend.checkbox;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.checkbox.WebCheckbox;
public interface WebBackendCheckbox extends WebBackendCheckboxPart , WebBackendParentComponent , WebCheckbox , WebBackendComponent {
    WebBackendCheckbox getComponent();
}