import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PasswordGeneratorParameters {

    private int passwordLength;
    private boolean includeSymbols;
    private boolean inculdeNumbers;
    private boolean includeLowercaseCharacters;
    private boolean includeUppercaseCharacters;
}
