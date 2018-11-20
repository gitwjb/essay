test  
 eclipse 环境测试，属性值在ivysettings.xml ，或者内置属性。
 第一种应用：ivyIDE 安装ivyIDE plugin
 ivy.xml 右键添加库，需要指定ivysettings.xml,jar仓库缓存位置 ，由配置文件指定。
 
第二种应用： ANT+IVY 只需 ivy.jar包（包拷贝到ant_home/lib）
 ant 命令运行，指定构建文件
 
第三种应用：  ANT+IVY+eclipse   ant插件配置 + ivy.jar包（包拷贝到ant_home/lib）
  需要在构建文件中，指定ivysettings.xml文件，jar仓库缓存位置 ，由配置文件指定。



testb  osgi
 maven-bundle-plugin 编译插件 
  要想packing 的 bundle 不报错，必须<extentions>true</extentions>
 <_include>osgi.bnd</_include> 引入默认配置

