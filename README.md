![logo](https://github.com/shuaijunlan/Autumn-Framework/raw/master/Autumn.png)
## Autumn-Framework
[![Build Status](https://travis-ci.org/shuaijunlan/Autumn-Framework.svg?branch=master)](https://travis-ci.org/shuaijunlan/Autumn-Framework)  [![AUR](https://img.shields.io/aur/license/yaourt.svg)](https://github.com/shuaijunlan/Autumn-Framework/blob/master/LICENSE)</br>
![dynamic](https://github.com/shuaijunlan/Autumn-Framework/raw/master/dynamic.gif)

*Autumn-Framework* is a collection of web sub-system, aimes to provide universal web system solution. It is scalable and stable, you can develop your own web system  basing on it. Also, you can join us to maintain it together, if only you are interested in it.</br>

[Live Demo](http://shuaijunlan.cn:8081/loginProxy.do)

Please submit issues to corresponding projects, that'll help us make issues tracking easier so that we can provide timely help to you.

### Modules
* [CMS](https://github.com/shuaijunlan/Autumn-Framework/tree/master/cms)
* [WEBIM](https://github.com/shuaijunlan/Autumn-Framework/tree/master/webim)

### Environment
*Autumn-Framework* require `java8` and `maven3` as bulid enviroment.</br>

The project requires at minimum 512MB memory to run. Please ensure you have corresponding tools installed in your environment before build and run the project.

### Get Started
* Clone from github.com:
    `git clone git@github.com:shuaijunlan/Autumn-Framework.git`
* Enter the project root directory `cd Autumn-Framework`
* Install dependencies:
    `mvn install`
* Enter sub-system, e.g.`cd cms`
* Run server:
    `mvn tomcat7:run`. Server runs on port 8081 by default, visit `localhost:8081` to check it out.

### License
Licensed under GPL 2.0. See [LICENSE](https://github.com/shuaijunlan/Autumn-Framework/blob/master/LICENSE) for further details.