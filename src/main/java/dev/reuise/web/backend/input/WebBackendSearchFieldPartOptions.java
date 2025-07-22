package dev.reuise.web.backend.input;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.core.input.WebSearchFieldPartOptions;
public interface WebBackendSearchFieldPartOptions extends WebSearchFieldPartOptions {
    WebBackendTextFieldPartOptions getTextFieldPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendSearchField getComponent();
}