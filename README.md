# @adeprez/capacitor-user-agent

User Agent get/set/reset plugin for Capacitor

## Install

```bash
npm install @adeprez/capacitor-user-agent
npx cap sync
```

## Usage

```typescript
import { UserAgent } from '@adeprez/capacitor-user-agent';

async getMyUserAgent(): Promise<string> {
  const result = await UserAgent.get();
  return result.userAgent;
}

setMyUserAgent(userAgent: string): Promise<void> {
  return UserAgent.set({userAgent});
}
```

## API

<docgen-index>

* [`get()`](#get)
* [`set(...)`](#set)
* [`reset()`](#reset)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### get()

```typescript
get() => Promise<{ userAgent: string; }>
```

Get the Webview's user agent

**Returns:** <code>Promise&lt;{ userAgent: string; }&gt;</code>

--------------------


### set(...)

```typescript
set(options: { userAgent: string; reloadOnChange?: boolean; }) => Promise<void>
```

Update the Webview user agent (Android and iOS only). Set reloadOnChange
to true to reload the page when the user agent changes (default is false).
Starting from KITKAT Android version, changing the user-agent while loading
a web page causes WebView to initiate loading once again.

| Param         | Type                                                          |
| ------------- | ------------------------------------------------------------- |
| **`options`** | <code>{ userAgent: string; reloadOnChange?: boolean; }</code> |

--------------------


### reset()

```typescript
reset() => Promise<void>
```

Reset the Webview user agent (Android and iOS only)

--------------------

</docgen-api>
