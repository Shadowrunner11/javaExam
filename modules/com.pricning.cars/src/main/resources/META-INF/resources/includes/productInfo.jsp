<div class="d-flex">
  <div class="w-50 d-flex flex-column">
    <label for="models">Selecciona el modelo</label>
		<select class="rounded-pill" id="models" name="carModel">
			<c:forEach items="${modelsNames}" var="modelName" >
				<option value="${modelName}">${modelName}</option>
			</c:forEach>
		</select>
  </div>
  <div class="d-flex w-50 flex-column"">
    <label for="versions">Selecciona la version</label>
		<select class="rounded-pill" id="versions" name="productVersion">
      <c:forEach items="${models}" var="model" >
        <c:forEach items="${model.versiones}" var="version" >
          <option value="${version}" data-model="${model.nombre}">
            ${version}
          </option>
        </c:forEach>
      </c:forEach>
		</select>
  </div>
</div>
<div class="d-flex justify-content-around"">
    <div>
      <input name="clientType" type="radio" value="naturalPerson" id="naturalPerson" />
      <label for="naturalPerson">Persona Natural</label>
    </div>
    <div>
      <input name="clientType" value="enterprise" type="radio" value="enterprise"/>
      <label for="enterprise">Rut empresa</label>
    </div>
</div>
<script>
	const versionContainer = document.querySelector("#versions")

	const versionOptions = Array.from(versionContainer.querySelectorAll("option"))

	const modelsContainer = document.querySelector("#models")

	changeModelHandler(null, modelsContainer.value)

	$("#models")
		.on("change",preventDefaultHOF(changeModelHandler))


	function setVersionFirstValue(currentModel){
		const { value: versionValue } = versionOptions
			.find(version => version.getAttribute('data-model') === currentModel)

		versionContainer.value = versionValue
	}
	
	function changeModelHandler(event, selectedModel){
		const { value = selectedModel } = event?.target ?? {}

		versionOptions.forEach( version => {
			const isModelSelected = version.getAttribute('data-model') === value

			if(!isModelSelected)
				return version.classList.add("hidden")
			
			version.classList.remove("hidden")
		})

		setVersionFirstValue(value)
	}

</script>
