package net.casper.vitacarnis.block;

import net.casper.vitacarnis.VitaCarnis;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //Add new blocks

    public static final Block CRAWL_TENDRILS = registerBlock("crawl_tendrils",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.2f)
                    .noCollision()
                    .burnable()
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    //Block registering and Item coupling helpers

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VitaCarnis.MOD_ID, name), block);
    };

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(VitaCarnis.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        VitaCarnis.LOGGER.info("Registering blocks for "+VitaCarnis.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(CRAWL_TENDRILS);
        });
    }
}
