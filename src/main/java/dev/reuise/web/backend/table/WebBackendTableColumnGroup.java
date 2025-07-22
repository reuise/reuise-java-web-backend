package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.table.WebTableColumnGroup;
public interface WebBackendTableColumnGroup extends WebTableColumnGroup , WebBackendParentComponent , WebBackendTableColumnGroupPart , WebBackendComponent {
    WebBackendTableColumnGroup getComponent();
}