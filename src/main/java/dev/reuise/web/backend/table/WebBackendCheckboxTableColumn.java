package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.table.WebCheckboxTableColumn;
public interface WebBackendCheckboxTableColumn extends WebBackendComponent , WebBackendCheckboxTableColumnPart , WebBackendTableColumn , WebCheckboxTableColumn {
    WebBackendCheckboxTableColumn getComponent();
}