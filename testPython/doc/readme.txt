python 安装 ,使用版2.7.15  ，各版本差异较大
多版本并存，使用anaconda  可以动态创建环境，并应用指定环境

pip 安装
python -m pip install --upgrade pip
  修改pip 源  
  或者 pip install -i url  第三方库名  
 通过 -i 指定源
 常用国内源 如下
### 阿里云 http://mirrors.aliyun.com/pypi/simple/ 
### 中国科技大学 https://pypi.mirrors.ustc.edu.cn/simple/ 
### 豆瓣(douban) http://pypi.douban.com/simple/ 
### 清华大学 https://pypi.tuna.tsinghua.edu.cn/simple/ 
### 中国科学技术大学 http://pypi.mirrors.ustc.edu.cn/simple/

helloWorld  字符集编码问题
  #coding=utf-8   ##文件首行
  print  默认换行，当前语句最后 使用逗号 (,)不换行。
  

cx_Oracle install  位数 和  python ,oracle client  一致。  使用版本 5.2.1-11g
本地使用 32位，所以python，cx_Oracle 统一32位
	查询 字段中文乱码，使用如下代码
	import os  
    os.environ['NLS_LANG'] = 'SIMPLIFIED CHINESE_CHINA.UTF8' 


第三方库导入，Undefined variable from import  改为 warning

pandas  库 使用
pip install pandas   会下载相关依赖库






