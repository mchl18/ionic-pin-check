import Foundation
import Capacitor
import LocalAuthentication
/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(DeviceSecurityPlugin)
public class DeviceSecurityPlugin: CAPPlugin {
    
    private let implementation = DeviceSecurity()

    @objc func pinCheck(_ call: CAPPluginCall) {
        let context = LAContext();
        var error: NSError?

        let isEvaluateSuccess = context.canEvaluatePolicy(.deviceOwnerAuthentication, error: &error)
        
        call.resolve([
            "value": isEvaluateSuccess
        ])
    }
    
    
}
