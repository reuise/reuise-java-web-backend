package dev.reuise.web.backend.icon;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.graphics.svg.WebBackendSvg;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgOptions;
import dev.reuise.web.backend.image.WebBackendImage;
import dev.reuise.web.backend.image.WebBackendImageOptions;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.backend.link.WebBackendLinkOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.icon.WebIconPartOptions;
public interface WebBackendIconPartOptions extends WebIconPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendIconPartOptions setSvgCreator(ComponentCreator<? extends WebBackendSvg, ? extends WebBackendSvgOptions> svgCreator);

    WebBackendIconPartOptions setLinkCreator(ComponentCreator<? extends WebBackendLink, ? extends WebBackendLinkOptions> linkCreator);

    WebBackendIconPartOptions setImageCreator(ComponentCreator<? extends WebBackendImage, ? extends WebBackendImageOptions> imageCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendIcon getComponent();
}