package dev.reuise.web.backend.bottomappbar;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponent;
import dev.reuise.web.core.bottomappbar.WebBottomAppBar;
public interface WebBackendBottomAppBar extends WebBackendBottomAppBarPart , WebBackendBaseComponent , WebBackendComponent , WebBottomAppBar {
    WebBackendBottomAppBar getComponent();
}