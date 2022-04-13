<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>Users</title>

</head>
<body>

<a href="/user-add">Добавить пользователя</a>
<a href="/signIn">Выйти</a>

<table>
    <thead>
    <tr>
        <th>Роль</th>
        <th>E-mail</th>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Отчество</th>
        <th>Телефон</th>
        <th>Логин</th>
    </tr>
    </thead>
    <tbody>
    <#if users ? has_content>
        <#list users as user>
            <tr>
                <td>${(user.role)!}</td>
                <td>${(user.EMail)!}</td>
                <td>${(user.firstName)!}</td>
                <td>${(user.lastName)!}</td>
                <td>${(user.secondName)!}</td>
                <td>${(user.phoneNumber)!}</td>
                <td>${(user.login)!}</td>
                <td>
                    <form method="post" action="/users/${(user.userId)!}/delete">
                        <button type="submit">Удалить</button>
                    </form>
                    <a href="/users/${user.userId}"><span>Изменить</span></a>
                </td>
            </tr>
        </#list>
    </#if>
    </tbody>
</table>

</body>
</html>
