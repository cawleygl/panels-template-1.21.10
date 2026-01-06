package bluesteel42.panels.block;

import net.minecraft.util.StringIdentifiable;

public enum PanelType implements StringIdentifiable {
    SINGLE_NORTH("single_north"),
    SINGLE_SOUTH("single_south"),
    SINGLE_EAST("single_east"),
    SINGLE_WEST("single_west"),
    DOUBLE_X("double_x"),
    DOUBLE_Z("double_z");

    private final String name;

    private PanelType(final String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String asString() {
        return this.name;
    }
}
