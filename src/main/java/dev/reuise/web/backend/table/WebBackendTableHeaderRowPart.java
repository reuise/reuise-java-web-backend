package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.table.WebTableHeaderRowPart;
public interface WebBackendTableHeaderRowPart extends WebBackendComponentPart , WebBackendTableHeaderRowFeatures , WebBackendParentComponentPart , WebTableHeaderRowPart {
    WebBackendParentComponentPart getParentComponentPart();
}