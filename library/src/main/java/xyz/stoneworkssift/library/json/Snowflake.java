package xyz.stoneworkssift.library.json;

import java.util.Objects;

public class Snowflake {

    private final long value;

    public static Snowflake of(final long value) {
        return new Snowflake(value);
    }

    public static Snowflake of(final String value) {
        return new Snowflake(value);
    }

    public Snowflake(String value) {
        this.value = Long.parseUnsignedLong(value);
    }

    public Snowflake(long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Long.toUnsignedString(value);
    }

    public long asLong() {
        return value;
    }

    public String asString() {
        return toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Snowflake id = (Snowflake) obj;
        return value == id.value;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(value);
    }
}
