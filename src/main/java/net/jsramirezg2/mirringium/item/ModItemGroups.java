package net.jsramirezg2.mirringium.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.jsramirezg2.mirringium.Mirringium;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MOD_TAB = FabricItemGroupBuilder.build(new Identifier(Mirringium.MOD_ID, "mod_tab"),
            () -> new ItemStack(ModItems.RAW_MIRRINGIUM));

}
