import Foundation
import Capacitor
import LocalAuthentication
/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(PinCheckPlugin)
public class PinCheckPlugin: CAPPlugin {
    
    private let implementation = PinCheck()

    @objc func pinCheck(_ call: CAPPluginCall) {
        let context = LAContext();
        var error: NSError?

        let isEvaluateSuccess = context.canEvaluatePolicy(.deviceOwnerAuthentication, error: &error)
        
        call.resolve([
            "value": isEvaluateSuccess
        ])
    }
    
    
}
