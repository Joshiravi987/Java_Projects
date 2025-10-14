<%@ include file="header.jsp" %>
<div class="container mt-4">
  <h2>Welcome, <%= session.getAttribute("user") %></h2>
  <p>You are logged in securely ✅</p>
</div>
<%@ include file="footer.jsp" %>
