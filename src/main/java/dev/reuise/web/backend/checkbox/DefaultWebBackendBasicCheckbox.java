package dev.reuise.web.backend.checkbox;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.basecomponent.CoreBaseComponentOptions;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.checkbox.DefaultWebBasicCheckboxPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
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
public abstract class DefaultWebBackendBasicCheckbox<S extends DefaultWebBackendBasicCheckbox<S, O>, O extends WebBackendBasicCheckboxOptions> extends DefaultWebBasicCheckboxPart<S, O> implements WebBackendBasicCheckbox , WebBackendComponentType<S, O> {
    @Override
    public boolean isChecked() {
        return hasAttribute("checked");
    }

    @Override
    public S setChecked(Boolean checked) {
        setAttribute("checked", "checked");
        return self();
    }

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendBasicCheckbox(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        baseComponentPart = options.getComponentFactory().createBaseComponent(((CoreBaseComponentOptions) (options.getBaseComponentPart())));
        addPart(ComponentPart.Type.BASE, baseComponentPart);
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
        baseComponentPart.writeTo(writer);
    }

    public void writeStartTag(PrintWriter writer) {
        baseComponentPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        baseComponentPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        baseComponentPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        baseComponentPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        baseComponentPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (baseComponentPart == null)
            return false;

        return baseComponentPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return baseComponentPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        baseComponentPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return baseComponentPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        baseComponentPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        baseComponentPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        baseComponentPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        baseComponentPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return baseComponentPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return baseComponentPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        baseComponentPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return baseComponentPart.getData(data);
    }

    public boolean hasData(String data) {
        return baseComponentPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        baseComponentPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return baseComponentPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return baseComponentPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return baseComponentPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return baseComponentPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return baseComponentPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return baseComponentPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return baseComponentPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        baseComponentPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return baseComponentPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return baseComponentPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return baseComponentPart.hasWrapper();
    }

    public boolean isInitialized() {
        return baseComponentPart.isInitialized();
    }

    public void log(Object obj) {
        baseComponentPart.log(obj);
    }

    public void removeFromParent() {
        baseComponentPart.removeFromParent();
    }

    @Override
    public WebBackendComponentFactory getComponentFactory() {
        return ((WebBackendComponentFactory) (baseComponentPart.getComponentFactory()));
    }

    public WebBackendBaseComponentPart getBaseComponentPart() {
        return baseComponentPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return baseComponentPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.baseComponentPart.setRootComponent(rootComponent);
    }

    @Override
    public Theme getTheme() {
        return baseComponentPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.baseComponentPart.setTheme(theme);
        return self();
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
    public WebBackendBasicCheckbox getComponent() {
        return ((WebBackendBasicCheckbox) (baseComponentPart.getComponent()));
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
        baseComponentPart.onInitializeComponentType(rootComponent);
        onInitializeCommonStyle(((WebRootComponent) (rootComponent)).getCommonStyles());
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }
}