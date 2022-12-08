package com.adeprez.capacitor.ua;

import android.webkit.WebSettings;
import com.getcapacitor.Bridge;
import com.getcapacitor.BridgeActivity;
import com.getcapacitor.BridgeWebViewClient;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "UserAgent")
public class UserAgentPlugin extends Plugin {

    private WebSettings settings;

    @Override
    public void load() {
        settings = bridge.getWebView().getSettings();
    }

    @PluginMethod
    public void get(PluginCall call) {
        JSObject ret = new JSObject();
        String userAgent = settings.getUserAgentString();
        ret.put("userAgent", userAgent);
        call.resolve(ret);
    }

    @PluginMethod(returnType = PluginMethod.RETURN_NONE)
    public void set(PluginCall call) {
        String ua = call.getString("userAgent", null);
        settings.setUserAgentString(ua);
        call.resolve();
    }

    @PluginMethod(returnType = PluginMethod.RETURN_NONE)
    public void reset(PluginCall call) {
        settings.setUserAgentString(null);
        call.resolve();
    }
}
