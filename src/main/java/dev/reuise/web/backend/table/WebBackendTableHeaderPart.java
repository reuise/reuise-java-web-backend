package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.table.WebTableHeaderPart;
public interface WebBackendTableHeaderPart extends WebBackendTableHeaderFeatures , WebBackendComponentPart , WebBackendParentComponentPart , WebTableHeaderPart {
    WebBackendTableHeaderRow getRow();

    WebBackendParentComponentPart getParentComponentPart();
}