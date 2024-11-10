FROM jenkins/jenkins:lts

USER root

# Устанавливаем Maven для сборки Java-проектов
RUN apt-get update && \
    apt-get install -y maven && \
    apt-get clean

# Возвращаемся к пользователю Jenkins
USER jenkins