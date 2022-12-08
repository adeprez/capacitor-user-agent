package com.adeprez.capacitor.ua;

import android.webkit.WebSettings;

import com.getcapacitor.Bridge;
import com.getcapacitor.BridgeActivity;
import com.getcapacitor.BridgeWebViewClient;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.JSObject;

@CapacitorPlugin(name = "UserAgent")
public class UserAgentPlugin extends Plugin {

    @PluginMethod
    public void get(PluginCall call) {
        JSObject ret = new JSObject();
        String userAgent = bridge.getWebView().getSettings().getUserAgentString();
        ret.put("userAgent", userAgent)
        call.resolve(ret);
    }

    @PluginMethod(returnType = PluginMethod.RETURN_NONE)
    public void set(PluginCall call) {
        String ua = call.getString("userAgent", null);
        bridge.getWebView().getSettings().setUserAgentString(ua);
        call.resolve();
    }

    @PluginMethod(returnType = PluginMethod.RETURN_NONE)
    public void reset(PluginCall call) {
        bridge.getWebView().getSettings().setUserAgentString(null);
        call.resolve();
    }

}
