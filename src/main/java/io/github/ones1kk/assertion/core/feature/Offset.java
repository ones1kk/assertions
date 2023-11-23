package io.github.ones1kk.assertion.core.feature;

public class Offset<T extends Number> {

    private final T value;

    private Offset(T value) {
//        Asserts.that(value)
//                .as("The offset value cannot be null.")
//                .isNotNull();
//        Asserts.that(value.doubleValue())
//                .as("The offset value should be greater than or equal to zero.")
//                .isGreaterThanOrEqualTo(0.0);
        this.value = value;
    }

    public static <T extends Number> Offset<T> offset(T value) {
        return new Offset<>(value);
    }

    private T getValue() {
        return value;
    }

    /**
     * Verify {@code expected} is in offset area or not.
     *
     * @param actual   reference value.
     * @param expected expected in offset area.
     * @return expected is in offset or not.
     */
    public boolean isOffset(T actual, T expected) {
//        Asserts.that(expected)
//                .as("expected cannot be null.")
//                .isNotNull();
//        Asserts.that(expected.doubleValue())
//                .as("Negative numbers cannot be compared.")
//                .isPositive();
        return isAfter(getBefore(actual), expected.doubleValue()) &&
                isBefore(getAfter(actual), expected.doubleValue());
    }

    private boolean isBefore(Double after, Double expected) {
        return expected <= after;
    }

    private boolean isAfter(Double before, Double expected) {
        return expected >= before;
    }

    /**
     * Get address locations minus a base address.
     *
     * @param actual reference value.
     * @return address locations minus a base address.
     */
    public double getBefore(T actual) {
        return (offset(actual).getValueInternal() - value.doubleValue());
    }

    /**
     * Get address locations added to a base address.
     *
     * @param actual reference value.
     * @return address locations added to a base address.
     */
    public double getAfter(T actual) {
        return (offset(actual).getValueInternal() + value.doubleValue());
    }

    private double getValueInternal() {
        return offset(value).getValue().doubleValue();
    }
}
