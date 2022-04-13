<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>User</title>
</head>
<body>

<form method="post" action="/signUp">
    <h3>Регистрация</h3>

    <span>E-mail</span>
    <div class="box">
        <input type="email" name="EMail">
    </div>

    <span>Имя</span>
    <div class="box">
        <input type="text" name="firstName">
    </div>

    <span>Фамилия</span>
    <div class="box">
        <input type="text" name="lastName">
    </div>

    <span>Отчество</span>
    <div class="box">
        <input type="text" name="secondName">
    </div>

    <span>Телефон</span>
    <div class="box">
        <input type="number" name="phoneNumber">
    </div>

    <span>Логин</span>
    <div class="box">
        <input type="text" name="login">
    </div>

    <span>Пароль</span>
    <div class="box">
        <input type="password" name="password">
    </div>

    <div class="inputBox">
        <div class="box">
            <input type="submit" value="Регистрация">
        </div>
    </div>

    <a href="/signIn">Уже зарегестрированы?</a>
</form>

</body>
</html>