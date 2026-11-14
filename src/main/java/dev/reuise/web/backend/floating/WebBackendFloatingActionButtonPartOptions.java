package dev.reuise.web.backend.floating;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.button.WebBackendButtonPartOptions;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.backend.text.WebBackendInlineTextOptions;
import dev.reuise.web.core.floating.WebFloatingActionButtonPartOptions;
public interface WebBackendFloatingActionButtonPartOptions extends WebFloatingActionButtonPartOptions {
    WebBackendButtonPartOptions getButtonPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendFloatingActionButtonPartOptions setBadgeCreator(ComponentCreator<? extends WebBackendInlineText, ? extends WebBackendInlineTextOptions> badgeCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendFloatingActionButton getComponent();
}
