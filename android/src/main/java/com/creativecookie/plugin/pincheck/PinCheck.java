package com.creativecookie.plugins.pincheck;

import android.util.Log;
import android.os.Build;
import android.content.Context;
import android.app.KeyguardManager;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
@CapacitorPlugin(name = "PinCheck")
public class PinCheck extends Plugin {

    boolean status;

    @PluginMethod
    public void pinCheck(PluginCall call) {
        try {
            KeyguardManager keyguardManager = (KeyguardManager) this.getContext().getSystemService(Context.KEYGUARD_SERVICE);
            System.out.println(keyguardManager.isKeyguardSecure());
            status = keyguardManager.isKeyguardSecure();
            System.out.println(status);
            JSObject ret = new JSObject();
            ret.put("value", status);
            call.resolve(ret);
        } catch (Exception ex) {
            call.reject(ex.getLocalizedMessage());
        }
    }
}
