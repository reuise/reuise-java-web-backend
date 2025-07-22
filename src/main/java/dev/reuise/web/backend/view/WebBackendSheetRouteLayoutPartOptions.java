package dev.reuise.web.backend.view;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.layout.WebBackendSheetLayoutPartOptions;
import dev.reuise.web.core.view.RouteOptions;
import dev.reuise.web.core.view.RouteViewBeforeRevealHandler;
import dev.reuise.web.core.view.RouteViewRevealHandler;
import dev.reuise.web.core.view.RouteViewRevealer;
import dev.reuise.web.core.view.WebSheetRouteLayoutPartOptions;
import dev.reuise.web.core.view.WebView;
import java.util.List;
// Url here??
// Routes here??
// RouteViewRevealer here??
// RevealHandlers here??
// BeforeRevealHandlers here??
// CurrentView here??
public interface WebBackendSheetRouteLayoutPartOptions extends WebSheetRouteLayoutPartOptions {
    WebBackendSheetLayoutPartOptions getSheetLayoutPart();

    String getUrl();

    WebBackendSheetRouteLayoutPartOptions setUrl(String url);

    List<RouteOptions> getRoutes();

    WebBackendSheetRouteLayoutPartOptions setRoutes(List<RouteOptions> routes);

    WebBackendSheetRouteLayoutPartOptions addRoute(RouteOptions route);

    WebBackendSheetRouteLayoutPartOptions removeRoute(RouteOptions route);

    boolean hasRoute(RouteOptions route);

    RouteViewRevealer getRouteViewRevealer();

    WebBackendSheetRouteLayoutPartOptions setRouteViewRevealer(RouteViewRevealer routeViewRevealer);

    List<RouteViewRevealHandler> getRevealHandlers();

    WebBackendSheetRouteLayoutPartOptions setRevealHandlers(List<RouteViewRevealHandler> revealHandlers);

    WebBackendSheetRouteLayoutPartOptions addRevealHandler(RouteViewRevealHandler revealHandler);

    WebBackendSheetRouteLayoutPartOptions setRevealHandler(RouteViewRevealHandler revealHandler);

    WebBackendSheetRouteLayoutPartOptions removeRevealHandler(RouteViewRevealHandler revealHandler);

    List<RouteViewBeforeRevealHandler> getBeforeRevealHandlers();

    WebBackendSheetRouteLayoutPartOptions setBeforeRevealHandlers(List<RouteViewBeforeRevealHandler> beforeRevealHandlers);

    WebBackendSheetRouteLayoutPartOptions addBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebBackendSheetRouteLayoutPartOptions setBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebBackendSheetRouteLayoutPartOptions removeBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebView getCurrentView();

    WebBackendSheetRouteLayoutPartOptions setCurrentView(WebView currentView);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendSheetRouteLayoutPartOptions setRouteLayoutCreator(ComponentCreator<? extends WebBackendRouteLayout, ? extends WebBackendRouteLayoutOptions> routeLayoutCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendSheetRouteLayout getComponent();
}