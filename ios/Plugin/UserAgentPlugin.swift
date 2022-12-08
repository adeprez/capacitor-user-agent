import Foundation
import Capacitor

@objc(UserAgentPlugin)
public class UserAgentPlugin: CAPPlugin {

    @objc func get(_ call: CAPPluginCall) {
        call.resolve([
            "value": "test"
        ])
    }

    @objc func set(_ call: CAPPluginCall) {
        let userAgent = call.getString("userAgent") ?? ""
        // ...
        call.resolve()
    }

    @objc func reset(_ call: CAPPluginCall) {
        // ...
        call.resolve()
    }
}
