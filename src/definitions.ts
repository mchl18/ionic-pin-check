export interface PinCheckPlugin {
  pinCheck(): Promise<{ value: string }>
}
