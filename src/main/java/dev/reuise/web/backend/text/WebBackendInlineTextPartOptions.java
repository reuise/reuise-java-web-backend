package dev.reuise.web.backend.text;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.core.text.WebInlineTextPartOptions;
public interface WebBackendInlineTextPartOptions extends WebInlineTextPartOptions {
    WebBackendTextPartOptions getTextPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendInlineText getComponent();
}