package dev.reuise.web.backend.menu;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.list.WebBackendListView;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.menu.WebMenuPart;
public interface WebBackendMenuPart extends WebMenuPart , WebBackendMenuFeatures , WebBackendComponentPart , WebBackendParentComponentPart {
    WebBackendListView getList();

    WebBackendParentComponentPart getParentComponentPart();
}