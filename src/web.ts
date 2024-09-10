import { WebPlugin } from '@capacitor/core';

import type { DeviceSecurityPlugin } from './definitions';

export class DeviceSecurityWeb extends WebPlugin implements DeviceSecurityPlugin {
  async pinCheck(): Promise<{ value: boolean }> {
    console.log('pin check not working on web');
    return {
      value : false
    }
  }
}
