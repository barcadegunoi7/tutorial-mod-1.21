package net.barca.tutorialmod.item;

import net.barca.tutorialmod.TutorialMod;
import net.barca.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PINK_GARNET_ITEMS_GROUPS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.tutorial.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.PINK_GARNET);
                      entries.add(ModItems.RAW_PINK_GARNET);

                      entries.add(ModItems.CHISEL);
                    }).build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUPS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorial.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModBlocks.PINK_GARNET_BLOCK);
                      entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                      entries.add(ModBlocks.PINK_GARNET_ORE);
                      entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
