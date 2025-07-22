package dev.reuise.web.backend.graphics.svg;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.backend.ClassResource;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.graphics.svg.WebSvgPartOptions;
public interface WebBackendSvgPartOptions extends WebSvgPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    ClassResource getSourceResource();

    ComponentOption<ClassResource> getSourceResourceOption();

    WebBackendSvgPartOptions setSourceResource(ClassResource sourceResource);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendSvg getComponent();
}