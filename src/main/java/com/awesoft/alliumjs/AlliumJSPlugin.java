package com.awesoft.alliumjs;

import com.awesoft.alliumjs.API.AlliumAPI;
import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.script.BindingsEvent;

public class AlliumJSPlugin extends KubeJSPlugin {
    @Override
    public void init() {
        AlliumJS.LOGGER.info("Alliun KubeJS plugin loaded!");
    }

    @Override
    public void registerBindings(BindingsEvent event) {
        event.add("Allium", AlliumAPI.class);
    }
}
