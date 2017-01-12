<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
	<h3>Quan Ly Sinh Vien</h3>
	<div class="process">
		<form action="IOServlet" method="post" id="frominfo">
			<div class="row">
				<div class="col-name">Tên</div>
				<div class="col-content">
					<input type="text" id="txtTen" class="info" name="ten" />
				</div>
			</div>
			<div class="row">
				<div class="col-name">Ngay Sinh</div>
				<div class="col-content">
					<input type="text" id="txtNgaySinh" class="info" name="ngaysinh" />
				</div>
			</div>
			<div class="row">
				<div class="col-name">Diem Toan</div>
				<div class="col-content">
					<input type="text" id="dToan" class="info" name="toan" />
				</div>
			</div>
			<div class="row">
				<div class="col-name">Diem Van</div>
				<div class="col-content">
					<input type="text" id="dVan" class="info" name="van" />
				</div>
			</div>
			<div class="row">
				<div class="col-name">Diem Ly</div>
				<div class="col-content">
					<input type="text" id="dLy" class="info" name="ly" />
				</div>
			</div>
			<div class="bt">
				<input type="submit" id="them" class="mybt" value="Save" /> <input
					type="submit" id="cancel" class="mybt" value="Bỏ Qua" />
			</div>
		</form>
	</div>

</body>
</html>