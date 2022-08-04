package gregification.base;

import java.util.List;

public class IncompatThrower {
    public void throwIncompatibility(List<String> messages) {
        throw new RuntimeException(String.join(",", messages));
    }
}
