#获取token METHOD:POST
```
获取 usertoken
http://localhost:9191/oauth/token?grant_type=password&username=marissa&password=koala&scope=write&client_id=tonr&client_secret=secret 

curl -X POST -vu tonr:secret 'http://localhost:9191/oauth/token?username=marissa&password=koala&grant_type=password'

获取clienttoken
http://localhost:9191/oauth/token?grant_type=client_credentials&scope=write&client_id=tonr&client_secret=secret 

curl -X POST -vu tonr:secret 'http://localhost:9191/oauth/token?grant_type=client_credentials'

```

#刷新token
```
刷新 usertoken
http://localhost:9191/oauth/token?grant_type=refresh_token&refresh_token=a85601d3-50d4-461b-8e67-59e1ea6c9082&client_id=tonr&client_secret=secret

curl -X POST -vu tonr:secret 'http://localhost:9191/oauth/token?grant_type=refresh_token&refresh_token=a85601d3-50d4-461b-8e67-59e1ea6c9082'

```


## 验证token METHOD:GET
```
刷新 usertoken

curl -X POST -vu tonr:secret 'http://localhost:9191/oauth/check_token?token=96503241-29a1-44c8-bc9f-bd01cbd1111d'

```
