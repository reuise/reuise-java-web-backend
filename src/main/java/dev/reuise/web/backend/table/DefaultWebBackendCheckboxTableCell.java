package dev.reuise.web.backend.table;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.table.CoreTableCellOptions;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.checkbox.WebBackendCheckbox;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.table.DefaultWebCheckboxTableCellPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
// Option: Text - CORE
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
// base comp: tableCell
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
public abstract class DefaultWebBackendCheckboxTableCell<S extends DefaultWebBackendCheckboxTableCell<S, O>, O extends WebBackendCheckboxTableCellOptions> extends DefaultWebCheckboxTableCellPart<S, O> implements WebBackendComponentType<S, O> , WebBackendCheckboxTableCell {
    protected final WebBackendTableCellPart tableCellPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendCheckboxTableCell(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        tableCellPart = options.getComponentFactory().createTableCell(((CoreTableCellOptions) (options.getTableCellPart())));
        parentComponentPart = tableCellPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, tableCellPart);
    }

    public WebBackendTableCellPart getTableCellPart() {
        return tableCellPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return tableCellPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        super.setRootComponent(rootComponent);
        this.tableCellPart.setRootComponent(rootComponent);
        if (checkbox != null)
            checkbox.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return tableCellPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (checkbox != null)
            checkbox.setTheme(theme);

        this.tableCellPart.setTheme(theme);
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
        tableCellPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        tableCellPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        tableCellPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        tableCellPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        tableCellPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (tableCellPart == null)
            return false;

        return tableCellPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return tableCellPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        tableCellPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return tableCellPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        tableCellPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        tableCellPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        tableCellPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        tableCellPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return tableCellPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return tableCellPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        tableCellPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return tableCellPart.getData(data);
    }

    public boolean hasData(String data) {
        return tableCellPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        tableCellPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return tableCellPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return tableCellPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return tableCellPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return tableCellPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return tableCellPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return tableCellPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return tableCellPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        tableCellPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return tableCellPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return tableCellPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return tableCellPart.hasWrapper();
    }

    public boolean isInitialized() {
        return tableCellPart.isInitialized();
    }

    public void log(Object obj) {
        tableCellPart.log(obj);
    }

    public void removeFromParent() {
        tableCellPart.removeFromParent();
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
    public WebBackendCheckboxTableCell getComponent() {
        return ((WebBackendCheckboxTableCell) (baseComponentPart.getComponent()));
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
        tableCellPart.onInitializeComponentType(rootComponent);
        onInitializeCommonStyle(((WebRootComponent) (rootComponent)).getCommonStyles());
    }

    @Override
    public WebBackendCheckbox getCheckbox() {
        return ((WebBackendCheckbox) (super.getCheckbox()));
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