package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.table.WebTableRowOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendTableRowOptions extends WebBackendBaseComponentPartOptions , WebBackendTableRowPartOptions , WebBackendComponentOptions , WebBackendParentComponentOptions , WebTableRowOptions , WebBackendParentComponentPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}