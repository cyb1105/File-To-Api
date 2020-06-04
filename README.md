# README

### Database DB설정

| service     | DB             |
| ----------- | -------------- |
| Upload      | upload_db      |
| UserService | myapp          |
| ApiServer   | csv2sql        |
| crawlingapi | microservicedb |

#### UserService 추가설정

```mysql
Insert ignore into myapp.roles(name) values('ROLE_USER');
Insert ignore into myapp.roles(name) values('ROLE_ADMIN');
```



