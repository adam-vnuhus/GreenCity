package greencity.dto.advice;

import greencity.constant.ValidationConstants;
import greencity.dto.language.LanguageDTO;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdviceTranslationDTO {
    @NotNull
    private LanguageDTO language;

    @NotBlank(message = ValidationConstants.EMPTY_ADVICE)
    @Length(min = ValidationConstants.ADVICE_MIN_LENGTH, max = ValidationConstants.ADVICE_MAX_LENGTH,
        message = ValidationConstants.INVALID_ADVICE_LENGTH)
    private String content;
}
