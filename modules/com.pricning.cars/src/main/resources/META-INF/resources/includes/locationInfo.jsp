<div class="d-flex flex-column">
  <label for="departments">Departamento</label>
  <select name="departments" id="departments">
    <c:forEach items="${departments}" var="department" >
				<option value="${department}">${department}</option>
			</c:forEach>
  </select>
</div>
