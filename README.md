Uber SeekBar
===========================================
Did you use Uber application, I'm really enjoy with UI/UX:
<img src="http://i.imgur.com/K252SUu.png"/>

So today I want to make a SeekBar based on Uber App style.

Status
======

- Current stable version: [ ![Download](https://api.bintray.com/packages/bonnguyen/maven/uberseekbar/images/download.svg) ](https://bintray.com/bonnguyen/maven/uberseekbar/_latestVersion)
- Current development version: n/a

Get It
===

- Maven repository: jCenter
- Group: com.github.bonnguyen
- Artifact ID: uberseekbar

What's new (1.0.0)
==========
- Only supported 4 options which user can select
 
Installation
============

Release versions are available from jCenter repository, so just add the "compile..." statement to your project. For snapshots, please
add our bintray snapshots repository url first: https://dl.bintray.com/bonnguyen/maven

```groovy
repositories{
    maven {
        url 'https://dl.bintray.com/bonnguyen/maven'
    }
}
```
And put it in App dependencies:

```groovy
dependencies {
    ...
    compile 'com.github.bonnguyen:uberseekbar:1.0.0'
    ...
}
```

Quick Usage
===========
Easy to integrate with your project. In your XML layout, you can put the UberSeekBar

```groovy
<com.bonnguyen.uberseekbar.UberSeekBar
    android:id="@+id/uberSeekBar"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:bgItems="@array/item_bg"
    app:maxProgress="300"
    app:showTitle="true"
    app:thumb="@drawable/selector_default_button_uberpool"
    app:titles="@array/titles"
    app:valueProgress="0" />
```


Configuration and Start
=============
- If you want to change the title and image background. Find the <b>res/values</b> and update it

```groovy
<item>"uberPOOL"</item>
    <item>"uberX"</item>
    <item>"BLACK CAR"</item>
    <item>"VAN"</item>
</string-array>
<array name="item_bg">
    <item>@drawable/selector_default_button_uberpool</item>
    <item>@drawable/selector_default_button_uberx</item>
    <item>@drawable/selector_default_button_blackcar</item>
    <item>@drawable/selector_default_button_van</item>
</array>
```

- `UberSeekBar#setOnSeekBarChangeListener(OnSeekBarChangeListener)` - adds listener to receive the notifies clients when the progress level has been changed. This includes changes that were initiated by the user through a touch gesture or arrow key/trackball as well as changes that were initiated programmatically.

Bugs, Suggestions, Ideas
========================
Any ideas/bugs/etc, as well as pull requests, are welcome in the [issues section](https://github.com/bonnguyen/UberSeekBar/issues).

DEVELOP BY
===================================
[Bon Nguyen](https://github.com/bonnguyen) - nguyennhatbon07t1@gmail.com

LICENSE
===================================
<br/>
The MIT License (MIT)

Copyright (c) 2016 Bon Nguyen.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
<br/>       
