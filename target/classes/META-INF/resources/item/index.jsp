<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>测试</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/layout.min.css">
    <link rel="stylesheet" href="../css/uielement.min.css">
    <script src="../js/jquery.min.js"></script>
    <script src="../js/modernizr.min.js"></script>
    <!--/ END JAVASCRIPT SECTION -->
</head>
<body>
	<!-- Browser Breakpoint -->
	<div class="row">
		<div class="col-lg-12">
			<!-- START panel -->
			<div class="panel panel-default">
				<!-- panel heading/header -->
				<div class="panel-heading">
					<h3 class="panel-title ellipsis">
						<i class="ico-chrome mr5"></i>ebay站点列表
					</h3>
					<!-- panel toolbar -->
					<div class="panel-toolbar text-right">
						<!-- option -->
						<div class="option">
							<button class="btn up" data-toggle="panelcollapse">
								<i class="arrow"></i>
							</button>
							<button class="btn" data-toggle="panelremove"
								data-parent=".col-md-12">
								<i class="remove"></i>
							</button>
						</div>
						<!--/ option -->
					</div>
					<!--/ panel toolbar -->
				</div>
				<!--/ panel heading/header -->
				<!-- panel body with collapse capabale -->
				<div class="table-responsive panel-collapse pull out">
					<table class="table">
						<thead>
							<tr>
								<th>站点id</th>
								<th>中文名</th>
								<th>英文名</th>
							</tr>
						</thead>
						<tbody id="ebaySite">
							
						</tbody>
					</table>
				</div>
				<!--/ panel body with collapse capabale -->
			</div>
			<!--/ END panel -->
		</div>
	</div>
	<!-- Browser Breakpoint -->
	<script type="text/javascript">
	$(function() {
		paypalConfigList();
	});
	function paypalConfigList(){
		console.log('来了')
		$.ajax({
	        type:"get",
	        url:"../ebaySite/getEbaySites",
	        dataType:"json",
	        data:"&id=0",
	        contentType: "application/json",
			cache : false,
	        success:function(data){
	        	console.log(data);
	        	var html= "";
				
	        	html += '<tr>';
    	    	html += '<td>'+data.id+'</td>';
    	    	html += '<td><span class="semibold text-accent">'+data.namecn+'</span></td>';
    	    	html += '<td>'+data.name+'</td>';
    	    	html += '</tr>';
    	    	
    	    	$("#ebaySite").html(html);
	        }
		})
	}
	</script>
</body>
</html>
