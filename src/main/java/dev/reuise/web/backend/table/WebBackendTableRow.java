package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.table.WebTableRow;
public interface WebBackendTableRow extends WebTableRow , WebBackendTableRowPart , WebBackendParentComponent , WebBackendComponent {
    WebBackendTableRow getComponent();
}