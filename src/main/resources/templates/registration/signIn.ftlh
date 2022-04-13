<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>SignIn</title>

</head>
<body>

<form method="post" action="/signIn">
    <h3>Авторизация</h3>

    <span>Логин</span>
    <div class="box">
        <input type="text" name="login">
    </div>

    <span>Пароль</span>
    <div class="box">
        <input type="password" name="password">
    </div>

    <div class="box">
        <input type="submit" value="Войти">
    </div>

    <a href="/signUp" class="forget">Регистрация</a>
</form>

</body>
</html>
