package dev.reuise.web.backend.list;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.list.WebListView;
public interface WebBackendListView extends WebBackendListViewPart , WebBackendParentComponent , WebListView , WebBackendComponent {
    WebBackendListView getComponent();
}