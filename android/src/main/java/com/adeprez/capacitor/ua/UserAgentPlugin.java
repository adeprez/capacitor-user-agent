package com.adeprez.capacitor.ua;

import android.webkit.WebSettings;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import java.util.Objects;

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
        String newUA = call.getString("userAgent", null);
        String ua = settings.getUserAgentString();
        if (!Objects.equals(newUA, ua)) {
          settings.setUserAgentString(ua);
          if (Boolean.TRUE.equals(call.getBoolean("reloadOnChange", false))) {
            bridge.getWebView().reload();
          }
        }
        call.resolve();
    }

    @PluginMethod(returnType = PluginMethod.RETURN_NONE)
    public void reset(PluginCall call) {
        settings.setUserAgentString(null);
        call.resolve();
    }
}
