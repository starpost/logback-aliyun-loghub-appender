# logback-aliyun-loghub-appender

logback appender for aliyun loghub

Appender Configurable Options:
==============================

```

    <appender name="testAppender" class="cn.starpost.aliyun.loghub.logback.LoghubAppender">

        <!-- project name (mandatory) -->
        <projectName>rt-logs</projectName>

        <!-- logstore (mandatory) -->
        <logstore>test-1st</logstore>

        <!-- service endpoint (mandatory) -->
        <endpoint>cn-beijing-intranet.log.aliyuncs.com</endpoint>

        <!-- topic (optional) -->
		<topic>WMS</topic>

        <!-- access key (mandatory) -->
        <accessKeyId>xxxxx</accessKeyId>
        <accessKey>xxxxx</accessKey>

        <!-- 被缓存起来的日志的发送超时时间，如果缓存超时，则会被立即发送，单位是毫秒，default 3000, 可选参数 -->
        <!--
        <packageTimeoutInMS>5000</packageTimeoutInMS>
         -->

        <!-- 每个缓存的日志包中包含日志数量的最大值，不能超过4096，default 4096, 可选参数 -->
        <!--
        <logsCountPerPackage>4096</logsCountPerPackage>
         -->

        <!-- 每个缓存的日志包的大小的上限，不能超过5MB，单位是字节，default 5M, 可选参数 -->
        <!--
        <logsBytesPerPackage>5242880</logsBytesPerPackage>
         -->

        <!-- Appender实例可以使用的内存的上限，单位是字节，默认是100MB，可选参数 -->
        <!--
        <memPoolSizeInByte>1048576000</memPoolSizeInByte>
         -->

        <!-- 输出到日志服务的时间格式，使用java中SimpleDateFormat格式化时间，默认是ISO8601，可选参数 -->
        <!--
        <timeFormat>yyyy-MM-dd HH:mm:ss,SSS</timeFormat>
        <timeZone>GMT+8</timeZone>
         -->
    </appender>
```    