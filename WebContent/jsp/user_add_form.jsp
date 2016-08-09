<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page import="simple.crud.app.service.LinkMap" %>
<%@ page import="java.util.*" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Insert title here</title>
	<style type="text/css">
	    <%@include file="../assets/bootstrap-3.3.7/css/bootstrap.css" %>
	    <%@include file="../assets/bootstrap-3.3.7/css/bootstrap-theme.css" %>
	    <%@include file="../assets/css/styles.css" %>
	</style>
	<!-- <link rel="stylesheet" type="text/css" href="../CrudApp/assets/bootstrap-3.3.7/css/bootstrap.css" />
	<link rel="stylesheet" type="text/css" href="../CrudApp/assets/bootstrap-3.3.7/css/bootstrap-theme.css" />
	<link rel="stylesheet" type="text/css" href="../CrudApp/assets/css/styles.css" />-->
	
	<script src="../CrudApp/assets/js/jquery-2.2.4.js"></script>
	<script src="../CrudApp/assets/bootstrap-3.3.7/js/bootstrap.js"></script>
	<script src="../CrudApp/assets/js/moment.js"></script>
	<script src="../CrudApp/assets/js/bootstrap-datetimepicker.js"></script>
	<script src="../CrudApp/assets/js/jqBootstrapValidation.js"></script>
	<script src="../CrudApp/assets/js/jobportal.app.js"></script>
	
	<!--[if lt IE 9]>
	  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
	
	<%
	String baseUrl = (String)application.getAttribute("baseUrl");
	String assets = (String)application.getAttribute("assets");
	String param2 = (String)application.getAttribute("param1");
	%>
</head>
<body>
	<div class="container">
		<div class="row" id="header">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
				<h3>Header</h3>
			</div>
		</div>
		<div class="row" id="main-body">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
				<div class="row">
					<div class="col-xs-12 col-sm-6 col-md-3 col-lg-3">
						<h3>Left Column</h3>
						<ul>
						<%
						Map<String, LinkMap> links = (HashMap<String, LinkMap>)application.getAttribute("leftLinks");
						Iterator entries = links.entrySet().iterator();
						//Iterator<String, LinkMap> iterator1 = links.iterator();
						while (entries.hasNext()) {
						    Map.Entry entry = (Map.Entry) entries.next();
						    String key = (String)entry.getKey();
						    LinkMap value = (LinkMap)entry.getValue();
						    %> 
						    <li>
								<a href="<%=value.getLink()%>">
									<span><%=value.getDisplayText()%></span>
								</a>
							</li>
							<%
						}
						%>
						</ul>
					</div>
					<div class="col-xs-12 col-sm-6 col-md-9 col-lg-9">
						<h3>Add new user</h3>
						
					</div>
				</div>
			</div>
		</div>
		<div class="row" id="footer">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
				<h3>Footer</h3>
			</div>
		</div>
	</div>
</body>
</html>