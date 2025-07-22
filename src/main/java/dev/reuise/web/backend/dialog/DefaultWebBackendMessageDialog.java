package dev.reuise.web.backend.dialog;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.State;
import dev.reuise.core.dialog.CoreDialogOptions;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.WebBackendComponentType;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.text.WebBackendHeading;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.dialog.DefaultWebMessageDialogPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
// Option: Title - CORE
// Option: Open - CORE
// Option: Size - CORE
// Option: RemoveOnClose - CORE
// Option: Modal - CORE
// Option: Actions - CORE
// Option: HasAcceptButton - CORE
// Option: HasCancelButton - CORE
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
// base comp: dialog
// add composition for dialog: open
// add composition for dialog: close
// add composition for dialog: shake
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
public abstract class DefaultWebBackendMessageDialog<S extends DefaultWebBackendMessageDialog<S, O>, O extends WebBackendMessageDialogOptions> extends DefaultWebMessageDialogPart<S, O> implements WebBackendComponentType<S, O> , WebBackendMessageDialog {
    protected final WebBackendDialogPart dialogPart;

    protected final WebBackendParentComponentPart parentComponentPart;

    protected final WebBackendBaseComponentPart baseComponentPart;

    protected DefaultWebBackendMessageDialog(O options) {
        super(options);
        if (options.getComponent() == null)
            options.setComponent(self());

        dialogPart = options.getComponentFactory().createDialog(((CoreDialogOptions) (options.getDialogPart())));
        parentComponentPart = dialogPart.getParentComponentPart();
        baseComponentPart = parentComponentPart.getBaseComponentPart();
        addPart(ComponentPart.Type.BASE, dialogPart);
    }

    public void open() {
        dialogPart.open();
    }

    public void close() {
        dialogPart.close();
    }

    public void shake() {
        dialogPart.shake();
    }

    public WebBackendDialogPart getDialogPart() {
        return dialogPart;
    }

    @Override
    public RootComponent getRootComponent() {
        return dialogPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.dialogPart.setRootComponent(rootComponent);
    }

    @Override
    public Theme getTheme() {
        return dialogPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.dialogPart.setTheme(theme);
        return self();
    }

    @Override
    public WebBackendContainer getContainer() {
        return dialogPart.getContainer();
    }

    @Override
    public WebBackendContainer getHeader() {
        return dialogPart.getHeader();
    }

    @Override
    public WebBackendHeading getTitleHeading() {
        return dialogPart.getTitleHeading();
    }

    @Override
    public WebBackendFlexContainer getBody() {
        return dialogPart.getBody();
    }

    @Override
    public WebBackendFlexContainer getFooter() {
        return dialogPart.getFooter();
    }

    @Override
    public WebBackendContainer getScrim() {
        return dialogPart.getScrim();
    }

    @Override
    public WebBackendButton getAcceptButton() {
        return dialogPart.getAcceptButton();
    }

    @Override
    public WebBackendButton getCancelButton() {
        return dialogPart.getCancelButton();
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

    public void writeTo(PrintWriter writer) {
        dialogPart.writeTo(writer);
    }

    public void writeStartTag(PrintWriter writer) {
        dialogPart.writeStartTag(writer);
    }

    public void writeStartTag(PrintWriter writer, String tagName, boolean close) {
        dialogPart.writeStartTag(writer, tagName, close);
    }

    public void writeStartTag(PrintWriter writer, boolean close) {
        dialogPart.writeStartTag(writer, close);
    }

    public void writeEndTag(PrintWriter writer) {
        dialogPart.writeEndTag(writer);
    }

    public void writeEndTag(PrintWriter writer, String tagName) {
        dialogPart.writeEndTag(writer, tagName);
    }

    public boolean isRehydrated() {
        if (dialogPart == null)
            return false;

        return dialogPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return dialogPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        dialogPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return dialogPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        dialogPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        dialogPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        dialogPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        dialogPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return dialogPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return dialogPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        dialogPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return dialogPart.getData(data);
    }

    public boolean hasData(String data) {
        return dialogPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        dialogPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return dialogPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return dialogPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return dialogPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return dialogPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return dialogPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return dialogPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return dialogPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        dialogPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return dialogPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return dialogPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return dialogPart.hasWrapper();
    }

    public boolean isInitialized() {
        return dialogPart.isInitialized();
    }

    public void log(Object obj) {
        dialogPart.log(obj);
    }

    public void removeFromParent() {
        dialogPart.removeFromParent();
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
    public WebBackendMessageDialog getComponent() {
        return ((WebBackendMessageDialog) (baseComponentPart.getComponent()));
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
        dialogPart.onInitializeComponentType(rootComponent);
        onInitializeCommonStyle(((WebRootComponent) (rootComponent)).getCommonStyles());
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        super.onInitializeCommonStyle(commonStyles);
    }
}