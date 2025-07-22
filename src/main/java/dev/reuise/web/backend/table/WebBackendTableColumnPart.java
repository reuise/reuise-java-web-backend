package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.table.WebTableColumnPart;
public interface WebBackendTableColumnPart extends WebBackendComponentPart , WebBackendTableColumnFeatures , WebBackendParentComponentPart , WebTableColumnPart {
    WebBackendParentComponentPart getParentComponentPart();
}