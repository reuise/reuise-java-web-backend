package dev.reuise.web.backend.list;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.list.WebBasicList;
public interface WebBackendBasicList extends WebBackendParentComponent , WebBasicList , WebBackendComponent , WebBackendBasicListPart {
    WebBackendBasicList getComponent();
}