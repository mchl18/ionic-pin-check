import { WebPlugin } from '@capacitor/core';

import type { PinCheckPlugin } from './definitions';

export class PinCheckWeb extends WebPlugin implements PinCheckPlugin {
  async pinCheck(): Promise<{ value: string }> {
    console.log('pin check not working on web');
    return {
      value : 'false'
    }
  }
}
