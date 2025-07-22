package dev.reuise.web.backend.input;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.core.input.WebPasswordFieldPartOptions;
public interface WebBackendPasswordFieldPartOptions extends WebPasswordFieldPartOptions {
    WebBackendTextFieldPartOptions getTextFieldPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendPasswordField getComponent();
}