package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.table.WebTableCell;
public interface WebBackendTableCell extends WebBackendParentComponent , WebBackendTableCellPart , WebTableCell , WebBackendComponent {
    WebBackendTableCell getComponent();
}