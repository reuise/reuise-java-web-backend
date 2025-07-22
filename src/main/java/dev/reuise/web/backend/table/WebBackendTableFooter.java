package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.table.WebTableFooter;
public interface WebBackendTableFooter extends WebBackendParentComponent , WebBackendComponent , WebTableFooter , WebBackendTableFooterPart {
    WebBackendTableFooter getComponent();
}