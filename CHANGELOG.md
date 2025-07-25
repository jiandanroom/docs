# Changelog

## 0.1.0-alpha.1 (2025-07-25)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/jiandanroom/docs/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### Features

* **client:** add `{QueryParams,Headers}#put(String, JsonValue)` methods ([c3db0bd](https://github.com/jiandanroom/docs/commit/c3db0bd2e82a7d3aae9384c2a9ba10758f9c5fa1))
* **client:** add https config options ([666ec37](https://github.com/jiandanroom/docs/commit/666ec370101b586138368ee5103f76786ada9249))
* **client:** allow configuring env via system properties ([20288ad](https://github.com/jiandanroom/docs/commit/20288ad67499cd27986fc8dab73df3ccf19b8986))


### Bug Fixes

* **ci:** release-doctor — report correct token name ([b7162b9](https://github.com/jiandanroom/docs/commit/b7162b92a3fcf6c7b2e1844c103cb3cc15d68bb8))
* **client:** bump max requests per host to max requests (5 -&gt; 64) ([79118a9](https://github.com/jiandanroom/docs/commit/79118a9c863bafcd56b549f1498593b8743d5964))
* **client:** don't close client on `withOptions` usage when original is gc'd ([000b61c](https://github.com/jiandanroom/docs/commit/000b61c7df2de85ffaa0ee4b65a64c63c63f75b8))
* **client:** ensure error handling always occurs ([3b66ebe](https://github.com/jiandanroom/docs/commit/3b66ebe520c5043f1a9cd090aa165b1eff2c8f78))


### Chores

* **ci:** bump `actions/setup-java` to v4 ([05eb38a](https://github.com/jiandanroom/docs/commit/05eb38af359c4efffdfdd217b9e877462db6f6cd))
* **ci:** enable for pull requests ([9380e79](https://github.com/jiandanroom/docs/commit/9380e792e2df6fd1f91e87d92f44aa5db8b66bb5))
* **ci:** only run for pushes and fork pull requests ([32b34ae](https://github.com/jiandanroom/docs/commit/32b34ae7e8bc46f8dddd9000f6ec346b3d0bbf62))
* **internal:** allow running specific example from cli ([a1a8d05](https://github.com/jiandanroom/docs/commit/a1a8d0546a8d6abb5a801b8b505018ad283e1e1d))
* **internal:** refactor delegating from client to options ([2897c42](https://github.com/jiandanroom/docs/commit/2897c42efebb4eb3ea2a75efa534dae60b18241a))
* **internal:** remove unnecessary `[...]` in `[@see](https://github.com/see)` ([0420e16](https://github.com/jiandanroom/docs/commit/0420e1689bcf526e949b642d3edbd8ca258c94b6))
* sync repo ([5903db6](https://github.com/jiandanroom/docs/commit/5903db662586ec3976d5d8ac89200229fe9ff9df))
* update SDK settings ([32f4b95](https://github.com/jiandanroom/docs/commit/32f4b950dda412e6c95f344c0b0c680422444931))


### Documentation

* fix missing readme comment ([72aadcc](https://github.com/jiandanroom/docs/commit/72aadccedfb6e07d6932a0be45e57d73769c4684))
* more code comments ([186c006](https://github.com/jiandanroom/docs/commit/186c006dc2d2de0ad7d0006d941ac11fbb07935a))


### Refactors

* **internal:** minor `ClientOptionsTest` change ([b8f662f](https://github.com/jiandanroom/docs/commit/b8f662fd73581287a02ae309067e620863257480))
