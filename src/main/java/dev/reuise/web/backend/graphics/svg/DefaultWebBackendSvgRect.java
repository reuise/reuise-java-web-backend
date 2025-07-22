package dev.reuise.web.backend.graphics.svg;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.ClassResource;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.graphics.svg.DefaultWebSvgRectPart;
import dev.reuise.web.core.graphics.svg.WebSvgPath;
import dev.reuise.web.core.graphics.svg.WebSvgPathOptions;
import dev.reuise.web.core.graphics.svg.WebSvgShapeOptions;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
// Option: Fill - WEB
// Option: Stroke - WEB
// Option: StrokeWidth - WEB
// Option: SourceResource - WEB_BACKEND
// Option: X - WEB
// Option: Y - WEB
// Option: ViewBox - WEB
// Option: Children - CORE
// Option: Id - WEB
// Option: TagName - WEB
// Option: XmlNamespace - WEB
// Option: Tooltip - WEB
// Option: BaseStyleClass - WEB
// Option: Attributes - WEB
// Option: StyleClasses - WEB
// Option: Data - WEB
// Option: Style - WEB
// Option: InlineStyle - WEB
// Option: Rehydration - WEB
// Option: ContentEditable - WEB
// Option: StoreInElementOptions - WEB
// Option: Mounted - CORE
// Option: Margin - CORE
// Option: MarginTop - CORE
// Option: MarginRight - CORE
// Option: MarginBottom - CORE
// Option: MarginLeft - CORE
// Option: Width - CORE
// Option: MinWidth - CORE
// Option: MaxWidth - CORE
// Option: Height - CORE
// Option: MinHeight - CORE
// Option: MaxHeight - CORE
// Option: RequiredLayoutComponent - CORE
// Option: Parent - CORE
// Option: Wrapper - CORE
// Option: Theme - CORE
// Option: Visible - CORE
// Option: Enabled - CORE
// Option: Focused - CORE
// Option: Debug - CORE
// Option: DebugId - CORE
// base comp: svgShape
// base comp: svg
// add composition for svg: loadFromResource
// add composition for svg: addPath
// add composition for svg: addPath
// add composition for svg: addPath
// add composition for svg: addFillPath
// add composition for svg: addStrokePath
// add composition for svg: addStrokePath
// add composition for svg: addPath
// base comp: parentComponent
// base comp: baseComponent
// add composition for baseComponent: writeTo
// add composition for baseComponent: writeStartTag
// add composition for baseComponent: writeStartTag
// add composition for baseComponent: writeStartTag
// add composition for baseComponent: writeEndTag
// add composition for baseComponent: writeEndTag
// add composition for baseComponent: isRehydrated
// add composition for baseComponent: getComputedStyle
// add composition for baseComponent: addOrRemoveStyleClass
// add composition for baseComponent: hasStyleClass
// add composition for baseComponent: removeStyleClass
// add composition for baseComponent: setAttribute
// add composition for baseComponent: removeAttribute
// add composition for baseComponent: getAttribute
// add composition for baseComponent: hasAttribute
// add composition for baseComponent: setData
// add composition for baseComponent: getData
// add composition for baseComponent: hasData
// add composition for baseComponent: setAria
// add composition for baseComponent: getAria
// add composition for baseComponent: hasAria
// add composition for baseComponent: getUniqueId
// add composition for baseComponent: getUniqueStyleClass
// add composition for baseComponent: getStyleSheetId
// add composition for baseComponent: getStyleStates
// add composition for baseComponent: setStyleSheetFactory
// add composition for baseComponent: getStyle
// add composition for baseComponent: hasWrapper
// add composition for baseComponent: isInitialized
// add composition for baseComponent: log
// add composition for baseComponent: removeFromParent
public abstract class DefaultWebBackendSvgRect<S extends DefaultWebBackendSvgRect<S, O>, O extends WebBackendSvgRectOptions> extends DefaultWebSvgRectPart<S, O> implements WebBackendComponentType<S, O> , WebBackendSvgRect {
    protected final WebBackendSvgShapePart svgShapePart;

