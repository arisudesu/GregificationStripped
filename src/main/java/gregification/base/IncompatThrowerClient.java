package gregification.base;

import java.util.List;

public class IncompatThrowerClient extends IncompatThrower {
    @Override
    public void throwIncompatibility(List<String> messages) {
        throw new ModIncompatibilityException(messages);
    }
}
