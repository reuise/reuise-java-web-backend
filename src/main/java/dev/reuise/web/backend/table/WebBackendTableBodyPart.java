package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.table.WebTableBodyPart;
public interface WebBackendTableBodyPart extends WebTableBodyPart , WebBackendComponentPart , WebBackendParentComponentPart , WebBackendTableBodyFeatures {
    WebBackendParentComponentPart getParentComponentPart();
}