# Lazy

diperuntukkan bagi mereka yang mager :)

## Getting Started

tambahkan pada root build.gradle

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
tambahkan depedency 
```
dependencies {
	        implementation 'com.github.triandamai:lazy:Tag'
	}
```

### Toast

What things you need to install the software and how to install them

```
new tulung(MainActivity.this).gawe_toast("pesan",true);
```

### Customfont

gunakan pada xml
```
    <com.trian.lazy.TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="hai orang mager"
        app:fontPath="@string/lobster_regular"
        />
```


## up coming

* custom toast
* Custom more font

