package com.creativecookie.plugin.pincheck;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import android.app.KeyguardManager;

@CapacitorPlugin(name = "PinCheck")
public class PinCheckPlugin extends Plugin {

    private PinCheck implementation = new PinCheck();

    @PluginMethod
    public void pinCheck(PluginCall call) {

        Boolean status = false;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            status = keyguardManager.isDeviceSecure();
        } else {
            status = keyguardManager.isKeyguardSecure();
        }

        JSObject ret = new JSObject();
        ret.put("value", status);
        call.resolve(ret);
    }
}
