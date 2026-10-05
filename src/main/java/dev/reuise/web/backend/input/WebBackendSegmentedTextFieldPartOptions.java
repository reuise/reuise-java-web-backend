package dev.reuise.web.backend.input;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.layout.WebBackendRowLayoutPartOptions;
import dev.reuise.web.core.input.WebSegmentedTextFieldPartOptions;
public interface WebBackendSegmentedTextFieldPartOptions extends WebSegmentedTextFieldPartOptions {
    WebBackendRowLayoutPartOptions getRowLayoutPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendSegmentedTextField getComponent();
}