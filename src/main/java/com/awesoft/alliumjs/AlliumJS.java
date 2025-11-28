package com.awesoft.alliumjs;

import com.awesoft.alliumjs.allium.LuaHelper;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlliumJS implements ModInitializer  {
    public static final Logger LOGGER = LoggerFactory.getLogger("alliumjs");

	@Override
	public void onInitialize() {
        LuaHelper.register();
        LOGGER.info("AlliumJS loaded!");
	}
}