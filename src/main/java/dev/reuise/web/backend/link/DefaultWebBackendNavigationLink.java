package dev.reuise.web.backend.link;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.link.DefaultWebNavigationLinkPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
// Option: UseHistoryApi - WEB
// Option: Text - CORE
// Option: Url - CORE
// Option: Target - CORE
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
// base comp: link
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
public abstract class DefaultWebBackendNavigationLink<S extends DefaultWebBackendNavigationLink<S, O>, O extends WebBackendNavigationLinkOptions> extends DefaultWebNavigationLinkPart<S, O> implements WebBackendNavigationLink , WebBackendComponentType<S, O> {
    protected final WebBackendLinkPart linkPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendNavigationLink(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        linkPart = options.getComponentFactory().createLink(((CoreLinkOptions) (options.getLinkPart())));
        parentComponentPart = linkPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, linkPart);
    }

    @Override
    public S setUrl(String url, Boolean useHistoryApi) {
        this.linkPart.setUrl(url, useHistoryApi);
        return self();
    }

    public WebBackendLinkPart getLinkPart() {
        return linkPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return linkPart.getRootComponent();
    }

    // Implementation
    @Override
    public void setRootComponent(RootComponent rootComponent) {
        if (rootComponent == null)
            return;

        this.parentComponentPart.setRootComponent(rootComponent);
        this.baseComponentPart.setRootComponent(rootComponent);
        String urlPath = ((WebRootComponent) (rootComponent)).getPath();
        String urlOpt = getUrl();
        setActive(checkPathMatch(urlOpt, urlPath));
    }

    @Override
    public Theme getTheme() {
        return linkPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.linkPart.setTheme(theme);
        return self();
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

    public void writeStartTag(PrintWriter writer) {
        linkPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        linkPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        linkPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        linkPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        linkPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (linkPart == null)
            return false;

        return linkPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return linkPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        linkPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return linkPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        linkPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        linkPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        linkPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        linkPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return linkPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return linkPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        linkPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return linkPart.getData(data);
    }

    public boolean hasData(String data) {
        return linkPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        linkPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return linkPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return linkPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return linkPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return linkPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return linkPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return linkPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return linkPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        linkPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return linkPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return linkPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return linkPart.hasWrapper();
    }

    public boolean isInitialized() {
        return linkPart.isInitialized();
    }

    public void log(Object obj) {
        linkPart.log(obj);
    }

    public void removeFromParent() {
        linkPart.removeFromParent();
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
    public WebBackendNavigationLink getComponent() {
        return ((WebBackendNavigationLink) (baseComponentPart.getComponent()));
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
        linkPart.onInitializeComponentType(rootComponent);
        onInitializeCommonStyle(((WebRootComponent) (rootComponent)).getCommonStyles());
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }

    @Override
    public void writeTo(PrintWriter writer) {
        writeStartTag(writer);
        parentComponentPart.writeTo(writer);
        writeEndTag(writer);
    }
}