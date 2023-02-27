package io.github.ones1kk.assertion.core.description;

public final class DescriptionHolder {

    private final String description;

    private final String asDescription;

    public DescriptionHolder(String description, String asDescription) {
        this.description = description;
        this.asDescription = asDescription;
    }

    public String getDescription() {
        return description;
    }

    public String getAsDescription() {
        return asDescription;
    }

}
