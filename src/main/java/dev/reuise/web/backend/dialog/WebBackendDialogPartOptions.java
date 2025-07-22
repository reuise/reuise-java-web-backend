package dev.reuise.web.backend.dialog;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.backend.text.WebBackendHeading;
import dev.reuise.web.backend.text.WebBackendHeadingOptions;
import dev.reuise.web.core.dialog.WebDialogPartOptions;
public interface WebBackendDialogPartOptions extends WebDialogPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendDialogPartOptions setContainerCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> containerCreator);

    WebBackendDialogPartOptions setHeaderCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> headerCreator);

    WebBackendDialogPartOptions setTitleHeadingCreator(ComponentCreator<? extends WebBackendHeading, ? extends WebBackendHeadingOptions> titleHeadingCreator);

    WebBackendDialogPartOptions setBodyCreator(ComponentCreator<? extends WebBackendFlexContainer, ? extends WebBackendFlexContainerOptions> bodyCreator);

    WebBackendDialogPartOptions setFooterCreator(ComponentCreator<? extends WebBackendFlexContainer, ? extends WebBackendFlexContainerOptions> footerCreator);

    WebBackendDialogPartOptions setScrimCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> scrimCreator);

    WebBackendDialogPartOptions setAcceptButtonCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> acceptButtonCreator);

    WebBackendDialogPartOptions setCancelButtonCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> cancelButtonCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendDialog getComponent();
}