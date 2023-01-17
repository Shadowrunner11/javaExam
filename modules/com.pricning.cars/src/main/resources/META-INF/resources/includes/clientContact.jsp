<div class="d-flex flex-column">
    <label for="contacts">Seleccione canal de contacto</label>
    <select name="contacts" id="contacts">
      <c:forEach items="${contacts}" var="contact" >
                  <option value="${contact}">${contact}</option>
              </c:forEach>
    </select>
  </div>