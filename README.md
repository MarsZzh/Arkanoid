# Arkanoid
打砖块游戏

该游戏使用的是Android原生的绘制接口，SurfaceView是一个专门用来绘制需要较高帧数画面如游戏、视频等的原生控件。该款小游戏就是用的自定义View实现的，该自定
义View继承自SurfaceView，比起View有更好的性能以及更方便的操作方式，界面主要的逻辑就是不断地重绘界面，以及小球的各种碰撞检测等等；该小游戏可以有体感的效
果，通过获取加速度传感器的数值来改变板子的运动方向；也可以通过触摸实现控制板子的运动方向。



# 截图

splash界面

![screenshots](https://github.com/MarsZzh/Arkanoid/blob/master/screenshots/start.png)

游戏界面

![screenshots](https://github.com/MarsZzh/Arkanoid/blob/master/screenshots/playing.png)

结束界面

![screenshots](https://github.com/MarsZzh/Arkanoid/blob/master/screenshots/stop.png)
