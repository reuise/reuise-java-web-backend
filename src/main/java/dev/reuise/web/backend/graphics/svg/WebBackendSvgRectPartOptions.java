package dev.reuise.web.backend.graphics.svg;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.core.graphics.svg.WebSvgRectPartOptions;
public interface WebBackendSvgRectPartOptions extends WebSvgRectPartOptions {
    WebBackendSvgShapePartOptions getSvgShapePart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendSvgRect getComponent();
}