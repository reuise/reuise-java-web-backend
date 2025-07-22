package dev.reuise.web.backend.chip;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Html;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.layout.BackdropFilter;
import dev.reuise.core.layout.CoreFieldSetOptions;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.layout.WebBackendContainerPart;
import dev.reuise.web.backend.layout.WebBackendFieldSetPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.chip.DefaultWebChipGroupPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
// Option: Label - CORE
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
// base comp: fieldSet
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
public abstract class DefaultWebBackendChipGroup<S extends DefaultWebBackendChipGroup<S, O>, O extends WebBackendChipGroupOptions> extends DefaultWebChipGroupPart<S, O> implements WebBackendComponentType<S, O> , WebBackendChipGroup {
    protected final WebBackendFieldSetPart fieldSetPart;

    protected final WebBackendContainerPart containerPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendChipGroup(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        fieldSetPart = options.getComponentFactory().createFieldSet(((CoreFieldSetOptions) (options.getFieldSetPart())));
        containerPart = fieldSetPart.getContainerPart();
        parentComponentPart = containerPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, fieldSetPart);
    }

    public WebBackendFieldSetPart getFieldSetPart() {
        return fieldSetPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return fieldSetPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        super.setRootComponent(rootComponent);
        this.fieldSetPart.setRootComponent(rootComponent);
        if (addButton != null)
            addButton.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return fieldSetPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (addButton != null)
            addButton.setTheme(theme);

        this.fieldSetPart.setTheme(theme);
        return self();
    }

    @Override
    public S setBackdropFilter(BackdropFilter backdropFilter, Object value) {
        this.containerPart.setBackdropFilter(backdropFilter, value);
        return self();
    }

    public S addHeading(int level, String text) {
        fieldSetPart.addHeading(level, text);
        return self();
    }

    public S addHeading(String text) {
        fieldSetPart.addHeading(text);
        return self();
    }

    public S addHeading(int level, Html html) {
        fieldSetPart.addHeading(level, html);
        return self();
    }

    public S addHeading(Html html) {
        fieldSetPart.addHeading(html);
        return self();
    }

    public S addDivider() {
        fieldSetPart.addDivider();
        return self();
    }

    public S addDivider(String label) {
        fieldSetPart.addDivider(label);
        return self();
    }

    public S addParagraph(String text) {
        fieldSetPart.addParagraph(text);
        return self();
    }

    public S addParagraph(Html html) {
        fieldSetPart.addParagraph(html);
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
        fieldSetPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        fieldSetPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        fieldSetPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        fieldSetPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        fieldSetPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (fieldSetPart == null)
            return false;

        return fieldSetPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return fieldSetPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        fieldSetPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return fieldSetPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        fieldSetPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        fieldSetPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        fieldSetPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        fieldSetPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return fieldSetPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return fieldSetPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        fieldSetPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return fieldSetPart.getData(data);
    }

    public boolean hasData(String data) {
        return fieldSetPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        fieldSetPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return fieldSetPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return fieldSetPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return fieldSetPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return fieldSetPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return fieldSetPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return fieldSetPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return fieldSetPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        fieldSetPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return fieldSetPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return fieldSetPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return fieldSetPart.hasWrapper();
    }

    public boolean isInitialized() {
        return fieldSetPart.isInitialized();
    }

    public void log(Object obj) {
        fieldSetPart.log(obj);
    }

    public void removeFromParent() {
        fieldSetPart.removeFromParent();
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
    public WebBackendChipGroup getComponent() {
        return ((WebBackendChipGroup) (baseComponentPart.getComponent()));
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
        fieldSetPart.onInitializeComponentType(rootComponent);
        onInitializeCommonStyle(((WebRootComponent) (rootComponent)).getCommonStyles());
    }

    @Override
    public WebBackendChip getAddButton() {
        return ((WebBackendChip) (super.getAddButton()));
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