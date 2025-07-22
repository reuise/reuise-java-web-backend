package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.table.WebTable;
public interface WebBackendTable extends WebBackendParentComponent , WebTable , WebBackendTablePart , WebBackendComponent {
    WebBackendTable getComponent();
}