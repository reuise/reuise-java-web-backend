package dev.reuise.web.backend.navigation;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.accordion.WebBackendAccordionItemPartOptions;
import dev.reuise.web.core.navigation.WebNavigationTreeGroupPartOptions;
public interface WebBackendNavigationTreeGroupPartOptions extends WebNavigationTreeGroupPartOptions {
    WebBackendAccordionItemPartOptions getAccordionItemPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendNavigationTreeGroupPartOptions setLinkCreator(ComponentCreator<? extends WebBackendNavigationTreeLink, ? extends WebBackendNavigationTreeLinkOptions> linkCreator);

    WebBackendNavigationTreeGroupPartOptions setTreeCreator(ComponentCreator<? extends WebBackendNavigationTree, ? extends WebBackendNavigationTreeOptions> treeCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendNavigationTreeGroup getComponent();
}
