package io.hotmail.com.jacob_vejvoda.infernal_mobs;

import org.bukkit.World;
import org.bukkit.entity.Entity;

import java.util.*;

class InfernalMob {
    private boolean infernal;
    Entity entity;
    UUID id;
    int lives;
    String effect;
    List<String> abilityList;
    Map<Entity, AbstractMap.SimpleImmutableEntry<World, Long>> rancorTargets = null; // entity -> [world, absolute tick when to forget]

    InfernalMob(Entity type, UUID i, boolean in, List<String> l, int li, String e) {
        this.entity = type;
        this.id = i;
        this.infernal = in;
        this.abilityList = l;
        this.lives = li;
        this.effect = e;
        
        this.rancorTargets = new HashMap<>();
    }

    public String toString() {
        return "Name: " + this.entity.getType().name() + " Infernal: " + this.infernal + "Abilities:" + this.abilityList;
    }

    void setLives(int i) {
        this.lives = i;
    }
}