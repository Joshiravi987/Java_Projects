<%@ include file="header.jsp" %>
<div class="container mt-5" style="max-width: 400px;">
  <h3 class="text-center mb-4">Login to MyBank</h3>
  <% if (request.getAttribute("error") != null) { %>
    <div class="alert alert-danger"><%= request.getAttribute("error") %></div>
  <% } %>
  <form action="authenticate.jsp" method="post">
    <div class="mb-3">
      <label>User ID</label>
      <input type="text" name="userId" class="form-control" required>
    </div>
    <div class="mb-3">
      <label>Password</label>
      <input type="password" name="password" class="form-control" required>
    </div>
    <button type="submit" class="btn btn-primary w-100">Login</button>
  </form>
</div>
<%@ include file="footer.jsp" %>
