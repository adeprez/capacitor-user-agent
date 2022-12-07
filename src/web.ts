import { WebPlugin } from '@capacitor/core';

import type { UserAgentPlugin } from './definitions';

export class UserAgentWeb extends WebPlugin implements UserAgentPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
