package dev.reuise.web.backend.list;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.list.CoreBasicListItemOptions;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.checkbox.WebBackendCheckbox;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.list.DefaultWebListItemPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
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
public abstract class DefaultWebBackendListItem<S extends DefaultWebBackendListItem<S, O>, O extends WebBackendListItemOptions> extends DefaultWebListItemPart<S, O> implements WebBackendComponentType<S, O> , WebBackendListItem {
    protected final WebBackendBasicListItemPart basicListItemPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendListItem(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        basicListItemPart = options.getComponentFactory().createBasicListItem(((CoreBasicListItemOptions) (options.getBasicListItemPart())));
        parentComponentPart = basicListItemPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, basicListItemPart);
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
    public RootComponent getRootComponent() {
        return basicListItemPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        super.setRootComponent(rootComponent);
        this.basicListItemPart.setRootComponent(rootComponent);
        if (checkbox != null)
            checkbox.setRootComponent(rootComponent);

        if (startIcon != null)
            startIcon.setRootComponent(rootComponent);

        if (textContainer != null)
            textContainer.setRootComponent(rootComponent);

        if (labelContainer != null)
            labelContainer.setRootComponent(rootComponent);

        if (secondaryLabelContainer != null)
            secondaryLabelContainer.setRootComponent(rootComponent);

        if (endIcon != null)
            endIcon.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return basicListItemPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (checkbox != null)
            checkbox.setTheme(theme);

        if (startIcon != null)
            startIcon.setTheme(theme);

        if (textContainer != null)
            textContainer.setTheme(theme);

        if (labelContainer != null)
            labelContainer.setTheme(theme);

        if (secondaryLabelContainer != null)
            secondaryLabelContainer.setTheme(theme);

        if (endIcon != null)
            endIcon.setTheme(theme);

        this.basicListItemPart.setTheme(theme);
        return self();
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
        basicListItemPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        basicListItemPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        basicListItemPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        basicListItemPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        basicListItemPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (basicListItemPart == null)
            return false;

        return basicListItemPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return basicListItemPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        basicListItemPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return basicListItemPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        basicListItemPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        basicListItemPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        basicListItemPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        basicListItemPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return basicListItemPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return basicListItemPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        basicListItemPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return basicListItemPart.getData(data);
    }

    public boolean hasData(String data) {
        return basicListItemPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        basicListItemPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return basicListItemPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return basicListItemPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return basicListItemPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return basicListItemPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return basicListItemPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return basicListItemPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return basicListItemPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        basicListItemPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return basicListItemPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return basicListItemPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return basicListItemPart.hasWrapper();
    }

    public boolean isInitialized() {
        return basicListItemPart.isInitialized();
    }

    public void log(Object obj) {
        basicListItemPart.log(obj);
    }

    public void removeFromParent() {
        basicListItemPart.removeFromParent();
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
    public WebBackendListItem getComponent() {
        return ((WebBackendListItem) (baseComponentPart.getComponent()));
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
        basicListItemPart.onInitializeComponentType(rootComponent);
        onInitializeCommonStyle(((WebRootComponent) (rootComponent)).getCommonStyles());
    }

    @Override
    public WebBackendCheckbox getCheckbox() {
        return ((WebBackendCheckbox) (super.getCheckbox()));
    }

    @Override
    public WebBackendIcon getStartIcon() {
        return ((WebBackendIcon) (super.getStartIcon()));
    }

    @Override
    public WebBackendContainer getTextContainer() {
        return ((WebBackendContainer) (super.getTextContainer()));
    }

    @Override
    public WebBackendInlineText getLabelContainer() {
        return ((WebBackendInlineText) (super.getLabelContainer()));
    }

    @Override
    public WebBackendInlineText getSecondaryLabelContainer() {
        return ((WebBackendInlineText) (super.getSecondaryLabelContainer()));
    }

    @Override
    public WebBackendIcon getEndIcon() {
        return ((WebBackendIcon) (super.getEndIcon()));
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }

    // Implementation
    @Override
    public void writeTo(PrintWriter writer) {
        writeStartTag(writer);
        this.parentComponentPart.writeTo(writer);
        writeEndTag(writer);
    }
}