package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.table.WebTableHeaderCell;
public interface WebBackendTableHeaderCell extends WebBackendParentComponent , WebBackendComponent , WebTableHeaderCell , WebBackendTableHeaderCellPart {
    WebBackendTableHeaderCell getComponent();
}