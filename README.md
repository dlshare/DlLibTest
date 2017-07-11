# DlLibTest,用于测试我的lib的项目
#### Finally, here I com, I'am `dlshare`.
## 测试dldebuglib
功能描述详见：https://github.com/dlshare/dldebuglog
### 1.Gradle
        project的build.gradle中添加：
        classpath 'com.hujiang.aspectjx:gradle-android-plugin-aspectjx:1.0.10'
        app的builde.gradle中添加：
        apply plugin: 'android-aspectjx'
        compile 'com.dlshare:dldebuglog:0.1'
### 2.使用
        在方法名前面添加注解@DlLog
### 3.示例及输出
![image](https://github.com/dlshare/DlLibTest/blob/master/screenshot/dldebuglib_use01.png)
![image](https://github.com/dlshare/DlLibTest/blob/master/screenshot/dldebuglib_effect01.png)

