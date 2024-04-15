package Ex4;

public class Definition {
    public String definition;

    public Definition(String definition) {
        this.definition = definition;
    }

    public String getDefinition() {
        return definition;
    }

    @Override
    public String toString() {
        return "Definition{" +
                "definition='" + definition + '\'' +
                '}';
    }
}