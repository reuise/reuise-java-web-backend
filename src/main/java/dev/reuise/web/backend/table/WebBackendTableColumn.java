package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.table.WebTableColumn;
public interface WebBackendTableColumn extends WebBackendParentComponent , WebBackendComponent , WebTableColumn , WebBackendTableColumnPart {
    WebBackendTableColumn getComponent();
}