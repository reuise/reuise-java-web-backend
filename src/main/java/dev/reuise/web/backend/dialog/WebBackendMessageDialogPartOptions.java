package dev.reuise.web.backend.dialog;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.core.dialog.WebMessageDialogPartOptions;
public interface WebBackendMessageDialogPartOptions extends WebMessageDialogPartOptions {
    WebBackendDialogPartOptions getDialogPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendMessageDialog getComponent();
}