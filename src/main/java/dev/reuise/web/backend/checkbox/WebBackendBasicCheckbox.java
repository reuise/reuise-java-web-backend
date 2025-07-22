package dev.reuise.web.backend.checkbox;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponent;
import dev.reuise.web.core.checkbox.WebBasicCheckbox;
public interface WebBackendBasicCheckbox extends WebBasicCheckbox , WebBackendBasicCheckboxPart , WebBackendBaseComponent , WebBackendComponent {
    WebBackendBasicCheckbox getComponent();
}