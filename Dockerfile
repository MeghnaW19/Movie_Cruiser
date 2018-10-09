FROM mysql:5.7.17

ENV MYSQL_ROOT_PASSWORD=root


COPY mymysql.sql /docker-entrypoint-initdb.d/

ENTRYPOINT ["docker-entrypoint.sh"]
CMD ["mysqld"]
