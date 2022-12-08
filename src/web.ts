import { WebPlugin } from '@capacitor/core';

import type { UserAgentPlugin } from './definitions';

export class UserAgentWeb extends WebPlugin implements UserAgentPlugin {
  
  async get(): Promise<string> {
    return navigator.userAgent;
  }

  async set(): Promise<void> {
    throw new Error('Unable to set user agent on web');
  }

  reset(): Promise<void> {
    throw new Error('Unable to reset user agent on web');
  }

}
