#Image 생성을 위한 스크립트
#컨테이너 내부 환경

#oepnjdk8 이미지를 기반으로 함
FROM openjdk:8-jdk-alpine

ENV HOME /docker/notification

VOLUME $HOME/logs

COPY *.jar  $HOME/app.jar
#docker 이미지 내부에서 run, cmd, entrypoint의 명령이 실행될 디렉토리를 설정
WORKDIR $HOME

ENTRYPOINT ["java","-jar","/app.jar"]
