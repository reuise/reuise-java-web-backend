package dev.reuise.web.backend.view;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendSheetLayoutPart;
import dev.reuise.web.core.view.RouteOptions;
import dev.reuise.web.core.view.RouteViewBeforeRevealHandler;
import dev.reuise.web.core.view.RouteViewRevealHandler;
import dev.reuise.web.core.view.RouteViewRevealer;
import dev.reuise.web.core.view.WebSheetRouteLayoutPart;
import dev.reuise.web.core.view.WebView;
import java.util.List;
// Url here??
// Routes here??
// RouteViewRevealer here??
// RevealHandlers here??
// BeforeRevealHandlers here??
// CurrentView here??
public interface WebBackendSheetRouteLayoutPart extends WebBackendSheetRouteLayoutFeatures , WebSheetRouteLayoutPart , WebBackendComponentPart , WebBackendSheetLayoutPart {
    String getUrl();

    WebBackendSheetRouteLayoutPart setUrl(String url);

    List<RouteOptions> getRoutes();

    WebBackendSheetRouteLayoutPart setRoutes(List<RouteOptions> routes);

    WebBackendSheetRouteLayoutPart addRoute(RouteOptions route);

    WebBackendSheetRouteLayoutPart removeRoute(RouteOptions route);

    boolean hasRoute(RouteOptions route);

    RouteViewRevealer getRouteViewRevealer();

    WebBackendSheetRouteLayoutPart setRouteViewRevealer(RouteViewRevealer routeViewRevealer);

    List<RouteViewRevealHandler> getRevealHandlers();

    WebBackendSheetRouteLayoutPart setRevealHandlers(List<RouteViewRevealHandler> revealHandlers);

    WebBackendSheetRouteLayoutPart addRevealHandler(RouteViewRevealHandler revealHandler);

    WebBackendSheetRouteLayoutPart setRevealHandler(RouteViewRevealHandler revealHandler);

    WebBackendSheetRouteLayoutPart removeRevealHandler(RouteViewRevealHandler revealHandler);

    List<RouteViewBeforeRevealHandler> getBeforeRevealHandlers();

    WebBackendSheetRouteLayoutPart setBeforeRevealHandlers(List<RouteViewBeforeRevealHandler> beforeRevealHandlers);

    WebBackendSheetRouteLayoutPart addBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebBackendSheetRouteLayoutPart setBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebBackendSheetRouteLayoutPart removeBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebView getCurrentView();

    WebBackendSheetRouteLayoutPart setCurrentView(WebView currentView);

    WebBackendRouteLayout getRouteLayout();

    WebBackendSheetLayoutPart getSheetLayoutPart();
}