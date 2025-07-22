package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.table.WebTableHeaderRow;
public interface WebBackendTableHeaderRow extends WebBackendParentComponent , WebTableHeaderRow , WebBackendComponent , WebBackendTableHeaderRowPart {
    WebBackendTableHeaderRow getComponent();
}