java -XX:+PrintFlagsFinal -version
java -XX:+PrintFlagsFinal -version | grep CompileThreshold
java -Xlog:help

java -Xlog:gc*=info,safepoint*

java -Xlog:gc*=info,heap*=debug,safepoint=info:file=./gc.log::filecount=3,filesize=10m -Xmx2g -Xms2g -Xmn1g

java -XX:InitiatingHeapOccupancyPercent=70 -XX:-G1UseAdaptiveIHOP -Xlog:gc*=info,heap*=debug,safepoint=info:file=./gc.log::filecount=3,filesize=10m -Xmx2g -Xms2g -Xmn1g