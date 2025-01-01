package shared;

import java.io.Serializable;

public record Student(String id, String name, String school) implements Serializable {
}
