package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.table.WebTableColumnGroupPart;
public interface WebBackendTableColumnGroupPart extends WebBackendComponentPart , WebBackendTableColumnGroupFeatures , WebBackendParentComponentPart , WebTableColumnGroupPart {
    WebBackendParentComponentPart getParentComponentPart();
}