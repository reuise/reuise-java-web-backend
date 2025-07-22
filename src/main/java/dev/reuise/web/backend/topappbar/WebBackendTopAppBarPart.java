package dev.reuise.web.backend.topappbar;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.button.WebBackendIconButton;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.topappbar.WebTopAppBarPart;
public interface WebBackendTopAppBarPart extends WebBackendComponentPart , WebTopAppBarPart , WebBackendParentComponentPart , WebBackendTopAppBarFeatures {
    WebBackendContainer getContainer();

    WebBackendIconButton getNavigationButton();

    WebBackendContainer getTitleContainer();

    WebBackendContainer getActionsContainer();

    WebBackendParentComponentPart getParentComponentPart();
}