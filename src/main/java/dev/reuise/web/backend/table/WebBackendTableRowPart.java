package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.table.WebTableRowPart;
public interface WebBackendTableRowPart extends WebTableRowPart , WebBackendTableRowFeatures , WebBackendComponentPart , WebBackendParentComponentPart {
    WebBackendParentComponentPart getParentComponentPart();
}