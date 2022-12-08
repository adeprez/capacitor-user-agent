# @adeprez/capacitor-user-agent

User Agent get/set/reset plugin for Capacitor

## Install

```bash
npm install @adeprez/capacitor-user-agent
npx cap sync
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
set(options: { userAgent: string; }) => Promise<void>
```

Update the Webview user agent (Android and iOS only)

| Param         | Type                                |
| ------------- | ----------------------------------- |
| **`options`** | <code>{ userAgent: string; }</code> |

--------------------


### reset()

```typescript
reset() => Promise<void>
```

Reset the Webview user agent (Android and iOS only)

--------------------

</docgen-api>
