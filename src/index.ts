import { registerPlugin } from '@capacitor/core';

import type { PinCheckPlugin } from './definitions';

const PinCheck = registerPlugin<PinCheckPlugin>('PinCheck', {
  web: () => import('./web').then(m => new m.PinCheckWeb()),
});

export * from './definitions';
export { PinCheck };
