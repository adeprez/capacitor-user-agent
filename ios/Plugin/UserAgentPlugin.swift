import Foundation
import Capacitor

@objc(UserAgentPlugin)
public class UserAgentPlugin: CAPPlugin {

    @objc func get(_ call: CAPPluginCall) {
        DispatchQueue.main.async {
            self.bridge?.webView?.evaluateJavaScript("navigator.userAgent", completionHandler: { (result, error) in
                if error == nil {
                    call.resolve([
                        "userAgent": result ?? ""
                    ])
                } else {
                    call.reject(error.debugDescription)
                }
            })
        }
    }

    @objc func set(_ call: CAPPluginCall) {
        DispatchQueue.main.async {
            let ua = call.getString("userAgent") ?? nil
            self.bridge?.webView?.customUserAgent = ua
            call.resolve()
        }
    }

    @objc func reset(_ call: CAPPluginCall) {
        DispatchQueue.main.async {
            self.bridge?.webView?.customUserAgent = nil
            call.resolve()
        }
    }
}
