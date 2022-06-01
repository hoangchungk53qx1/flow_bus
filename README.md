# flow_bus
[![](https://jitpack.io/v/hoangchungk53qx1/flow_bus.svg)](https://jitpack.io/#hoangchungk53qx1/flow_bus)

EventBus for Android, message bus, based on SharedFlow, has lifecycle awareness, supports Sticky, supports thread switching, and supports delayed sending.

---|---|---|---|---|---|---
EventBus | ❌ | ✅ | ✅ | ❌ | ❌ | ✅
RxBus | ❌ | ✅ | ✅ | ❌ | ❌ | ✅
LiveEventBus | ✅ | ✅ | ✅ | ✅ | ✅ | ❌
Flow_Bus| ✅ | ✅ | ✅ | ✅ |❌| ✅ | 

# MoreInfo

Check it out😄

[kotlinx.coroutines.flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/index.html)


# Install
Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency
```
dependencies {
	  dependencies {
	        implementation 'com.github.hoangchungk53qx1:flow_bus:Tag'
	}
```


Step 3. Init

```kotlin
class ApplicationFlowBus : Application() {
  override fun onCreate() {
    super.onCreate()
    FlowBusInitApplication.initializer(this)
  }
}
```


### License
```
MIT License

Copyright (c) 2021 hoangchungk53qx1

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```
