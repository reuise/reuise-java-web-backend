package dev.reuise.web.backend.table;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.table.CoreTableColumnOptions;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.checkbox.WebBackendCheckbox;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.table.DefaultWebCheckboxTableColumnPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
// Option: Label - CORE
// Option: MenuOptions - CORE
// Option: HasMenuButton - CORE
// Option: MenuButtonOptions - CORE
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
// base comp: tableColumn
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
public abstract class DefaultWebBackendCheckboxTableColumn<S extends DefaultWebBackendCheckboxTableColumn<S, O>, O extends WebBackendCheckboxTableColumnOptions> extends DefaultWebCheckboxTableColumnPart<S, O> implements WebBackendComponentType<S, O> , WebBackendCheckboxTableColumn {
    protected final WebBackendTableColumnPart tableColumnPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendCheckboxTableColumn(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        tableColumnPart = options.getComponentFactory().createTableColumn(((CoreTableColumnOptions) (options.getTableColumnPart())));
        parentComponentPart = tableColumnPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, tableColumnPart);
    }

    public WebBackendTableColumnPart getTableColumnPart() {
        return tableColumnPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return tableColumnPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        super.setRootComponent(rootComponent);
        this.tableColumnPart.setRootComponent(rootComponent);
        if (checkbox != null)
            checkbox.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return tableColumnPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (checkbox != null)
            checkbox.setTheme(theme);

        this.tableColumnPart.setTheme(theme);
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
        tableColumnPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        tableColumnPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        tableColumnPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        tableColumnPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        tableColumnPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (tableColumnPart == null)
            return false;

        return tableColumnPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return tableColumnPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        tableColumnPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return tableColumnPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        tableColumnPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        tableColumnPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        tableColumnPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        tableColumnPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return tableColumnPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return tableColumnPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        tableColumnPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return tableColumnPart.getData(data);
    }

    public boolean hasData(String data) {
        return tableColumnPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        tableColumnPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return tableColumnPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return tableColumnPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return tableColumnPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return tableColumnPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return tableColumnPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return tableColumnPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return tableColumnPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        tableColumnPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return tableColumnPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return tableColumnPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return tableColumnPart.hasWrapper();
    }

    public boolean isInitialized() {
        return tableColumnPart.isInitialized();
    }

    public void log(Object obj) {
        tableColumnPart.log(obj);
    }

    public void removeFromParent() {
        tableColumnPart.removeFromParent();
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
    public WebBackendCheckboxTableColumn getComponent() {
        return ((WebBackendCheckboxTableColumn) (baseComponentPart.getComponent()));
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
        tableColumnPart.onInitializeComponentType(rootComponent);
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