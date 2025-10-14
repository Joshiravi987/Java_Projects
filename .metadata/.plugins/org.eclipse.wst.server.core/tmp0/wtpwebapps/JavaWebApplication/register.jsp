<%@ include file="header.jsp" %>
<div class="container mt-5" style="max-width: 500px;">
  <h3 class="text-center mb-4">Sign Up</h3>
  <form action="InsertPage" method="post">
    <div class="mb-3">
      <label>Full Name</label>
      <input type="text" name="name" class="form-control" required>
    </div>
    <div class="mb-3">
      <label>Email</label>
      <input type="email" name="email" class="form-control" required>
    </div>
    <div class="mb-3">
      <label>User ID</label>
      <input type="text" name="userId" class="form-control" required>
    </div>
    <div class="mb-3">
      <label>Password</label>
      <input type="password" name="password" class="form-control" required>
    </div>
    <input type="submit" class="btn btn-success w-100" value="Register">
  </form>
  <p class="text-center mt-3">Already have an account? <a href="login.jsp">Login</a></p>
</div>
<%@ include file="footer.jsp" %>
