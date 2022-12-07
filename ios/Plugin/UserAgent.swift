import Foundation

@objc public class UserAgent: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
