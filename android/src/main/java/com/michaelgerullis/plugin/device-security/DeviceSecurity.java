package com.michaelgerullis.plugins.devicesecurity;

import android.util.Log;
import android.os.Build;
import android.content.Context;
import android.app.KeyguardManager;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "DeviceSecurity")
public class DeviceSecurity extends Plugin {
    @PluginMethod
    public void pinCheck(PluginCall call) {
        try {
            KeyguardManager keyguardManager = (KeyguardManager) this.getContext().getSystemService(Context.KEYGUARD_SERVICE);
            JSObject ret = new JSObject();
            ret.put("value", keyguardManager.isKeyguardSecure());
            call.resolve(ret);
        } catch (Exception ex) {
            call.reject(ex.getLocalizedMessage());
        }
    }
}
