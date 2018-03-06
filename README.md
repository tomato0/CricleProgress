# CricleProgress

# 自定义圆形进度使用说明  
# 自定义圆形进度的类CircleProgressView  
# 全类名：com.gionee.wsq.cricleprogress.CircleProgressView  
## Xml布局文件中使用配置：
	### app:radius			配置圆形进度的半径，及布局的大小，也可设置布局宽高指定大小，match_parent时充满布局xxdp
	### app:stripeWidth	配置进度条的宽度xxdp
	#### app:progress		指定默认进度，不大于100的int值
	### app:backgroundInColor	配置布局控件背景色
	### app:progressColor	配置进度条的颜色
	### app:backgroundProgressColor	配置进度条的背景颜色
	### app:isClockwise	进度旋转的方向:true(顺时针)，false(逆时针)



# 图中对应的三个标记为三个文本 
## 设置三个文本依次为：  
### textColorOne  
### textColorTwo  
### textColorThree  
## 设置文本颜色  
### textSizeOne  
### textSizeTwo  
### textSizeThree  
## 置文本大小  
### textBoldOne  
### textBoldTwo  
### textBoldThree  
设置文本是否加粗　true(加粗)，false(不加粗)  


## 也可在代码中通过相应的set方法设置：  
### setRadius									设置半径  
### setBackgroundProgressColor				设置进度条背景色  
### setProgressColor							设置进度条颜色  
### setStripeWidth							设置进度条宽度  
### setTxtSizeOne								设置文本一大小  
### setTxtSizeTwo								设置文本二大小  
### setTxtSizeThree							设置文本三大小  
### setIsClockwise							设置进度旋转方向  
### setTextOneColor							设置文本一颜色  
### setTextTwoColor							设置文本二颜色  
### setTextThreeColor						设置文本三颜色  
### setIsTextOneBold							设置文本一粗体  
### setIsTextTwoBold							设置文本二粗体  
### setIsTextThreeBold						设置文本三粗体  
### setBackgroundInColor					设置控件背景色  
## 设置进度更新的方法(可在非UI线程更新)  
### public synchronized void setProgress(int progress,String textOne,String textTwo,String textThree)  
### progress		进度  
### textOne		文本一内容  
### textTwo		文本二内容  
### textThree	文本三内容  

