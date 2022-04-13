<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>Information about ${(user.firstName)!}</title>

</head>
<body>

<a href="/users">Список пользователей</a>
<a href="/user-add">Добавить пользователя</a>
<a href="/signIn">Выйти</a>

<h3>Информационная карта ${(user.firstName)!}</h3>

<form method="post" action="/user/${user.userId}/update" modelAttribute="user">

    <span>Роль</span>
    <div>
        <input value="${(user.role)!}" name="role" required="required">
    </div>
    <span></span>

    <span>E-mail</span>
    <div>
        <input value="${(user.EMail)!}" name="eMail" required="required">
    </div>
    <span></span>

    <span>Имя</span>
    <div>
        <input value="${(user.firstName)!}" name="firstName" required="required">
    </div>
    <span></span>

    <span>Фамилия</span>
    <div>
        <input value="${(user.lastName)!}" name="lastName" required="required">
    </div>
    <span></span>

    <span>Отчество</span>
    <div>
        <input value="${(user.secondName)!}" name="secondName" required="required">
    </div>
    <span></span>

    <span>Телефон</span>
    <div>
        <input value="${(user.phoneNumber)!}" name="phoneNumber" required="required">
    </div>
    <span></span>

    <span>Логин</span>
    <div>
        <input value="${(user.login)!}" name="login" required="required">
    </div>
    <span></span>

    <span>Пароль</span>
    <div>
        <input value="${(user.password)!}" name="password" required="required">
    </div>
    <span></span>

    <input type="submit" value="save">
</form>
</body>
</html>