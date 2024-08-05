export interface PinCheckPlugin {
  pinCheck(): Promise<{ value: boolean }>
}
