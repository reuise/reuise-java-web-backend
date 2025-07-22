package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.table.WebTableCellPart;
public interface WebBackendTableCellPart extends WebBackendTableCellFeatures , WebBackendComponentPart , WebTableCellPart , WebBackendParentComponentPart {
    WebBackendParentComponentPart getParentComponentPart();
}