# DlLibTest 
#### Here I com, I am `dlshare`.
用于测试我的lib的项目
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
        如此简单的方式，便可以打印出方法的参数、调用顺序、耗时、运行线程，及主线程执行耗时操作警告，
        在调试代码的时候使用，是非常不错的。
        当然，注解也可以作用在类前面，当前还没有考虑清楚具体怎么使用。
![image](https://github.com/dlshare/DlLibTest/blob/master/screenshot/dldebuglib_use01.png)
![image](https://github.com/dlshare/DlLibTest/blob/master/screenshot/dldebuglib_effect01.png)
        
