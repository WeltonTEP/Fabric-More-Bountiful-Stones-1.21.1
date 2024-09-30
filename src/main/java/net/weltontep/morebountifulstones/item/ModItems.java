package net.weltontep.morebountifulstones.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.weltontep.morebountifulstones.MoreBountifulStones;
import net.weltontep.morebountifulstones.item.custom.EmeraldPaxel;

public class ModItems {

    public static final Item EMERALD_PAXEL = registerItem("emerald_paxel", new EmeraldPaxel(new Item.Settings().maxDamage(1561)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreBountifulStones.MOD_ID, name), item);

    }

    public static void registerModItems() {
        MoreBountifulStones.LOGGER.info("Registering Mod Items for" + MoreBountifulStones.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries ->{
            entries.add(EMERALD_PAXEL);
        });
    }
}
