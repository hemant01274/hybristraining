<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<template:page pageTitle="${pageTitle}">
	<div id="globalMessages">
		<common:globalMessages />
	</div>

	<b>Hiiisfdadsi</b>
	${Footer}
	
	
	
	<div class=row style ="border:solid 1px black; ">
	<table border="solid 1px">
	<tr>
		<th>Description</th>
		<th>Cost</th>
		<th>Image</th>
		<th>Type</th>
		</tr>
	
	<cms:pageSlot position="giftWrapTypeContentSlot" var="feature"
		element="div">
		<cms:component component="${feature}" />
		<tr>
		<td>${feature.description}</td>
		<td>${feature.cost}</td>
		<td><img src="${feature.productImage.url}" height="200px"; width="200px"></td>
		<td>${feature.giftWrapType}</td>
		</tr>
		
<%-- 		${feature.description}<br> --%>
<%-- 		${feature.cost}<br> --%>
<%-- 		<img src="${feature.productImage.url}" height="200px"; width="200px"><br> --%>
<%-- 		${feature.giftWrapType}<br><br> --%>
		
	</cms:pageSlot>
	
	</table>
	</div>
	${TopHeaderSlot}
</template:page> 
 
