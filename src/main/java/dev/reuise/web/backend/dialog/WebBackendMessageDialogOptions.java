package dev.reuise.web.backend.dialog;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.dialog.WebMessageDialogOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendMessageDialogOptions extends WebBackendDialogPartOptions , WebBackendBaseComponentPartOptions , WebBackendMessageDialogPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebMessageDialogOptions , WebBackendDialogOptions {
    WebBackendDialogPartOptions getDialogPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}