package dev.reuise.web.backend.dialog;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.dialog.WebDialog;
public interface WebBackendDialog extends WebBackendParentComponent , WebDialog , WebBackendComponent , WebBackendDialogPart {
    WebBackendDialog getComponent();
}