package dev.reuise.web.backend.dialog;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.dialog.WebMessageDialog;
public interface WebBackendMessageDialog extends WebBackendDialog , WebBackendComponent , WebBackendMessageDialogPart , WebMessageDialog {
    WebBackendMessageDialog getComponent();
}