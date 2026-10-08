package dev.reuise.web.backend.input;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.layout.BackdropFilter;
import dev.reuise.core.layout.CoreRowLayoutOptions;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPart;
import dev.reuise.web.backend.layout.WebBackendRowLayoutPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.input.DefaultWebSegmentedTextFieldPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
// Option: Direction - CORE
// Option: JustifyContent - CORE
// Option: AlignItems - CORE
// Option: ColumnGap - CORE
// Option: RowGap - CORE
// Option: Gap - CORE
// Option: Wrap - CORE
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
// Option: Wrapper - CORE
// Option: Theme - CORE
// Option: Visible - CORE
// Option: Enabled - CORE
// Option: Focused - CORE
// Option: Debug - CORE
// Option: DebugId - CORE
// base comp: rowLayout
// base comp: flexContainer
// base comp: container
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
public abstract class DefaultWebBackendSegmentedTextField<S extends DefaultWebBackendSegmentedTextField<S, O>, O extends WebBackendSegmentedTextFieldOptions> extends DefaultWebSegmentedTextFieldPart<S, O> implements WebBackendSegmentedTextField , WebBackendComponentType<S, O> {
    protected final WebBackendRowLayoutPart rowLayoutPart;

    protected final WebBackendFlexContainerPart flexContainerPart;

    protected final WebBackendContainerPart containerPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendSegmentedTextField(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        rowLayoutPart = options.getComponentFactory().createRowLayout(((CoreRowLayoutOptions) (options.getRowLayoutPart())));
        flexContainerPart = rowLayoutPart.getFlexContainerPart();
        containerPart = flexContainerPart.getContainerPart();
        parentComponentPart = containerPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, rowLayoutPart);
    }

    public WebBackendRowLayoutPart getRowLayoutPart() {
        return rowLayoutPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return rowLayoutPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.rowLayoutPart.setRootComponent(rootComponent);
    }

    @Override
    public Theme getTheme() {
        return rowLayoutPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.rowLayoutPart.setTheme(theme);
        return self();
    }

    public WebBackendFlexContainerPart getFlexContainerPart() {
        return flexContainerPart;
    }

    @Override
    public S setBackdropFilter(BackdropFilter backdropFilter, Object value) {
        this.containerPart.setBackdropFilter(backdropFilter, value);
        return self();
    }

    public S addMarkdown(String markdown) {
        rowLayoutPart.addMarkdown(markdown);
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
        rowLayoutPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        rowLayoutPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        rowLayoutPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        rowLayoutPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        rowLayoutPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (rowLayoutPart == null)
            return false;

        return rowLayoutPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return rowLayoutPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        rowLayoutPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return rowLayoutPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        rowLayoutPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        rowLayoutPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        rowLayoutPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        rowLayoutPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return rowLayoutPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return rowLayoutPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        rowLayoutPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return rowLayoutPart.getData(data);
    }

    public boolean hasData(String data) {
        return rowLayoutPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        rowLayoutPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return rowLayoutPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return rowLayoutPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return rowLayoutPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return rowLayoutPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return rowLayoutPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return rowLayoutPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return rowLayoutPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        rowLayoutPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return rowLayoutPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return rowLayoutPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return rowLayoutPart.hasWrapper();
    }

    public boolean isInitialized() {
        return rowLayoutPart.isInitialized();
    }

    public void log(Object obj) {
        rowLayoutPart.log(obj);
    }

    public void removeFromParent() {
        rowLayoutPart.removeFromParent();
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
    public WebBackendSegmentedTextField getComponent() {
        return ((WebBackendSegmentedTextField) (baseComponentPart.getComponent()));
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
        rowLayoutPart.onInitializeComponentType(rootComponent);
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
