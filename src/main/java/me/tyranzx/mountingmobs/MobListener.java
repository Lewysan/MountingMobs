package me.tyranzx.mountingmobs;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class MobListener extends StellarSource implements Listener {

    @EventHandler
    public void clickearMobs(PlayerInteractAtEntityEvent e) {
        if (e.getRightClicked().getType().equals(EntityType.ENDER_DRAGON) || e.getRightClicked().getType().equals(EntityType.GHAST) || e.getRightClicked().getType().equals(EntityType.BLAZE) || e.getRightClicked().getType().equals(EntityType.SLIME) || e.getRightClicked().getType().equals(EntityType.SQUID) || e.getRightClicked().getType().equals(EntityType.PLAYER))
            return;
        e.getRightClicked().setPassenger(e.getPlayer());
    }
}
