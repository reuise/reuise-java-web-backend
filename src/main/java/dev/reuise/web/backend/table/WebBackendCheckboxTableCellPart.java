package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.checkbox.WebBackendCheckbox;
import dev.reuise.web.core.table.WebCheckboxTableCellPart;
public interface WebBackendCheckboxTableCellPart extends WebBackendCheckboxTableCellFeatures , WebBackendTableCellPart , WebBackendComponentPart , WebCheckboxTableCellPart {
    WebBackendCheckbox getCheckbox();

    WebBackendTableCellPart getTableCellPart();
}