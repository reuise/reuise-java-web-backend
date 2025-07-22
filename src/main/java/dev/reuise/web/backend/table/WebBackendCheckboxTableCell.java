package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.table.WebCheckboxTableCell;
public interface WebBackendCheckboxTableCell extends WebBackendCheckboxTableCellPart , WebBackendTableCell , WebBackendComponent , WebCheckboxTableCell {
    WebBackendCheckboxTableCell getComponent();
}