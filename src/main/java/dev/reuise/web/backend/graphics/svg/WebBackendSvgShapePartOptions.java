package dev.reuise.web.backend.graphics.svg;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.core.graphics.svg.WebSvgShapePartOptions;
public interface WebBackendSvgShapePartOptions extends WebSvgShapePartOptions {
    WebBackendSvgPartOptions getSvgPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendSvgShape getComponent();
}