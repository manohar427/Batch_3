<%@taglib prefix="core"  uri="http://www.springframework.org/tags"%>

<core:message code="loginWelcome"></core:message>
<br></br>
<form action="doLogin.do" method="post">
  <core:message code="login.username"/>:
  <input type="text" name="username"/><br>
  
   <core:message code="login.password"/>:
  <input type="password" name="password"/><br>
  
  <input type="submit" value="Submit">
</form>