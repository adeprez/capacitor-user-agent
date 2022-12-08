export interface UserAgentPlugin {
  get(): Promise<{userAgent: string}>;
  set(options: {userAgent: string}): Promise<void>;
  reset(): Promise<void>;
}