    protected final WebBackendSvgPart svgPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendSvgRect(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        svgShapePart = options.getComponentFactory().createSvgShape(((WebSvgShapeOptions) (options.getSvgShapePart())));
        svgPart = svgShapePart.getSvgPart();
        parentComponentPart = svgPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, svgShapePart);
    }

    public WebBackendSvgShapePart getSvgShapePart() {
        return svgShapePart;
    }

    @Override
    public RootComponent getRootComponent() {
        return svgShapePart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.svgShapePart.setRootComponent(rootComponent);
    }

    @Override
    public Theme getTheme() {
        return svgShapePart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.svgShapePart.setTheme(theme);
        return self();
    }

    @Override
    public ClassResource getSourceResource() {
        return svgPart.getSourceResource();
    }

    @Override
    public S setSourceResource(ClassResource sourceResource) {
        this.svgPart.setSourceResource(sourceResource);
        return self();
    }

    public void loadFromResource(String path) {
        svgShapePart.loadFromResource(path);
    }

    public void loadFromResource(String path, Class<? extends Object> clazz) {
        svgShapePart.loadFromResource(path, clazz);
    }

    public WebSvgPath addPath(String path) {
        return svgShapePart.addPath(path);
    }

    public WebSvgPath addPath(String path, String fill, String stroke, double strokeWidth) {
        return svgShapePart.addPath(path, fill, stroke, strokeWidth);
    }

    public WebSvgPath addPath(String path, String fill, String stroke) {
        return svgShapePart.addPath(path, fill, stroke);
    }

    public WebSvgPath addFillPath(String path, String fill) {
        return svgShapePart.addFillPath(path, fill);
    }

    public WebSvgPath addStrokePath(String path, String stroke, double strokeWidth) {
        return svgShapePart.addStrokePath(path, stroke, strokeWidth);
    }

    public WebSvgPath addStrokePath(String path, String stroke) {
        return svgShapePart.addStrokePath(path, stroke);
    }

    public WebSvgPath addPath(WebSvgPathOptions options) {
        return svgShapePart.addPath(options);
    }

    public WebBackendSvgPart getSvgPart() {
        return svgPart;
    }

    public WebBackendParentComponentPart getParentComponentPart() {
        return parentComponentPart;
    }

    @Override
    public S setRehydration(String rehydration, Boolean canFail) {
        this.baseComponentPart.setRehydration(rehydration, canFail);
        return self();
    }

    @Override
    public S setRehydration(String selector, CoreComponent parent) {
        this.baseComponentPart.setRehydration(selector, parent);
        return self();
    }

    @Override
    public S setRehydration(String selector, CoreComponent parent, Boolean canFail) {
        this.baseComponentPart.setRehydration(selector, parent, canFail);
        return self();
    }

    public void writeTo(PrintWriter writer) {
        svgShapePart.writeTo(writer);
    }

    public void writeStartTag(PrintWriter writer) {
        svgShapePart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        svgShapePart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        svgShapePart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        svgShapePart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        svgShapePart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (svgShapePart == null)
            return false;

        return svgShapePart.isRehydrated();
    }

    public Style getComputedStyle() {
        return svgShapePart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        svgShapePart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return svgShapePart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        svgShapePart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        svgShapePart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        svgShapePart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        svgShapePart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return svgShapePart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return svgShapePart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        svgShapePart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return svgShapePart.getData(data);
    }

    public boolean hasData(String data) {
        return svgShapePart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        svgShapePart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return svgShapePart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return svgShapePart.hasAria(attribute);
    }

    public String getUniqueId() {
        return svgShapePart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return svgShapePart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return svgShapePart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return svgShapePart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return svgShapePart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        svgShapePart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return svgShapePart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return svgShapePart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return svgShapePart.hasWrapper();
    }

    public boolean isInitialized() {
        return svgShapePart.isInitialized();
    }

    public void log(Object obj) {
        svgShapePart.log(obj);
    }

    public void removeFromParent() {
        svgShapePart.removeFromParent();
    }

    @Override
    public WebBackendComponentFactory getComponentFactory() {
        return ((WebBackendComponentFactory) (baseComponentPart.getComponentFactory()));
    }

    public WebBackendBaseComponentPart getBaseComponentPart() {
        return baseComponentPart;
    }

    @Override
    public void addPart(ComponentPart.Type type, ComponentPart part) {
        baseComponentPart.addPart(type, part);
    }

    @Override
    public <C extends ComponentType<?, T>, T extends CoreComponentOptions> void initialize(C component, T options) {
        setupReferences();
        baseComponentPart.initialize(component, options);
    }

    @Override
    public WebBackendSvgRect getComponent() {
        return ((WebBackendSvgRect) (baseComponentPart.getComponent()));
    }

    public boolean onPreInitialize(O options) {
        if (!super.onPreInitialize(options))
            return false;

        return true;
    }

    public void onInitialize(O options) {
        super.onInitialize(options);
    }

    public void onCreate(O options) {
        super.onCreate(options);
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        super.applyOptions(options, applicator, states);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        if (isRehydrated() || ((WebRootComponent) (rootComponent)).isComponentTypeRegistered(getComponent().getClass()))
            return;

        super.onInitializeComponentType(rootComponent);
        svgShapePart.onInitializeComponentType(rootComponent);
        onInitializeCommonStyle(((WebRootComponent) (rootComponent)).getCommonStyles());
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }
}