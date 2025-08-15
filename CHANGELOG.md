# Changelog

## 0.1.0-alpha.1 (2025-08-15)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/jiandanroom/docs/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### Features

* add retryable exception ([3916462](https://github.com/jiandanroom/docs/commit/39164625461960e70080c8418eb4aa42c7934469))
* **client:** add `{QueryParams,Headers}#put(String, JsonValue)` methods ([c3db0bd](https://github.com/jiandanroom/docs/commit/c3db0bd2e82a7d3aae9384c2a9ba10758f9c5fa1))
* **client:** add https config options ([666ec37](https://github.com/jiandanroom/docs/commit/666ec370101b586138368ee5103f76786ada9249))
* **client:** allow configuring env via system properties ([20288ad](https://github.com/jiandanroom/docs/commit/20288ad67499cd27986fc8dab73df3ccf19b8986))
* **client:** ensure compat with proguard ([59d2753](https://github.com/jiandanroom/docs/commit/59d2753f905f750e79c6c1e3ffa28b45ac02aa16))


### Bug Fixes

* **ci:** release-doctor — report correct token name ([b7162b9](https://github.com/jiandanroom/docs/commit/b7162b92a3fcf6c7b2e1844c103cb3cc15d68bb8))
* **client:** bump max requests per host to max requests (5 -&gt; 64) ([79118a9](https://github.com/jiandanroom/docs/commit/79118a9c863bafcd56b549f1498593b8743d5964))
* **client:** don't close client on `withOptions` usage when original is gc'd ([000b61c](https://github.com/jiandanroom/docs/commit/000b61c7df2de85ffaa0ee4b65a64c63c63f75b8))
* **client:** ensure error handling always occurs ([3b66ebe](https://github.com/jiandanroom/docs/commit/3b66ebe520c5043f1a9cd090aa165b1eff2c8f78))
* **client:** r8 support ([2c83959](https://github.com/jiandanroom/docs/commit/2c839596f3ebac3b144850d5a3737e4bcf9f9c48))


### Performance Improvements

* **internal:** make formatting faster ([63f560b](https://github.com/jiandanroom/docs/commit/63f560bab1eadde635791f0023296f494061d92f))


### Chores

* **ci:** add build job ([2f5d3f3](https://github.com/jiandanroom/docs/commit/2f5d3f31be9596eb631c1e8e72915ce1ca87a5bc))
* **ci:** bump `actions/setup-java` to v4 ([05eb38a](https://github.com/jiandanroom/docs/commit/05eb38af359c4efffdfdd217b9e877462db6f6cd))
* **ci:** enable for pull requests ([9380e79](https://github.com/jiandanroom/docs/commit/9380e792e2df6fd1f91e87d92f44aa5db8b66bb5))
* **ci:** only run for pushes and fork pull requests ([32b34ae](https://github.com/jiandanroom/docs/commit/32b34ae7e8bc46f8dddd9000f6ec346b3d0bbf62))
* **example:** fix run example comment ([8bf679e](https://github.com/jiandanroom/docs/commit/8bf679e51c3f427a2ae3ac642e1bf4766502618a))
* increase max gradle JVM heap to 8GB ([fee1192](https://github.com/jiandanroom/docs/commit/fee11920e2514cafd55dac165e14959af753fa18))
* **internal:** add async lock helper ([941e3e7](https://github.com/jiandanroom/docs/commit/941e3e7ef6cafeef923499b844b4c64db6596ecd))
* **internal:** allow running specific example from cli ([a1a8d05](https://github.com/jiandanroom/docs/commit/a1a8d0546a8d6abb5a801b8b505018ad283e1e1d))
* **internal:** bump ci test timeout ([c85c4f3](https://github.com/jiandanroom/docs/commit/c85c4f3758938c06ddccc8705dfc7133ac440ac3))
* **internal:** codegen related update ([ac8c825](https://github.com/jiandanroom/docs/commit/ac8c825c2f15d03a6051eeb206439aac0daa73e2))
* **internal:** codegen related update ([0ab740a](https://github.com/jiandanroom/docs/commit/0ab740a91b7efd291264bb7081aad7d8be238837))
* **internal:** dynamically determine included projects ([a0d9a2f](https://github.com/jiandanroom/docs/commit/a0d9a2f0d110e5f39c28864c48e51b1a555a78bb))
* **internal:** reduce proguard ci logging ([4daea23](https://github.com/jiandanroom/docs/commit/4daea23993785f1fd74f1100a6cd22884697cb3d))
* **internal:** refactor delegating from client to options ([2897c42](https://github.com/jiandanroom/docs/commit/2897c42efebb4eb3ea2a75efa534dae60b18241a))
* **internal:** remove unnecessary `[...]` in `[@see](https://github.com/see)` ([0420e16](https://github.com/jiandanroom/docs/commit/0420e1689bcf526e949b642d3edbd8ca258c94b6))
* **internal:** support passing arguments to test script ([699d4b7](https://github.com/jiandanroom/docs/commit/699d4b7c5154091040d2cb2ba5b4698fba28dfcc))
* **internal:** unskip some tests ([978a993](https://github.com/jiandanroom/docs/commit/978a99396562526880474ed4c845d67a4c563bb5))
* **internal:** update comment in script ([02d78e3](https://github.com/jiandanroom/docs/commit/02d78e328e06ed0ea6f0ff041fe7858157739cee))
* sync repo ([5903db6](https://github.com/jiandanroom/docs/commit/5903db662586ec3976d5d8ac89200229fe9ff9df))
* update @stainless-api/prism-cli to v5.15.0 ([b9b2a7e](https://github.com/jiandanroom/docs/commit/b9b2a7efb4f293c425ce1ea076253fa8c576f7a7))
* update SDK settings ([32f4b95](https://github.com/jiandanroom/docs/commit/32f4b950dda412e6c95f344c0b0c680422444931))


### Documentation

* fix missing readme comment ([72aadcc](https://github.com/jiandanroom/docs/commit/72aadccedfb6e07d6932a0be45e57d73769c4684))
* more code comments ([186c006](https://github.com/jiandanroom/docs/commit/186c006dc2d2de0ad7d0006d941ac11fbb07935a))


### Refactors

* **internal:** minor `ClientOptionsTest` change ([b8f662f](https://github.com/jiandanroom/docs/commit/b8f662fd73581287a02ae309067e620863257480))
