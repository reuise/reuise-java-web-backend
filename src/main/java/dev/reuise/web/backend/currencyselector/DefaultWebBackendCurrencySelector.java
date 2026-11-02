package dev.reuise.web.backend.currencyselector;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.selectmenu.CoreSelectMenuOptions;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.input.WebBackendTextField;
import dev.reuise.web.backend.list.WebBackendListItem;
import dev.reuise.web.backend.menu.WebBackendMenu;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuPart;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.currencyselector.DefaultWebCurrencySelectorPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
// Option: Items - CORE
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
// base comp: selectMenu
// add composition for selectMenu: addItem
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
public abstract class DefaultWebBackendCurrencySelector<S extends DefaultWebBackendCurrencySelector<S, O>, O extends WebBackendCurrencySelectorOptions> extends DefaultWebCurrencySelectorPart<S, O> implements WebBackendCurrencySelector , WebBackendComponentType<S, O> {
    protected final WebBackendSelectMenuPart selectMenuPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendCurrencySelector(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        selectMenuPart = options.getComponentFactory().createSelectMenu(((CoreSelectMenuOptions) (options.getSelectMenuPart())));
        parentComponentPart = selectMenuPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, selectMenuPart);
    }

    public S addItem(WebBackendListItem item) {
        selectMenuPart.addItem(item);
        return self();
    }

    public S addItem(String text) {
        selectMenuPart.addItem(text);
        return self();
    }

    public WebBackendSelectMenuPart getSelectMenuPart() {
        return selectMenuPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return selectMenuPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.selectMenuPart.setRootComponent(rootComponent);
    }

    @Override
    public Theme getTheme() {
        return selectMenuPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.selectMenuPart.setTheme(theme);
        return self();
    }

    @Override
    public WebBackendTextField getTextField() {
        return selectMenuPart.getTextField();
    }

    @Override
    public WebBackendMenu getMenu() {
        return selectMenuPart.getMenu();
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
        selectMenuPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        selectMenuPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        selectMenuPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        selectMenuPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        selectMenuPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (selectMenuPart == null)
            return false;

        return selectMenuPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return selectMenuPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        selectMenuPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return selectMenuPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        selectMenuPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        selectMenuPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        selectMenuPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        selectMenuPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return selectMenuPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return selectMenuPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        selectMenuPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return selectMenuPart.getData(data);
    }

    public boolean hasData(String data) {
        return selectMenuPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        selectMenuPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return selectMenuPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return selectMenuPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return selectMenuPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return selectMenuPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return selectMenuPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return selectMenuPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return selectMenuPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        selectMenuPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return selectMenuPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return selectMenuPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return selectMenuPart.hasWrapper();
    }

    public boolean isInitialized() {
        return selectMenuPart.isInitialized();
    }

    public void log(Object obj) {
        selectMenuPart.log(obj);
    }

    public void removeFromParent() {
        selectMenuPart.removeFromParent();
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
    public WebBackendCurrencySelector getComponent() {
        return ((WebBackendCurrencySelector) (baseComponentPart.getComponent()));
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
        selectMenuPart.onInitializeComponentType(rootComponent);
        onInitializeCommonStyle(((WebRootComponent) (rootComponent)).getCommonStyles());
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }

    @Override
    public S setCurrency(String currency) {
        setCurrencies(new ArrayList<String>(Arrays.asList(currency)));
        return self();
    }

    @Override
    public S setSuggestedCurrency(String suggestedCurrency) {
        setSuggestedCurrencies(new ArrayList<String>(Arrays.asList(suggestedCurrency)));
        return self();
    }

    @Override
    public void writeTo(PrintWriter writer) {
        writeStartTag(writer);
        parentComponentPart.writeTo(writer);
        writeEndTag(writer);
    }
}
