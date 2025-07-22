package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.table.WebCheckboxTableCellOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendCheckboxTableCellOptions extends WebBackendTableCellPartOptions , WebBackendBaseComponentPartOptions , WebBackendTableCellOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendCheckboxTableCellPartOptions , WebCheckboxTableCellOptions {
    WebBackendTableCellPartOptions getTableCellPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}