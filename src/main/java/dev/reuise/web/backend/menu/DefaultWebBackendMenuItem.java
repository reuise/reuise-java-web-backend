package dev.reuise.web.backend.menu;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.list.CoreListItemOptions;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.checkbox.WebBackendCheckbox;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.backend.list.WebBackendBasicListItemPart;
import dev.reuise.web.backend.list.WebBackendListItemPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.menu.DefaultWebMenuItemPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
// Option: Label - CORE
// Option: SecondaryLabel - CORE
// Option: HasCheckbox - CORE
// Option: ToggleCheckboxOnClick - CORE
// Option: Url - CORE
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
// base comp: listItem
// base comp: basicListItem
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
public abstract class DefaultWebBackendMenuItem<S extends DefaultWebBackendMenuItem<S, O>, O extends WebBackendMenuItemOptions> extends DefaultWebMenuItemPart<S, O> implements WebBackendMenuItem , WebBackendComponentType<S, O> {
    protected final WebBackendListItemPart listItemPart;

    protected final WebBackendBasicListItemPart basicListItemPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendMenuItem(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        listItemPart = options.getComponentFactory().createListItem(((CoreListItemOptions) (options.getListItemPart())));
        basicListItemPart = listItemPart.getBasicListItemPart();
        parentComponentPart = basicListItemPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, listItemPart);
    }

    @Override
    public S setHighlightText(String text) {
        return ((S) (listItemPart.setHighlightText(text)));
    }

    @Override
    public S setFilterText(String text) {
        return ((S) (listItemPart.setFilterText(text)));
    }

    @Override
    public boolean containsText(String text) {
        return ((boolean) (listItemPart.containsText(text)));
    }

    public WebBackendListItemPart getListItemPart() {
        return listItemPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return listItemPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.listItemPart.setRootComponent(rootComponent);
    }

    @Override
    public Theme getTheme() {
        return listItemPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.listItemPart.setTheme(theme);
        return self();
    }

    @Override
    public WebBackendCheckbox getCheckbox() {
        return listItemPart.getCheckbox();
    }

    @Override
    public WebBackendIcon getStartIcon() {
        return listItemPart.getStartIcon();
    }

    @Override
    public WebBackendContainer getTextContainer() {
        return listItemPart.getTextContainer();
    }

    @Override
    public WebBackendInlineText getLabelContainer() {
        return listItemPart.getLabelContainer();
    }

    @Override
    public WebBackendInlineText getSecondaryLabelContainer() {
        return listItemPart.getSecondaryLabelContainer();
    }

    @Override
    public WebBackendIcon getEndIcon() {
        return listItemPart.getEndIcon();
    }

    @Override
    public S setUrl(String url, Boolean useHistoryApi) {
        this.basicListItemPart.setUrl(url, useHistoryApi);
        return self();
    }

    public WebBackendBasicListItemPart getBasicListItemPart() {
        return basicListItemPart;
    }

    @Override
    public WebBackendLink getLink() {
        return basicListItemPart.getLink();
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
        listItemPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        listItemPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        listItemPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        listItemPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        listItemPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (listItemPart == null)
            return false;

        return listItemPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return listItemPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        listItemPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return listItemPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        listItemPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        listItemPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        listItemPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        listItemPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return listItemPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return listItemPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        listItemPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return listItemPart.getData(data);
    }

    public boolean hasData(String data) {
        return listItemPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        listItemPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return listItemPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return listItemPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return listItemPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return listItemPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return listItemPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return listItemPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return listItemPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        listItemPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return listItemPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return listItemPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return listItemPart.hasWrapper();
    }

    public boolean isInitialized() {
        return listItemPart.isInitialized();
    }

    public void log(Object obj) {
        listItemPart.log(obj);
    }

    public void removeFromParent() {
        listItemPart.removeFromParent();
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
    public WebBackendMenuItem getComponent() {
        return ((WebBackendMenuItem) (baseComponentPart.getComponent()));
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
        listItemPart.onInitializeComponentType(rootComponent);
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