# react-native-app-cache-clear

## Getting started

`$ npm install react-native-app-cache-clear --save`

### Mostly automatic installation

`$ react-native link react-native-app-cache-clear`

## Usage(Android only)

```javascript
import AppCacheClear from "react-native-app-cache-clear";

// get size and unit
AppCacheClear.getCacheSize((size, unit) => {
  console.log(size, unit);
});

// clear cache
AppCacheClear.clearCache(() => console.log("clear!"));
```
