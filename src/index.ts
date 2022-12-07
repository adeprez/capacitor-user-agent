import { registerPlugin } from '@capacitor/core';

import type { UserAgentPlugin } from './definitions';

const UserAgent = registerPlugin<UserAgentPlugin>('UserAgent', {
  web: () => import('./web').then(m => new m.UserAgentWeb()),
});

export * from './definitions';
export { UserAgent };
