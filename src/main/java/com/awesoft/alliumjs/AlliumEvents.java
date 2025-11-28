package com.awesoft.alliumjs;

import dev.hugeblank.allium.api.event.SimpleEventType;

public class AlliumEvents {

    public static final SimpleEventType<KubeJSEvent> KUBEJS_EVENT = new SimpleEventType<>();

    public interface KubeJSEvent {
        void onKubeJS(String name, Object arg);
    }
}
