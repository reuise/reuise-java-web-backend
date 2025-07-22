package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.table.WebTablePart;
public interface WebBackendTablePart extends WebTablePart , WebBackendComponentPart , WebBackendTableFeatures , WebBackendParentComponentPart {
    WebBackendContainer getTable();

    WebBackendTableColumnGroup getColumnGroup();

    WebBackendTableHeader getHeader();

    WebBackendTableBody getBody();

    WebBackendTableFooter getFooter();

    WebBackendParentComponentPart getParentComponentPart();
}