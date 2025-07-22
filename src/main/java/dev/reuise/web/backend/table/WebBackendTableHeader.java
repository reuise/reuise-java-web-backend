package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.table.WebTableHeader;
public interface WebBackendTableHeader extends WebBackendParentComponent , WebBackendComponent , WebTableHeader , WebBackendTableHeaderPart {
    WebBackendTableHeader getComponent();
}