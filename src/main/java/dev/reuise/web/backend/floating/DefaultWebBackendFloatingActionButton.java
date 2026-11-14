package dev.reuise.web.backend.floating;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.button.ButtonType;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.button.WebBackendButtonPart;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.floating.DefaultWebFloatingActionButtonPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
// Option: UseHistoryApi - WEB
// Option: Loading - CORE
// Option: SkeletonOptions - CORE
// Option: Label - CORE
// Option: Size - CORE
// Option: Type - CORE
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
// Option: LocaleContext - CORE
// Option: LinkUrlResolver - CORE
// Option: Wrapper - CORE
// Option: Theme - CORE
// Option: Visible - CORE
// Option: Enabled - CORE
// Option: Focused - CORE
// Option: Debug - CORE
// Option: DebugId - CORE
// base comp: button
// add composition for button: isType
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
public abstract class DefaultWebBackendFloatingActionButton<S extends DefaultWebBackendFloatingActionButton<S, O>, O extends WebBackendFloatingActionButtonOptions> extends DefaultWebFloatingActionButtonPart<S, O> implements WebBackendFloatingActionButton , WebBackendComponentType<S, O> {
    protected final WebBackendButtonPart buttonPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendFloatingActionButton(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        buttonPart = options.getComponentFactory().createButton(((CoreButtonOptions) (options.getButtonPart())));
        parentComponentPart = buttonPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, buttonPart);
    }

    @Override
    public S setUrl(String url, Boolean useHistoryApi) {
        this.buttonPart.setUrl(url, useHistoryApi);
        return self();
    }

    public boolean isType(ButtonType type) {
        return buttonPart.isType(type);
    }

    public WebBackendButtonPart getButtonPart() {
        return buttonPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return buttonPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        super.setRootComponent(rootComponent);
        this.buttonPart.setRootComponent(rootComponent);
        if (badge != null)
            badge.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return buttonPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (badge != null)
            badge.setTheme(theme);

        this.buttonPart.setTheme(theme);
        return self();
    }

    @Override
    public WebBackendIcon getStartIcon() {
        return buttonPart.getStartIcon();
    }

    @Override
    public WebBackendInlineText getLabelContainer() {
        return buttonPart.getLabelContainer();
    }

    @Override
    public WebBackendIcon getEndIcon() {
        return buttonPart.getEndIcon();
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
        buttonPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        buttonPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        buttonPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        buttonPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        buttonPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (buttonPart == null)
            return false;

        return buttonPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return buttonPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        buttonPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return buttonPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        buttonPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        buttonPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        buttonPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        buttonPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return buttonPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return buttonPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        buttonPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return buttonPart.getData(data);
    }

    public boolean hasData(String data) {
        return buttonPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        buttonPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return buttonPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return buttonPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return buttonPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return buttonPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return buttonPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return buttonPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return buttonPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        buttonPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return buttonPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return buttonPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return buttonPart.hasWrapper();
    }

    public boolean isInitialized() {
        return buttonPart.isInitialized();
    }

    public void log(Object obj) {
        buttonPart.log(obj);
    }

    public void removeFromParent() {
        buttonPart.removeFromParent();
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
    public WebBackendFloatingActionButton getComponent() {
        return ((WebBackendFloatingActionButton) (baseComponentPart.getComponent()));
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
        buttonPart.onInitializeComponentType(rootComponent);
        onInitializeCommonStyle(((WebRootComponent) (rootComponent)).getCommonStyles());
    }

    @Override
    public WebBackendInlineText getBadge() {
        return ((WebBackendInlineText) (super.getBadge()));
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
