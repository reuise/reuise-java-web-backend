package dev.reuise.web.backend.layout;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Html;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.layout.BackdropFilter;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.splitcontainer.CoreSplitContainerOptions;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerDivider;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerPanel;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerPart;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.layout.DefaultWebSheetLayoutPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
// Option: Direction - CORE
// Option: ReverseDirection - CORE
// Option: Resizable - CORE
// Option: SplitPosition - CORE
// Option: MinSplitPosition - CORE
// Option: MaxSplitPosition - CORE
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
// base comp: splitContainer
// base comp: container
// add composition for container: addHeading
// add composition for container: addDivider
// add composition for container: addParagraph
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
public abstract class DefaultWebBackendSheetLayout<S extends DefaultWebBackendSheetLayout<S, O>, O extends WebBackendSheetLayoutOptions> extends DefaultWebSheetLayoutPart<S, O> implements WebBackendSheetLayout , WebBackendComponentType<S, O> {
    protected final WebBackendSplitContainerPart splitContainerPart;

    protected final WebBackendContainerPart containerPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendSheetLayout(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        splitContainerPart = options.getComponentFactory().createSplitContainer(((CoreSplitContainerOptions) (options.getSplitContainerPart())));
        containerPart = splitContainerPart.getContainerPart();
        parentComponentPart = containerPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, splitContainerPart);
    }

    public WebBackendSplitContainerPart getSplitContainerPart() {
        return splitContainerPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return splitContainerPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.splitContainerPart.setRootComponent(rootComponent);
    }

    @Override
    public Theme getTheme() {
        return splitContainerPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.splitContainerPart.setTheme(theme);
        return self();
    }

    @Override
    public WebBackendContainer getContainer() {
        return splitContainerPart.getContainer();
    }

    @Override
    public WebBackendSplitContainerPanel getStartPanel() {
        return splitContainerPart.getStartPanel();
    }

    @Override
    public WebBackendSplitContainerDivider getDivider() {
        return splitContainerPart.getDivider();
    }

    @Override
    public WebBackendSplitContainerPanel getEndPanel() {
        return splitContainerPart.getEndPanel();
    }

    @Override
    public S setBackdropFilter(BackdropFilter backdropFilter, Object value) {
        this.containerPart.setBackdropFilter(backdropFilter, value);
        return self();
    }

    public S addHeading(int level, String text) {
        splitContainerPart.addHeading(level, text);
        return self();
    }

    public S addHeading(String text) {
        splitContainerPart.addHeading(text);
        return self();
    }

    public S addHeading(int level, Html html) {
        splitContainerPart.addHeading(level, html);
        return self();
    }

    public S addHeading(Html html) {
        splitContainerPart.addHeading(html);
        return self();
    }

    public S addDivider() {
        splitContainerPart.addDivider();
        return self();
    }

    public S addDivider(String label) {
        splitContainerPart.addDivider(label);
        return self();
    }

    public S addParagraph(String text) {
        splitContainerPart.addParagraph(text);
        return self();
    }

    public S addParagraph(Html html) {
        splitContainerPart.addParagraph(html);
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
        splitContainerPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        splitContainerPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        splitContainerPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        splitContainerPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        splitContainerPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (splitContainerPart == null)
            return false;

        return splitContainerPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return splitContainerPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        splitContainerPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return splitContainerPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        splitContainerPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        splitContainerPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        splitContainerPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        splitContainerPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return splitContainerPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return splitContainerPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        splitContainerPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return splitContainerPart.getData(data);
    }

    public boolean hasData(String data) {
        return splitContainerPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        splitContainerPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return splitContainerPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return splitContainerPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return splitContainerPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return splitContainerPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return splitContainerPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return splitContainerPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return splitContainerPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        splitContainerPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return splitContainerPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return splitContainerPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return splitContainerPart.hasWrapper();
    }

    public boolean isInitialized() {
        return splitContainerPart.isInitialized();
    }

    public void log(Object obj) {
        splitContainerPart.log(obj);
    }

    public void removeFromParent() {
        splitContainerPart.removeFromParent();
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
    public WebBackendSheetLayout getComponent() {
        return ((WebBackendSheetLayout) (baseComponentPart.getComponent()));
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
        splitContainerPart.onInitializeComponentType(rootComponent);
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