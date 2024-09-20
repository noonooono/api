#基础镜像
FROM openjdk:8-jdk-alpine
#拷贝jar包
COPY target/sonapi_backend-0.0.1-SNAPSHOT.jar /app/jar
# 设定时区
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
# 暴露入口
ENTRYPOINT ["java","-jar","/app.jar"]