package dev.reuise.web.backend.navigation;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.accordion.CoreAccordionItemOptions;
import dev.reuise.core.layout.BackdropFilter;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.accordion.WebBackendAccordionItemPart;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.hydration.ClientConfigurationSource;
import dev.reuise.web.core.navigation.DefaultWebNavigationTreeGroupPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
// Option: Expanded - CORE
// Option: ToggleAtEnd - CORE
// Option: Direction - CORE
// Option: JustifyContent - CORE
// Option: AlignItems - CORE
// Option: ColumnGap - CORE
// Option: RowGap - CORE
// Option: Gap - CORE
// Option: Wrap - CORE
// Option: Animation - WEB
// Option: Padding - CORE
// Option: PaddingTop - CORE
// Option: PaddingRight - CORE
// Option: PaddingBottom - CORE
// Option: PaddingLeft - CORE
// Option: Position - CORE
// Option: Inset - CORE
// Option: BackdropFilter - CORE
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
// Option: LocaleContext - CORE
// Option: LinkUrlResolver - CORE
// Option: Wrapper - CORE
// Option: Theme - CORE
// Option: Visible - CORE
// Option: Enabled - CORE
// Option: Focused - CORE
// Option: Debug - CORE
// Option: DebugId - CORE
// base comp: accordionItem
// add composition for accordionItem: toggle
// base comp: flexContainer
// base comp: container
// add composition for container: startAnimation
// add composition for container: cancelAnimation
// add composition for container: addMarkdown
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
public abstract class DefaultWebBackendNavigationTreeGroup<S extends DefaultWebBackendNavigationTreeGroup<S, O>, O extends WebBackendNavigationTreeGroupOptions> extends DefaultWebNavigationTreeGroupPart<S, O> implements WebBackendNavigationTreeGroup , ClientConfigurationSource , WebBackendComponentType<S, O> {
    protected final WebBackendAccordionItemPart accordionItemPart;

    protected final WebBackendFlexContainerPart flexContainerPart;

    protected final WebBackendContainerPart containerPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendNavigationTreeGroup(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        accordionItemPart = options.getComponentFactory().createAccordionItem(((CoreAccordionItemOptions) (options.getAccordionItemPart())));
        flexContainerPart = accordionItemPart.getFlexContainerPart();
        containerPart = flexContainerPart.getContainerPart();
        parentComponentPart = containerPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, accordionItemPart);
    }

    public S toggle() {
        accordionItemPart.toggle();
        return self();
    }

    public WebBackendAccordionItemPart getAccordionItemPart() {
        return accordionItemPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return accordionItemPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        super.setRootComponent(rootComponent);
        this.accordionItemPart.setRootComponent(rootComponent);
        if (link != null)
            link.setRootComponent(rootComponent);

        if (tree != null)
            tree.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return accordionItemPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (link != null)
            link.setTheme(theme);

        if (tree != null)
            tree.setTheme(theme);

        this.accordionItemPart.setTheme(theme);
        return self();
    }

    @Override
    public WebBackendFlexContainer getHeader() {
        return accordionItemPart.getHeader();
    }

    @Override
    public WebBackendButton getToggle() {
        return accordionItemPart.getToggle();
    }

    @Override
    public WebBackendContainer getContent() {
        return accordionItemPart.getContent();
    }

    public WebBackendFlexContainerPart getFlexContainerPart() {
        return flexContainerPart;
    }

    @Override
    public S setBackdropFilter(BackdropFilter backdropFilter, Object value) {
        this.containerPart.setBackdropFilter(backdropFilter, value);
        return self();
    }

    public S startAnimation() {
        accordionItemPart.startAnimation();
        return self();
    }

    public S cancelAnimation() {
        accordionItemPart.cancelAnimation();
        return self();
    }

    public S addMarkdown(String markdown) {
        accordionItemPart.addMarkdown(markdown);
        return self();
    }

    public WebBackendContainerPart getContainerPart() {
        return containerPart;
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
        accordionItemPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        accordionItemPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        accordionItemPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        accordionItemPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        accordionItemPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (accordionItemPart == null)
            return false;

        return accordionItemPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return accordionItemPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        accordionItemPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return accordionItemPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        accordionItemPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        accordionItemPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        accordionItemPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        accordionItemPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return accordionItemPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return accordionItemPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        accordionItemPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return accordionItemPart.getData(data);
    }

    public boolean hasData(String data) {
        return accordionItemPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        accordionItemPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return accordionItemPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return accordionItemPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return accordionItemPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return accordionItemPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return accordionItemPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return accordionItemPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return accordionItemPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        accordionItemPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return accordionItemPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return accordionItemPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return accordionItemPart.hasWrapper();
    }

    public boolean isInitialized() {
        return accordionItemPart.isInitialized();
    }

    public void log(Object obj) {
        accordionItemPart.log(obj);
    }

    public void removeFromParent() {
        accordionItemPart.removeFromParent();
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
    public WebBackendNavigationTreeGroup getComponent() {
        return ((WebBackendNavigationTreeGroup) (baseComponentPart.getComponent()));
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
        accordionItemPart.onInitializeComponentType(rootComponent);
        onInitializeCommonStyle(((WebRootComponent) (rootComponent)).getCommonStyles());
    }

    @Override
    public WebBackendNavigationTreeLink getLink() {
        return ((WebBackendNavigationTreeLink) (super.getLink()));
    }

    @Override
    public WebBackendNavigationTree getTree() {
        return ((WebBackendNavigationTree) (super.getTree()));
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

    public Map<String, Object> getClientConfiguration() {
        java.util.Map<String, Object> values = new java.util.LinkedHashMap<>();
        values.put("tooltip", getTooltip());
        values.put("contentEditable", isContentEditable());
        values.put("enabled", isEnabled());
        values.put("expanded", isExpanded());
        values.put("toggleAtEnd", isToggleAtEnd());
        return dev.reuise.web.core.hydration.ClientConfiguration.snapshot("NavigationTreeGroup", values);
    }
}
