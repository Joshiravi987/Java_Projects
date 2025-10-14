<%@ include file="header.jsp" %>
<div class="container mt-4">
  <h2>Contact Us</h2>
  <form class="mt-3">
    <div class="mb-3">
      <label>Name</label>
      <input type="text" class="form-control" required>
    </div>
    <div class="mb-3">
      <label>Email</label>
      <input type="email" class="form-control" required>
    </div>
    <div class="mb-3">
      <label>Message</label>
      <textarea class="form-control" rows="3" required></textarea>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>
<%@ include file="footer.jsp" %>
