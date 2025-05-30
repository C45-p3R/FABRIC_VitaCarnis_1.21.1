package net.casper.vitacarnis.item;

import net.casper.vitacarnis.VitaCarnis;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //Add new Items

    public static final Item SCANDERE_CARNIS = registerItem("scandere_carnis", new Item(new Item.Settings()));
    public static final Item COOKED_SCANDERE_CARNIS = registerItem("cooked_scandere_carnis", new Item(new Item.Settings()));

    //Item registering

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VitaCarnis.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VitaCarnis.LOGGER.info("Registering Mod Items for "+VitaCarnis.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SCANDERE_CARNIS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(COOKED_SCANDERE_CARNIS);
        });
    }
}
