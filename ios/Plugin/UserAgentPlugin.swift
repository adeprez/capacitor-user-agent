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
            let newUA = call.getString("userAgent") ?? nil

            guard let userAgent = newUA else {
                call.reject("User agent cannot be nil")
                return
             }
            if self.bridge?.webView?.customUserAgent != userAgent {
                self.bridge?.webView?.customUserAgent = userAgent
                let reloadOnChange = call.getString("reloadOnChange") ?? false
                if reloadOnChange {
                    self.bridge?.webView?.reload()
                }
            }
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
