package com.adeprez.capacitor.ua;

import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "UserAgent")
public class UserAgentPlugin extends Plugin {

    @PluginMethod
    public void get(PluginCall call) {

        call.resolve("test");
    }

    @PluginMethod(returnType = PluginMethod.RETURN_NONE)
    public void set(PluginCall call) {
        String userAgent = call.getString("userAgent", "");

        call.resolve();
    }

    @PluginMethod(returnType = PluginMethod.RETURN_NONE)
    public void reset(PluginCall call) {

        call.resolve();
    }

}
