export interface UserAgentPlugin {
  /**
   * Get the Webview's user agent
   */
  get(): Promise<{ userAgent: string }>;

  /**
   * Update the Webview user agent (Android and iOS only). Set reloadOnChange
   * to true to reload the page when the user agent changes (default is false).
   * Starting from KITKAT Android version, changing the user-agent while loading
   * a web page causes WebView to initiate loading once again.
   */
  set(options: { userAgent: string; reloadOnChange?: boolean }): Promise<void>;

  /**
   * Reset the Webview user agent (Android and iOS only)
   */
  reset(): Promise<void>;
}
