package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.table.WebCheckboxTableColumnOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendCheckboxTableColumnOptions extends WebBackendCheckboxTableColumnPartOptions , WebCheckboxTableColumnOptions , WebBackendBaseComponentPartOptions , WebBackendTableColumnOptions , WebBackendTableColumnPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendTableColumnPartOptions getTableColumnPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}