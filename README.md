fast-serialization
==================


Project Page http://ruedigermoeller.github.io/fast-serialization/  (out of pure childishness)

###Documentation

[Quick Start](https://github.com/RuedigerMoeller/fast-serialization/wiki/Serialization)

[All Pages](https://github.com/RuedigerMoeller/fast-serialization/wiki)

###mvn

Do not use 1.56, is has major issues.

```.xml
<dependency>
    <groupId>de.ruedigermoeller</groupId>
    <artifactId>fst</artifactId>
    <version>1.58</version>
</dependency>
```

###how to build 

* The maven build should work out of the box and reproduces the artifact hosted on maven.org
* To use the gradle build, you need to configure the proxy server in settings.properties (or just set empty if you do not sit behind a proxy).

<b>Note</b> that instrumentation done for fst-structs works only if debug info is turned on during compile. Reason is that generating methods at runtime with javassist fails (probably a javassist bug ..). 
<b>This does not affect the serialization implementation. </b>

<b>JDK 1.6 Build</b>
https://github.com/RuedigerMoeller/fast-serialization/releases/tag/v1.55-1.6
(serialization works for 1.6, structs not)
