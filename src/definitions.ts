export interface DeviceSecurityPlugin {
  pinCheck(): Promise<{ value: boolean }>
}
