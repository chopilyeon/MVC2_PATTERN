</head>
<body>
	<header>
		<%-- <jsp:include page="/jsp/include/topMenu.jsp" /> --%>
	</header>
	<section>
		<div align="center">
		<hr>
		<h2>전체게시글 조회</h2>
		<hr>
		<br>
		<table border="1" style="width:100%">
			<tr>
				<th width="7%">번호</th>
				<th>제목</th>
				<th width="16%">작성자</th>
				<th width="20%">등록일</th>
			</tr>
			<c:forEach items="${ list }" var="board" varStatus="loop">
				<tr <c:if test="${ loop.count mod 2 eq 0 }">class="even"</c:if>>
					<td>${ board.no }</td>
					<td>
						<a href="${ pageContext.request.contextPath }/board/detail.do?no=${board.no}">
							<c:out value="${ board.title }" />
						</a>
					<%-- 		
						<a href="detail.jsp?no=${ board.no }">
							<c:out value="${ board.title }" />
						</a>
					 --%>	
					</td>
					<td>${ board.writer }</td>
					<td><c:out value="${ board.regDate }" /></td>
				</tr>
			</c:forEach>
		</table>
		<br>
		<c:if test="${ not empty userVO }">
			<button id="addBtn">새글등록</button>
		</c:if>
	</div>
	</section>
	<footer>
		<%-- <%@ include file="/jsp/include/footer.jsp" %> --%>
	</footer>
</body>
</html>











