package dev.reuise.web.backend.input;
import dev.reuise.core.State;
import dev.reuise.core.input.InputValidator;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.icon.WebBackendIconOptions;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.backend.text.WebBackendInlineTextOptions;
import dev.reuise.web.backend.text.WebBackendLabel;
import dev.reuise.web.backend.text.WebBackendLabelOptions;
import dev.reuise.web.core.input.WebTextFieldPartOptions;
import java.util.List;
// Value here??
// Placeholder here??
// Pattern here??
// Multiline here??
// MinLines here??
// MaxLines here??
// ReadOnly here??
// Autocomplete here??
// Validators here??
// Required here??
// Error here??
public interface WebBackendTextFieldPartOptions extends WebTextFieldPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    String getValue();

    WebBackendTextFieldPartOptions setValue(String value);

    String getPlaceholder();

    WebBackendTextFieldPartOptions setPlaceholder(String placeholder);

    String getPattern();

    WebBackendTextFieldPartOptions setPattern(String pattern);

    boolean isMultiline();

    WebBackendTextFieldPartOptions setMultiline(Boolean multiline);

    Integer getMinLines();

    WebBackendTextFieldPartOptions setMinLines(Integer minLines);

    Integer getMaxLines();

    WebBackendTextFieldPartOptions setMaxLines(Integer maxLines);

    boolean isReadOnly();

    WebBackendTextFieldPartOptions setReadOnly(Boolean readOnly);

    String getAutocomplete();

    WebBackendTextFieldPartOptions setAutocomplete(String autocomplete);

    List<InputValidator> getValidators();

    WebBackendTextFieldPartOptions setValidators(List<InputValidator> validators);

    WebBackendTextFieldPartOptions addValidator(InputValidator validator);

    WebBackendTextFieldPartOptions setValidator(InputValidator validator);

    WebBackendTextFieldPartOptions removeValidator(InputValidator validator);

    boolean isRequired();

    WebBackendTextFieldPartOptions setRequired(Boolean required);

    boolean isError();

    WebBackendTextFieldPartOptions setError(Boolean error);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendTextFieldPartOptions setLabelContainerCreator(ComponentCreator<? extends WebBackendLabel, ? extends WebBackendLabelOptions> labelContainerCreator);

    WebBackendTextFieldPartOptions setInputContainerCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> inputContainerCreator);

    WebBackendTextFieldPartOptions setStartIconCreator(ComponentCreator<? extends WebBackendIcon, ? extends WebBackendIconOptions> startIconCreator);

    WebBackendTextFieldPartOptions setInputCreator(ComponentCreator<? extends WebBackendBasicInputField, ? extends WebBackendBasicInputFieldOptions> inputCreator);

    WebBackendTextFieldPartOptions setEndIconCreator(ComponentCreator<? extends WebBackendIcon, ? extends WebBackendIconOptions> endIconCreator);

    WebBackendTextFieldPartOptions setSupportingTextContainerCreator(ComponentCreator<? extends WebBackendInlineText, ? extends WebBackendInlineTextOptions> supportingTextContainerCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendTextField getComponent();
}