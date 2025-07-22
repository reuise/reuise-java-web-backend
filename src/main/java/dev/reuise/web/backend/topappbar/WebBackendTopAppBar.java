package dev.reuise.web.backend.topappbar;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.topappbar.WebTopAppBar;
public interface WebBackendTopAppBar extends WebBackendTopAppBarPart , WebBackendParentComponent , WebBackendComponent , WebTopAppBar {
    WebBackendTopAppBar getComponent();
}