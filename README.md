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

### get()

```typescript
get() => Promise<{ userAgent: string; }>
```

**Returns:** <code>Promise&lt;{ userAgent: string; }&gt;</code>

--------------------


### set(...)

```typescript
set(options: { userAgent: string; }) => Promise<void>
```

| Param         | Type                                |
| ------------- | ----------------------------------- |
| **`options`** | <code>{ userAgent: string; }</code> |

--------------------


### reset()

```typescript
reset() => Promise<void>
```

--------------------

</docgen-api>
