package dev.reuise.web.backend.chip;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.chip.CoreChipOptions;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.text.WebBackendLabel;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.chip.DefaultWebFilterChipPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
// Option: Label - CORE
// Option: Value - CORE
// Option: Size - CORE
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
// base comp: chip
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
public abstract class DefaultWebBackendFilterChip<S extends DefaultWebBackendFilterChip<S, O>, O extends WebBackendFilterChipOptions> extends DefaultWebFilterChipPart<S, O> implements WebBackendComponentType<S, O> , WebBackendFilterChip {
    protected final WebBackendChipPart chipPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendFilterChip(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        chipPart = options.getComponentFactory().createChip(((CoreChipOptions) (options.getChipPart())));
        parentComponentPart = chipPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, chipPart);
    }

    public WebBackendChipPart getChipPart() {
        return chipPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return chipPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.chipPart.setRootComponent(rootComponent);
    }

    @Override
    public Theme getTheme() {
        return chipPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.chipPart.setTheme(theme);
        return self();
    }

    @Override
    public WebBackendIcon getStartIcon() {
        return chipPart.getStartIcon();
    }

    @Override
    public WebBackendLabel getLabelContainer() {
        return chipPart.getLabelContainer();
    }

    @Override
    public WebBackendIcon getEndIcon() {
        return chipPart.getEndIcon();
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
        chipPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        chipPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        chipPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        chipPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        chipPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (chipPart == null)
            return false;

        return chipPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return chipPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        chipPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return chipPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        chipPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        chipPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        chipPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        chipPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return chipPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return chipPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        chipPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return chipPart.getData(data);
    }

    public boolean hasData(String data) {
        return chipPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        chipPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return chipPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return chipPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return chipPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return chipPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return chipPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return chipPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return chipPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        chipPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return chipPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return chipPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return chipPart.hasWrapper();
    }

    public boolean isInitialized() {
        return chipPart.isInitialized();
    }

    public void log(Object obj) {
        chipPart.log(obj);
    }

    public void removeFromParent() {
        chipPart.removeFromParent();
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
    public WebBackendFilterChip getComponent() {
        return ((WebBackendFilterChip) (baseComponentPart.getComponent()));
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
        chipPart.onInitializeComponentType(rootComponent);
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