package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.checkbox.WebBackendCheckbox;
import dev.reuise.web.core.table.WebCheckboxTableColumnPart;
// Checked here??
public interface WebBackendCheckboxTableColumnPart extends WebBackendCheckboxTableColumnFeatures , WebBackendComponentPart , WebCheckboxTableColumnPart , WebBackendTableColumnPart {
    boolean isChecked();

    WebBackendCheckboxTableColumnPart setChecked(Boolean checked);

    WebBackendCheckbox getCheckbox();

    WebBackendTableColumnPart getTableColumnPart();
}