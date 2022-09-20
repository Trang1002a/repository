<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>
<form method="POST" role="form">
        <input type="hidden" name="action" value="update" />
        <input type="hidden" name="counts" value="0" />
        <legend>Cap nhat danh mục</legend>
      
        <div class="form-group">
          <label for="">ID</label>
          <input type="text" class="form-control" name="id" placeholder="Nhap Id ..." value="${cat.catId}">
        </div>
        <div class="form-group">
          <label for="">Name</label>
          <input type="text" class="form-control" name="name" placeholder="Nhap Name ..." value="${cat.catname}">
        </div>
      
        
      
        <button class="btn btn-primary">Cap nhat</button>
      </form>
<%@include file="../layout/footer.jsp"%>