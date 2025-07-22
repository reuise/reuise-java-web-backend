package dev.reuise.web.backend.input;
import dev.reuise.core.input.InputValidator;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.backend.text.WebBackendLabel;
import dev.reuise.web.core.input.WebTextFieldPart;
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
public interface WebBackendTextFieldPart extends WebBackendTextFieldFeatures , WebBackendComponentPart , WebTextFieldPart , WebBackendParentComponentPart {
    String getValue();

    WebBackendTextFieldPart setValue(String value);

    String getPlaceholder();

    WebBackendTextFieldPart setPlaceholder(String placeholder);

    String getPattern();

    WebBackendTextFieldPart setPattern(String pattern);

    boolean isMultiline();

    WebBackendTextFieldPart setMultiline(Boolean multiline);

    Integer getMinLines();

    WebBackendTextFieldPart setMinLines(Integer minLines);

    Integer getMaxLines();

    WebBackendTextFieldPart setMaxLines(Integer maxLines);

    boolean isReadOnly();

    WebBackendTextFieldPart setReadOnly(Boolean readOnly);

    String getAutocomplete();

    WebBackendTextFieldPart setAutocomplete(String autocomplete);

    List<InputValidator> getValidators();

    WebBackendTextFieldPart setValidators(List<InputValidator> validators);

    WebBackendTextFieldPart addValidator(InputValidator validator);

    WebBackendTextFieldPart setValidator(InputValidator validator);

    WebBackendTextFieldPart removeValidator(InputValidator validator);

    boolean isRequired();

    WebBackendTextFieldPart setRequired(Boolean required);

    boolean isError();

    WebBackendTextFieldPart setError(Boolean error);

    WebBackendLabel getLabelContainer();

    WebBackendContainer getInputContainer();

    WebBackendIcon getStartIcon();

    WebBackendBasicInputField getInput();

    WebBackendIcon getEndIcon();

    WebBackendInlineText getSupportingTextContainer();

    WebBackendParentComponentPart getParentComponentPart();
}