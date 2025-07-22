package dev.reuise.web.backend.dialog;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.text.WebBackendHeading;
import dev.reuise.web.core.dialog.WebDialogPart;
public interface WebBackendDialogPart extends WebBackendComponentPart , WebBackendDialogFeatures , WebBackendParentComponentPart , WebDialogPart {
    WebBackendContainer getContainer();

    WebBackendContainer getHeader();

    WebBackendHeading getTitleHeading();

    WebBackendFlexContainer getBody();

    WebBackendFlexContainer getFooter();

    WebBackendContainer getScrim();

    WebBackendButton getAcceptButton();

    WebBackendButton getCancelButton();

    WebBackendParentComponentPart getParentComponentPart();
}