package net.casper.vitacarnis.item;

import net.casper.vitacarnis.VitaCarnis;
import net.casper.vitacarnis.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup VITA_CARNIS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(VitaCarnis.MOD_ID,"vita_carnis_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.SCANDERE_CARNIS))
                    .displayName(Text.translatable("itemgroup.vitacarnis.vita_carnis_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SCANDERE_CARNIS);
                        entries.add(ModItems.COOKED_SCANDERE_CARNIS);
                        entries.add(ModBlocks.CRAWL_TENDRILS);
                    }).build()
            );

    public static void registerItemGroups() {
        VitaCarnis.LOGGER.info("Registering Mod Item Groups for "+VitaCarnis.MOD_ID);
    }
}
