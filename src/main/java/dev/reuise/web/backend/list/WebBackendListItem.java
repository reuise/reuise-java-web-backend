package dev.reuise.web.backend.list;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.list.WebListItem;
public interface WebBackendListItem extends WebBackendListItemPart , WebListItem , WebBackendComponent , WebBackendBasicListItem {
    WebBackendListItem getComponent();
}