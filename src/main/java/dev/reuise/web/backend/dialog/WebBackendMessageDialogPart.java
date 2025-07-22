package dev.reuise.web.backend.dialog;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.dialog.WebMessageDialogPart;
public interface WebBackendMessageDialogPart extends WebBackendMessageDialogFeatures , WebMessageDialogPart , WebBackendComponentPart , WebBackendDialogPart {
    WebBackendDialogPart getDialogPart();
}