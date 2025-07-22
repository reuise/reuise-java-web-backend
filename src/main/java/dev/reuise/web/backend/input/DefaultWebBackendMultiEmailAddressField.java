package dev.reuise.web.backend.input;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.input.CoreChipFieldOptions;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.chip.WebBackendChipGroup;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.backend.text.WebBackendLabel;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.input.DefaultWebMultiEmailAddressFieldPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
// Option: Multiple - CORE
// Option: Values - CORE
// Option: Delimiters - CORE
// Option: AllowDuplicates - CORE
// Option: Size - CORE
// Option: SupportingText - CORE
// Option: Label - CORE
// Option: LabelPlacement - CORE
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
// base comp: chipField
// base comp: textField
// add composition for textField: validate
// add composition for textField: clear
// add composition for textField: hasValue
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
public abstract class DefaultWebBackendMultiEmailAddressField<S extends DefaultWebBackendMultiEmailAddressField<S, O>, O extends WebBackendMultiEmailAddressFieldOptions> extends DefaultWebMultiEmailAddressFieldPart<S, O> implements WebBackendComponentType<S, O> , WebBackendMultiEmailAddressField {
    protected final WebBackendChipFieldPart chipFieldPart;

    protected final WebBackendTextFieldPart textFieldPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendMultiEmailAddressField(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        chipFieldPart = options.getComponentFactory().createChipField(((CoreChipFieldOptions) (options.getChipFieldPart())));
        textFieldPart = chipFieldPart.getTextFieldPart();
        parentComponentPart = textFieldPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, chipFieldPart);
    }

    public WebBackendChipFieldPart getChipFieldPart() {
        return chipFieldPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return chipFieldPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.chipFieldPart.setRootComponent(rootComponent);
    }

    @Override
    public Theme getTheme() {
        return chipFieldPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.chipFieldPart.setTheme(theme);
        return self();
    }

    @Override
    public WebBackendChipGroup getChipGroup() {
        return chipFieldPart.getChipGroup();
    }

    @Override
    public S setError(String message) {
        this.textFieldPart.setError(message);
        return self();
    }

    public boolean validate() {
        return chipFieldPart.validate();
    }

    public void clear() {
        chipFieldPart.clear();
    }

    public boolean hasValue() {
        return chipFieldPart.hasValue();
    }

    public WebBackendTextFieldPart getTextFieldPart() {
        return textFieldPart;
    }

    @Override
    public WebBackendLabel getLabelContainer() {
        return textFieldPart.getLabelContainer();
    }

    @Override
    public WebBackendContainer getInputContainer() {
        return textFieldPart.getInputContainer();
    }

    @Override
    public WebBackendIcon getStartIcon() {
        return textFieldPart.getStartIcon();
    }

    @Override
    public WebBackendBasicInputField getInput() {
        return textFieldPart.getInput();
    }

    @Override
    public WebBackendIcon getEndIcon() {
        return textFieldPart.getEndIcon();
    }

    @Override
    public WebBackendInlineText getSupportingTextContainer() {
        return textFieldPart.getSupportingTextContainer();
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
        chipFieldPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        chipFieldPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        chipFieldPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        chipFieldPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        chipFieldPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (chipFieldPart == null)
            return false;

        return chipFieldPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return chipFieldPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        chipFieldPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return chipFieldPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        chipFieldPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        chipFieldPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        chipFieldPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        chipFieldPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return chipFieldPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return chipFieldPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        chipFieldPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return chipFieldPart.getData(data);
    }

    public boolean hasData(String data) {
        return chipFieldPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        chipFieldPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return chipFieldPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return chipFieldPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return chipFieldPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return chipFieldPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return chipFieldPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return chipFieldPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return chipFieldPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        chipFieldPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return chipFieldPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return chipFieldPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return chipFieldPart.hasWrapper();
    }

    public boolean isInitialized() {
        return chipFieldPart.isInitialized();
    }

    public void log(Object obj) {
        chipFieldPart.log(obj);
    }

    public void removeFromParent() {
        chipFieldPart.removeFromParent();
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
    public WebBackendMultiEmailAddressField getComponent() {
        return ((WebBackendMultiEmailAddressField) (baseComponentPart.getComponent()));
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
        chipFieldPart.onInitializeComponentType(rootComponent);
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