package dev.reuise.web.backend.list;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.list.WebBasicListItem;
public interface WebBackendBasicListItem extends WebBasicListItem , WebBackendParentComponent , WebBackendBasicListItemPart , WebBackendComponent {
    WebBackendBasicListItem getComponent();
}