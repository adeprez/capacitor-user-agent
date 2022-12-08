export interface UserAgentPlugin {
  get(): Promise<string>;
  set(options: {userAgent: string}): Promise<void>;
  reset(): Promise<void>;
}
