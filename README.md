# To get a Git project into your build:

# Gradle:

## Step 1. Add it in your root build.gradle at the end of repositories

```
  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
## Step 2. Add the dependency
```
dependencies {
	        implementation 'com.github.iAngkur:Toast-Message:1.0.0'
	}
```


# How To Use it
```
Toaster.ShowShortTimeMessage(context, your_message) // for Toast.LENGTH_SHORT

Toaster.ShowLognTimeMessage(context, your_message) // for Toast.LENGTH_LONG
```
