export interface UserAgentPlugin {
  /**
   * Get the Webview's user agent
   */
  get(): Promise<{ userAgent: string }>;

  /**
   * Update the Webview user agent (Android and iOS only)
   */
  set(options: { userAgent: string }): Promise<void>;

  /**
   * Reset the Webview user agent (Android and iOS only)
   */
  reset(): Promise<void>;
}
