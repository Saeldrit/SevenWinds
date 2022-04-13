<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>User Add</title>

</head>
<body>

<a href="/users">Список пользователей</a>
<a href="/signIn">Выйти</a>

<form method="post" action="/user-add">
    <h3>Новый пользователь</h3>

    <span>E-mail</span>
    <div>
        <input type="email" name="eMail">
    </div>

    <span>Имя</span>
    <div>
        <input type="text" name="firstName">
    </div>

    <span>Фамилия</span>
    <div>
        <input type="text" name="lastName">
    </div>

    <span>Отчество</span>
    <div>
        <input type="text" name="secondName">
    </div>

    <span>Телефон</span>
    <div>
        <input type="number" name="phoneNumber">
    </div>

    <span>Логин</span>
    <div>
        <input type="text" name="login">
    </div>

    <span>Пароль</span>
    <div>
        <input type="password" name="password">
    </div>
    <input type="submit" value="Добавить">
</form>

</body>
</html>
