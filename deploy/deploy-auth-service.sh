#!/usr/bin/env bash

heroku deploy:jar -j ${JAVA_OPTS} -Dserver.port=${PORT} -jar auth-service/build/libs/auth-service-0.1.0.jar --spring.profiles.active=cloud --app graal-auth
