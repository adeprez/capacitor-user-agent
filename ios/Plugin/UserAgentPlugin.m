#import <Foundation/Foundation.h>
#import <Capacitor/Capacitor.h>

CAP_PLUGIN(UserAgentPlugin, "UserAgent",
  CAP_PLUGIN_METHOD(get, CAPPluginReturnPromise);
  CAP_PLUGIN_METHOD(set, CAPPluginReturnNone);
  CAP_PLUGIN_METHOD(reset, CAPPluginReturnNone);
)
