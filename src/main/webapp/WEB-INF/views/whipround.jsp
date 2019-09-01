<html>
<body>

<h2>Donation</h2>

<c:forEach var="user" items="${users}">
    <tr>
        <td>${user}</td>
        <td><a href="/users/${user}">Details</a></td>
        <td><a href="/user/delete/${user}">Delete</a></td>
        <td><a href="/user/update/${user}">Update</a></td>
    </tr>
</c:forEach>

</body>
</html>