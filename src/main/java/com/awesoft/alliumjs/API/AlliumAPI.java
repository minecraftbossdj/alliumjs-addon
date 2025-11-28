package com.awesoft.alliumjs.API;

import com.awesoft.alliumjs.AlliumEvents;

public class AlliumAPI {
    public static void fireEvent(String name, Object arg) {
        AlliumEvents.KUBEJS_EVENT.invoker().onKubeJS(name, arg);
    }
}
