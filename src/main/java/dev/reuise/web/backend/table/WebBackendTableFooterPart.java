package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.table.WebTableFooterPart;
public interface WebBackendTableFooterPart extends WebBackendTableFooterFeatures , WebBackendComponentPart , WebTableFooterPart , WebBackendParentComponentPart {
    WebBackendParentComponentPart getParentComponentPart();
}