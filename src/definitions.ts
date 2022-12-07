export interface UserAgentPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
