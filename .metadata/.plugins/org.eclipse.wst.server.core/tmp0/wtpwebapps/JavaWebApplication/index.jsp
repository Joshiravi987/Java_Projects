<%@ include file="header.jsp" %>
<div id="bankCarousel" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="img/loan.JPG" class="d-block w-100" alt="Loans">
      <div class="carousel-caption d-none d-md-block">
        <h5>Home Loans at 8.5%</h5>
        <p>Apply today for lowest rates.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="img/digital banking.jpg" class="d-block w-100" alt="Digital Banking">
      <div class="carousel-caption d-none d-md-block">
        <h5>Digital Banking</h5>
        <p>Bank anytime, anywhere.</p>
      </div>
    </div>
  </div>
</div>

<div class="container mt-5">
  <div class="row">
    <div class="col-md-4">
      <div class="card text-center p-3 shadow">
        <h5>Open Account</h5>
        <p>Start your savings journey.</p>
        <a href="accounts.jsp" class="btn btn-primary">Get Started</a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="card text-center p-3 shadow">
        <h5>Apply Loan</h5>
        <p>Easy loan approval process.</p>
        <a href="loans.jsp" class="btn btn-success">Apply Now</a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="card text-center p-3 shadow">
        <h5>Credit Card</h5>
        <p>Exciting offers and rewards.</p>
        <a href="cards.jsp" class="btn btn-warning">Explore</a>
      </div>
    </div>
  </div>
</div>
<%@ include file="footer.jsp" %>
