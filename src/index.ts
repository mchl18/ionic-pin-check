import { registerPlugin } from '@capacitor/core';

import type { DeviceSecurityPlugin } from './definitions';

const DeviceSecurity = registerPlugin<DeviceSecurityPlugin>('DeviceSecurity', {
  web: () => import('./web').then(m => new m.DeviceSecurityWeb()),
});

export * from './definitions';
export { DeviceSecurity };
