package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.table.WebTableBody;
public interface WebBackendTableBody extends WebBackendParentComponent , WebTableBody , WebBackendComponent , WebBackendTableBodyPart {
    WebBackendTableBody getComponent();
}