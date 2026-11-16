package dev.reuise.web.backend.layout;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.layout.BackdropFilter;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.hydration.ClientConfigurationSource;
import dev.reuise.web.core.layout.DefaultWebFieldSetPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
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
public abstract class DefaultWebBackendFieldSet<S extends DefaultWebBackendFieldSet<S, O>, O extends WebBackendFieldSetOptions> extends DefaultWebFieldSetPart<S, O> implements WebBackendFieldSet , ClientConfigurationSource , WebBackendComponentType<S, O> {
    protected final WebBackendContainerPart containerPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected String label;

    protected DefaultWebBackendFieldSet(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        containerPart = options.getComponentFactory().createContainer(((CoreContainerOptions) (options.getContainerPart())));
        parentComponentPart = containerPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, containerPart);
    }

    @Override
    public S setBackdropFilter(BackdropFilter backdropFilter, Object value) {
        this.containerPart.setBackdropFilter(backdropFilter, value);
        return self();
    }

    public S startAnimation() {
        containerPart.startAnimation();
        return self();
    }

    public S cancelAnimation() {
        containerPart.cancelAnimation();
        return self();
    }

    public S addMarkdown(String markdown) {
        containerPart.addMarkdown(markdown);
        return self();
    }

    public WebBackendContainerPart getContainerPart() {
        return containerPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return containerPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.containerPart.setRootComponent(rootComponent);
    }

    @Override
    public Theme getTheme() {
        return containerPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.containerPart.setTheme(theme);
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
        containerPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        containerPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        containerPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        containerPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        containerPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (containerPart == null)
            return false;

        return containerPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return containerPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        containerPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return containerPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        containerPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        containerPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        containerPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        containerPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return containerPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return containerPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        containerPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return containerPart.getData(data);
    }

    public boolean hasData(String data) {
        return containerPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        containerPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return containerPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return containerPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return containerPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return containerPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return containerPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return containerPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return containerPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        containerPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return containerPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return containerPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return containerPart.hasWrapper();
    }

    public boolean isInitialized() {
        return containerPart.isInitialized();
    }

    public void log(Object obj) {
        containerPart.log(obj);
    }

    public void removeFromParent() {
        containerPart.removeFromParent();
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
    public WebBackendFieldSet getComponent() {
        return ((WebBackendFieldSet) (baseComponentPart.getComponent()));
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
        containerPart.onInitializeComponentType(rootComponent);
        onInitializeCommonStyle(((WebRootComponent) (rootComponent)).getCommonStyles());
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public S setLabel(String label) {
        this.label = label;
        return self();
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
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMargin())) values.put("margin", getMargin());
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMarginTop())) values.put("marginTop", getMarginTop());
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMarginRight())) values.put("marginRight", getMarginRight());
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMarginBottom())) values.put("marginBottom", getMarginBottom());
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMarginLeft())) values.put("marginLeft", getMarginLeft());
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getWidth())) values.put("width", getWidth());
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMinWidth())) values.put("minWidth", getMinWidth());
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMaxWidth())) values.put("maxWidth", getMaxWidth());
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getHeight())) values.put("height", getHeight());
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMinHeight())) values.put("minHeight", getMinHeight());
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMaxHeight())) values.put("maxHeight", getMaxHeight());
        values.put("visible", isVisible());
        values.put("enabled", isEnabled());
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getPadding())) values.put("padding", getPadding());
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getPaddingTop())) values.put("paddingTop", getPaddingTop());
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getPaddingRight())) values.put("paddingRight", getPaddingRight());
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getPaddingBottom())) values.put("paddingBottom", getPaddingBottom());
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getPaddingLeft())) values.put("paddingLeft", getPaddingLeft());
        values.put("position", getPosition());
        if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getInset())) values.put("inset", getInset());
        values.put("label", getLabel());
        java.util.List<java.util.Map<String, Object>> states = new java.util.ArrayList<>(); for (dev.reuise.core.State state : getStyleStates()) { if (state == null) continue; java.util.Map<String, Object> stateValues = new java.util.LinkedHashMap<>(); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMargin(state))) stateValues.put("margin", getMargin(state)); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMarginTop(state))) stateValues.put("marginTop", getMarginTop(state)); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMarginRight(state))) stateValues.put("marginRight", getMarginRight(state)); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMarginBottom(state))) stateValues.put("marginBottom", getMarginBottom(state)); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMarginLeft(state))) stateValues.put("marginLeft", getMarginLeft(state)); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getWidth(state))) stateValues.put("width", getWidth(state)); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMinWidth(state))) stateValues.put("minWidth", getMinWidth(state)); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMaxWidth(state))) stateValues.put("maxWidth", getMaxWidth(state)); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getHeight(state))) stateValues.put("height", getHeight(state)); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMinHeight(state))) stateValues.put("minHeight", getMinHeight(state)); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getMaxHeight(state))) stateValues.put("maxHeight", getMaxHeight(state)); stateValues.put("visible", isVisible(state)); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getPadding(state))) stateValues.put("padding", getPadding(state)); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getPaddingTop(state))) stateValues.put("paddingTop", getPaddingTop(state)); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getPaddingRight(state))) stateValues.put("paddingRight", getPaddingRight(state)); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getPaddingBottom(state))) stateValues.put("paddingBottom", getPaddingBottom(state)); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getPaddingLeft(state))) stateValues.put("paddingLeft", getPaddingLeft(state)); stateValues.put("position", getPosition(state)); if (dev.reuise.web.core.hydration.ClientConfiguration.isScalar(getInset(state))) stateValues.put("inset", getInset(state)); if (!stateValues.isEmpty()) states.add(dev.reuise.web.core.hydration.ClientConfiguration.state(state, stateValues)); };
        return dev.reuise.web.core.hydration.ClientConfiguration.snapshot("FieldSet", values, states);
    }
}
