#DlLibTest,用于测试我的lib的项目
##测试dldebuglib
功能描述详见：https://github.com/dlshare/dldebuglog<br>
###1.Gradle
project的build.gradle中添加：<br>
classpath 'com.hujiang.aspectjx:gradle-android-plugin-aspectjx:1.0.10'<br>
app的builde.gradle中添加：<br>
apply plugin: 'android-aspectjx'<br>
compile 'com.dlshare:dldebuglog:0.1'<br>

###2.使用

在方法名前面添加注解@DlLog

示例及输出
![image](https://github.com/dlshare/DlLibTest/blob/master/screenshot/dldebuglib_use01.png)
![image](https://github.com/dlshare/DlLibTest/blob/master/screenshot/dldebuglib_effect01.png)

