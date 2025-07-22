package dev.reuise.web.backend.checkbox;
import dev.reuise.core.checkbox.CheckboxSize;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.text.WebBackendLabel;
import dev.reuise.web.core.checkbox.WebCheckboxPart;
// Size here??
public interface WebBackendCheckboxPart extends WebCheckboxPart , WebBackendCheckboxFeatures , WebBackendComponentPart , WebBackendParentComponentPart {
    CheckboxSize getSize();

    WebBackendCheckboxPart setSize(CheckboxSize size);

    WebBackendBasicCheckbox getCheckbox();

    WebBackendLabel getLabelContainer();

    WebBackendParentComponentPart getParentComponentPart();
}