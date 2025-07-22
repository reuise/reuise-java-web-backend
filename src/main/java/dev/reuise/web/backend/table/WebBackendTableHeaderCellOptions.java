package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.table.WebTableHeaderCellOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendTableHeaderCellOptions extends WebBackendBaseComponentPartOptions , WebTableHeaderCellOptions , WebBackendComponentOptions , WebBackendParentComponentOptions , WebBackendTableHeaderCellPartOptions , WebBackendParentComponentPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}